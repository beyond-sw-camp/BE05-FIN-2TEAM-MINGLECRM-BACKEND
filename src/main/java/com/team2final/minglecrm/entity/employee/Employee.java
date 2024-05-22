package com.team2final.minglecrm.entity.employee;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    private String name;

    private String email;

    private String password;

    private String authority;

    private LocalDateTime createdDate;

    private Boolean isValid;

    private Boolean isDeleted;

    @Builder
    public Employee(String name, String email, String password, String authority,
            Boolean isDeleted) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.authority = authority;
        this.isDeleted = false;
    }


    public void setName(String name) {
        this.name = name;
    }
}
