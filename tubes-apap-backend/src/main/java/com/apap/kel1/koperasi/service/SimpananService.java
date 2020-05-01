package com.apap.kel1.koperasi.service;

import com.apap.kel1.koperasi.model.SimpananModel;

import java.util.List;

public interface SimpananService {

    SimpananModel addSimpanan (SimpananModel simpanan);

    SimpananModel getSimpananById (int id);

    List<SimpananModel> getAllSimpanan();
}