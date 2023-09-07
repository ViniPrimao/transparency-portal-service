package com.conclusion.transparencyPortalService.service;

import com.conclusion.transparencyPortalService.dto.SupplyDTO;
import com.conclusion.transparencyPortalService.mapper.SupplyDTOMapper;
import com.conclusion.transparencyPortalService.repository.SupplyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SupplyService {

    private final SupplyRepository supplyRepository;

    private final SupplyDTOMapper supplyDTOMapper;

    public List<SupplyDTO> findAll() {
        return supplyDTOMapper.mapList(supplyRepository.findAll());
    }
}
