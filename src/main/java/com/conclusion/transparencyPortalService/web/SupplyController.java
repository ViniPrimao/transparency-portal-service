package com.conclusion.transparencyPortalService.web;

import com.conclusion.transparencyPortalService.dto.SupplyDTO;
import com.conclusion.transparencyPortalService.service.SupplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SupplyController {

    private final SupplyService supplyService;

    @GetMapping
    public List<SupplyDTO> findAll() {
        return supplyService.findAll();
    }

}
