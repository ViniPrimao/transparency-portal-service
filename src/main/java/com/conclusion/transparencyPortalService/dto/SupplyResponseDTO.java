package com.conclusion.transparencyPortalService.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SupplyResponseDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 6378613874013303126L;

    private List<SupplyDTO> supplyDTO;
}