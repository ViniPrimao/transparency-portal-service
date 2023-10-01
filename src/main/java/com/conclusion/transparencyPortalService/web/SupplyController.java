package com.conclusion.transparencyPortalService.web;

import com.conclusion.transparencyPortalService.dto.SupplyDTO;
import com.conclusion.transparencyPortalService.dto.SupplyResponseDTO;
import com.conclusion.transparencyPortalService.service.SupplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequiredArgsConstructor
public class SupplyController {

    private final SupplyService supplyService;

    @GetMapping
    @CrossOrigin(origins = "http://localhost:4200/")
    @ResponseStatus(OK)
    public List<SupplyResponseDTO> findAll() {
        return supplyService.findAll();
    }

    @GetMapping("/nodes")
    @CrossOrigin(origins = "http://localhost:4200/")
    @ResponseStatus(OK)
    public List<SupplyResponseDTO> findNodes() {
        return supplyService.findNodes();
    }

    @PostMapping
    @CrossOrigin(origins = "http://localhost:4200/")
    @ResponseStatus(CREATED)
    public void save(@RequestBody SupplyDTO request) {
        supplyService.save(request);
    }

}
