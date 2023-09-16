package com.conclusion.transparencyPortalService.service;

import com.conclusion.transparencyPortalService.dto.SupplyDTO;
import com.conclusion.transparencyPortalService.dto.SupplyResponseDTO;
import com.conclusion.transparencyPortalService.entity.SupplyEntity;
import com.conclusion.transparencyPortalService.mapper.SupplyDTOMapper;
import com.conclusion.transparencyPortalService.mapper.SupplyEntityMapper;
import com.conclusion.transparencyPortalService.repository.SupplyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

@Service
@RequiredArgsConstructor
public class SupplyService {

    private final SupplyRepository supplyRepository;

    private final SupplyEntityMapper supplyEntityMapper;

    private final SupplyDTOMapper supplyDTOMapper;

    private final BlockchainService blockchainService;

    public List<SupplyResponseDTO> findAll() {
        List<SupplyDTO> supplies = supplyDTOMapper.mapList(supplyRepository.findAll());

        Map<String, List<SupplyDTO>> groupedSupplies = supplies.stream()
                .collect(groupingBy(SupplyDTO::getNodeId));

        List<SupplyResponseDTO> result = new ArrayList<>();
        for (Map.Entry<String, List<SupplyDTO>> entry : groupedSupplies.entrySet()) {
            SupplyResponseDTO responseDTO = new SupplyResponseDTO();
            responseDTO.setSupplyDTO(entry.getValue());
            result.add(responseDTO);
        }

        return result;
    }

    public void save(SupplyDTO request) {
        SupplyEntity entity = supplyEntityMapper.map(request);

        entity = blockchainService.chainManager(entity);

        supplyRepository.save(entity);
    }
}
