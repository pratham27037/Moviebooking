package com.pratham.user.service.services;

import com.pratham.user.service.entities.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> getallUser();
    User getUser(String userId);
}
