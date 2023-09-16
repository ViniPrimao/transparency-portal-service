package com.conclusion.transparencyPortalService.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "supply")
public class SupplyEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 4470405905296977788L;

    @Id
    private ObjectId _id;
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