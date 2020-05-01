package com.apap.kel1.koperasi.service;


import com.apap.kel1.koperasi.model.AnggotaModel;
import com.apap.kel1.koperasi.repository.AnggotaDb;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

@Service
@Transactional
public class AnggotaServiceImpl implements AnggotaService {

    @Autowired
    private AnggotaDb anggotaDb;

    public AnggotaServiceImpl() throws ParseException {
    }

    @Override
    public AnggotaModel addAnggota(AnggotaModel anggota) {
        return anggotaDb.save(anggota);
    }

    @Override
    public AnggotaModel getAnggotaById(int id) {
        return anggotaDb.findById(id);
    }

    @Override
    public AnggotaModel getAnggotaByNia(String nia) {
        return anggotaDb.findByNia(nia);
    }

    public static List<AnggotaModel> anggota = new ArrayList<>();
    private static long id = 0;
    String sDate1="31/12/1998";
    Date tgl_lhr = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
    static{
        anggota.add(new AnggotaModel(++id,"151357185","Andhika Brosnan","81578135718","Bandung",null,"Jalan auifhaufa","7518735190",true,null));
        anggota.add(new AnggotaModel(++id,"151357185","Andhika Brosnan","81578135718","Bandung",null,"Jalan auifhaufa","7518735190",true,null));
        anggota.add(new AnggotaModel(++id,"151357185","Andhika Brosnan","81578135718","Bandung",null,"Jalan auifhaufa","7518735190",true,null));
    }

    public List<AnggotaModel> findAll(){
        return anggota;
    }
}