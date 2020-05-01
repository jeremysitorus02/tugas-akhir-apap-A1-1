package com.apap.kel1.koperasi.service;

import com.apap.kel1.koperasi.model.UserModel;

import java.util.List;
import java.util.UUID;

public interface UserService {

    UserModel addUser (UserModel user);
    public String encrypt(String password);
    List<UserModel> getAllUser();

}