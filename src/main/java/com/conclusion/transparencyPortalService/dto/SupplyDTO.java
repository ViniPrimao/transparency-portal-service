package com.conclusion.transparencyPortalService.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class SupplyDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 6378613874013303576L;

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