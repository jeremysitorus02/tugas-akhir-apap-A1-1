package com.apap.kel1.koperasi.service;


import com.apap.kel1.koperasi.model.PinjamanModel;

import java.util.List;

public interface PinjamanService {

    PinjamanModel addPinjaman (PinjamanModel pinjaman);

    List<PinjamanModel> getAllPinjaman();

    PinjamanModel getPinjamanById (int id);

}