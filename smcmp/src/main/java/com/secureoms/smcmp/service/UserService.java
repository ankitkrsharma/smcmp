package com.secureoms.smcmp.service;

import com.secureoms.smcmp.entity.User;

public interface UserService {

    User registerUser(User user);

    User findByUsername(String username);
}
