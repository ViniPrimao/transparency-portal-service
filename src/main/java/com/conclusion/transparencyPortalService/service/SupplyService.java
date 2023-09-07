package com.conclusion.transparencyPortalService.service;

import com.conclusion.transparencyPortalService.dto.SupplyDTO;
import com.conclusion.transparencyPortalService.entity.SupplyEntity;
import com.conclusion.transparencyPortalService.mapper.SupplyDTOMapper;
import com.conclusion.transparencyPortalService.mapper.SupplyEntityMapper;
import com.conclusion.transparencyPortalService.repository.SupplyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SupplyService {

    private final SupplyRepository supplyRepository;

    private final SupplyEntityMapper supplyEntityMapper;

    private final SupplyDTOMapper supplyDTOMapper;

    private final BlockchainService blockchainService;

    public List<SupplyDTO> findAll() {
        return supplyDTOMapper.mapList(supplyRepository.findAll());
    }

    public void save(SupplyDTO request) {
        SupplyEntity entity = supplyEntityMapper.map(request);

        entity = blockchainService.chainManager(entity);

        supplyRepository.save(entity);
    }
}
