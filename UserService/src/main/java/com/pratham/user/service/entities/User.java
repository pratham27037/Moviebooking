package com.pratham.user.service.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user_data")
public class User {

    @Id
    @Column(name = "ID")
    private String userId;
    @Column(name="Name",length = 20)
    private String name;
    @Column(name = "Email")
    private String email;
    @Column(name = "About")
    private String about;
}
