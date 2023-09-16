package com.conclusion.transparencyPortalService.service;

import com.conclusion.transparencyPortalService.entity.SupplyEntity;
import com.conclusion.transparencyPortalService.repository.SupplyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static java.util.Objects.nonNull;
import static java.util.UUID.randomUUID;

@Service
@RequiredArgsConstructor
public class BlockchainService {

    private final SupplyRepository supplyRepository;

    public SupplyEntity chainManager(SupplyEntity entity) {

        SupplyEntity entityOnDatabase = supplyRepository.findAllByNodeId(String.valueOf(entity.getNodeId()))
                .stream()
                .findFirst()
                .orElse(null);

        if (nonNull(entityOnDatabase)) {
            entity.setNodeId(entityOnDatabase.getNodeId());
            entity.setChainId(genChainId());
            entity.set_id(null);

            return entity;
        }

        entity.setNodeId(genNodeId());
        entity.setChainId(genChainId());

        return entity;
    }

    private String genChainId() {
        return randomUUID().toString();
    }

    private String genNodeId() {
        return randomUUID().toString();
    }
}
