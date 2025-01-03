package com.pratham.user.service.entities;

import jakarta.persistence.*;
import lombok.*;

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
    @Column(name = "Mobile-number")
    private int number;

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
