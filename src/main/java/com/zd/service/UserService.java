package com.zd.service;

import com.zd.po.User;


public interface UserService {

    User checkUser(String username, String password);
}
