package com.conclusion.transparencyPortalService.service;

import com.conclusion.transparencyPortalService.dto.SupplyDTO;
import com.conclusion.transparencyPortalService.dto.SupplyResponseDTO;
import com.conclusion.transparencyPortalService.entity.SupplyEntity;
import com.conclusion.transparencyPortalService.mapper.SupplyDTOMapper;
import com.conclusion.transparencyPortalService.mapper.SupplyEntityMapper;
import com.conclusion.transparencyPortalService.repository.SupplyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

import static java.time.LocalDateTime.now;
import static java.util.Collections.singletonList;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

@Service
@RequiredArgsConstructor
public class SupplyService {

    private final SupplyRepository supplyRepository;

    private final SupplyEntityMapper supplyEntityMapper;

    private final SupplyDTOMapper supplyDTOMapper;

    private final BlockchainService blockchainService;

    public List<SupplyResponseDTO> findAll() {
        List<SupplyDTO> supplies = supplyDTOMapper.mapList(supplyRepository.findAll());

        Map<String, List<SupplyDTO>> groupedSupplies = new HashMap<>();

        supplies.forEach(supply -> {
            String nodeId = supply.getNodeId();
            groupedSupplies.computeIfAbsent(nodeId, k -> new ArrayList<>()).add(supply);
        });

        List<SupplyResponseDTO> result = new ArrayList<>();

        groupedSupplies.forEach((nodeId, supplyList) -> {
            SupplyResponseDTO responseDTO = new SupplyResponseDTO();
            responseDTO.setSupplyDTO(supplyList);
            result.add(responseDTO);
        });

        return result;
    }

    public List<SupplyResponseDTO> findNodes() {
        List<SupplyDTO> supplies = supplyDTOMapper.mapList(supplyRepository.findAll());

        Map<String, SupplyDTO> lastSuppliesByNodeId = new HashMap<>();
        List<SupplyResponseDTO> result = new ArrayList<>();

        supplies.forEach(supply -> {
            String nodeId = supply.getNodeId();
            lastSuppliesByNodeId.put(nodeId, supply); // Update the last supply for this nodeId
        });

        lastSuppliesByNodeId.forEach((nodeId, lastSupply) -> {
            SupplyResponseDTO responseDTO = new SupplyResponseDTO();
            responseDTO.setSupplyDTO(Collections.singletonList(lastSupply));
            result.add(responseDTO);
        });

        return result;
    }

    public void save(SupplyDTO request) {
        SupplyEntity entity = supplyEntityMapper.map(request);

        entity = blockchainService.chainManager(entity);

        entity.setLastUpdateDate(now());
        entity.setCreatedDate(now());

        supplyRepository.save(entity);
    }
}
