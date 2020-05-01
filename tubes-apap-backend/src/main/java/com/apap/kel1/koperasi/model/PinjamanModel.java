package com.apap.kel1.koperasi.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "pinjaman")
public class PinjamanModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Column(name = "tanggal_pengajuan", nullable = false)
    private Date tanggal_pengajuan;

    @NotNull
    @Column(name = "tanggal_disejutui", nullable = false)
    private Date tanggal_disetujui;

    @NotNull
    @Column(name = "tanggal_pengembalian", nullable = false)
    private Date tanggal_pengembalian;

    @NotNull
    @Column(name = "jumlah_pinjaman", nullable = false)
    private int jumlah_pinjaman;

    @NotNull
    @Column(name = "jumlah_pengembalian", nullable = false)
    private int jumlah_pengembalian;

    @NotNull
    @Column(name = "status", nullable = false)
    private int status;

    // tambah id anggota dari anggota Model
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_anggota", referencedColumnName = "id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    // @JsonIgnore
    private AnggotaModel anggota;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTanggal_pengajuan() {
        return tanggal_pengajuan;
    }

    public void setTanggal_pengajuan(Date tanggal_pengajuan) {
        this.tanggal_pengajuan = tanggal_pengajuan;
    }

    public Date getTanggal_disetujui() {
        return tanggal_disetujui;
    }

    public void setTanggal_disetujui(Date tanggal_disetujui) {
        this.tanggal_disetujui = tanggal_disetujui;
    }

    public Date getTanggal_pengembalian() {
        return tanggal_pengembalian;
    }

    public void setTanggal_pengembalian(Date tanggal_pengembalian) {
        this.tanggal_pengembalian = tanggal_pengembalian;
    }

    public int getJumlah_pinjaman() {
        return jumlah_pinjaman;
    }

    public void setJumlah_pinjaman(int jumlah_pinjaman) {
        this.jumlah_pinjaman = jumlah_pinjaman;
    }

    public int getJumlah_pengembalian() {
        return jumlah_pengembalian;
    }

    public void setJumlah_pengembalian(int jumlah_pengembalian) {
        this.jumlah_pengembalian = jumlah_pengembalian;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public AnggotaModel getAnggota() {
        return anggota;
    }

    public void setAnggota(AnggotaModel anggota) {
        this.anggota = anggota;
    }
}