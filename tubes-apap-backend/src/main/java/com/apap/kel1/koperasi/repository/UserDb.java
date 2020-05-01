package com.apap.kel1.koperasi.repository;

import com.apap.kel1.koperasi.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDb extends JpaRepository<UserModel, Long>{
    UserModel findByUsername(String username);
}