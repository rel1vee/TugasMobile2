package com.example.latihanrecyclerview;

public class Mahasiswa {
    private final String nama;
    private final String nim;
    private final int foto;

    public Mahasiswa(String nama, String nim, int foto) {
        this.nama = nama;
        this.nim = nim;
        this.foto = foto;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public int getFoto() {
        return foto;
    }
}
