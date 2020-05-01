package com.apap.kel1.koperasi.controller;

import com.apap.kel1.koperasi.model.AnggotaModel;
import com.apap.kel1.koperasi.service.AnggotaService;
import com.apap.kel1.koperasi.service.AnggotaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnggotaController {

    @Autowired
    private AnggotaServiceImpl anggotaService;

    @GetMapping(value = "/anggota/{anggota}")
    public List<AnggotaModel> getAllAnggota(@PathVariable String name) {
        return anggotaService.findAll();
    }
}