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
public class UserDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 4906151959797599174L;

    private String id;
    private String name;
    private String email;
    private String phone;
    private LocalDateTime createdDate;
    private String region;
    private String address;
    private String createdBy;
}
