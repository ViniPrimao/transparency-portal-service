package com.conclusion.transparencyPortalService.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "user")
public class UserEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = -949926754118675811L;

    @Id
    private String id;
    private String name;
    private String email;
    private String phone;
    private LocalDateTime createdDate;
    private String region;
    private String address;
    private String createdBy;
}
