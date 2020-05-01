package com.apap.kel1.koperasi.model;


import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "simpanan")
public class SimpananModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Column(name = "tanggal_setor", nullable = false)
    private Date tanggal_setor;

    @NotNull
    @Column(name = "jumlah", nullable = false)
    private int jumlah;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_jenis_simpanan", referencedColumnName = "id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private JenisSimpananModel jenis_simpanan;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_anggota_penyetor", referencedColumnName = "id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private AnggotaModel anggota_penyetor;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_anggota_penerima", referencedColumnName = "id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private AnggotaModel anggota_penerima;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTanggal_setor() {
        return tanggal_setor;
    }

    public void setTanggal_setor(Date tanggal_setor) {
        this.tanggal_setor = tanggal_setor;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public JenisSimpananModel getJenis_simpanan() {
        return jenis_simpanan;
    }

    public void setJenis_simpanan(JenisSimpananModel jenis_simpanan) {
        this.jenis_simpanan = jenis_simpanan;
    }

    public AnggotaModel getAnggota_penyetor() {
        return anggota_penyetor;
    }

    public void setAnggota_penyetor(AnggotaModel anggota_penyetor) {
        this.anggota_penyetor = anggota_penyetor;
    }

    public AnggotaModel getAnggota_penerima() {
        return anggota_penerima;
    }

    public void setAnggota_penerima(AnggotaModel anggota_penerima) {
        this.anggota_penerima = anggota_penerima;
    }
}