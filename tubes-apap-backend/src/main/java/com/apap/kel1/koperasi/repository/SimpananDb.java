package com.apap.kel1.koperasi.repository;

import com.apap.kel1.koperasi.model.SimpananModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SimpananDb extends JpaRepository<SimpananModel, Long>{

    SimpananModel findById(int id);

}