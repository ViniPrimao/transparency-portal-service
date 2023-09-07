package com.conclusion.transparencyPortalService.service;

import com.conclusion.transparencyPortalService.dto.SupplyDTO;
import com.conclusion.transparencyPortalService.entity.SupplyEntity;
import com.conclusion.transparencyPortalService.repository.SupplyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BlockchainService {

    private final SupplyRepository supplyRepository;

    public SupplyEntity chainManager(SupplyEntity entity) {

        return entity;
    }

}
