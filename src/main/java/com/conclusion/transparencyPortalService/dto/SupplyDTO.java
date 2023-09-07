package com.conclusion.transparencyPortalService.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SupplyDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 6378613874013303576L;

    private String id;
    private String supplyName;
    private Double supplyValue;
    private LocalDateTime lastUpdateDate;
    private LocalDateTime createdDate;
    private String nodeId;
    private String chainId;
    private String fromPlace;
    private String toPlace;
    private String updateBy;
    private String destiny;
    private boolean arrived;

}