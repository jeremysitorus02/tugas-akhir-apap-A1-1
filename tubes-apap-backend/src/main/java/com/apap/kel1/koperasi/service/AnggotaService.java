package com.apap.kel1.koperasi.service;

import com.apap.kel1.koperasi.model.AnggotaModel;

import java.util.ArrayList;
import java.util.List;

public interface AnggotaService {

    AnggotaModel addAnggota(AnggotaModel anggota);


    AnggotaModel getAnggotaById (int id);

    AnggotaModel getAnggotaByNia (String nia);
}