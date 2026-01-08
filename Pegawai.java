/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS_PBO_Kel1;

/**
 *
 * @author mnawa
 */
import java.text.DecimalFormat;

public abstract class Pegawai {
    private String nama;
    private String nip;
    private String jabatan;
    private double gajiPokok;

    public Pegawai(String nama, String nip, String jabatan, double gajiPokok) {
        this.nama = nama;
        this.nip = nip;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }   

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getNip() {
        return nip;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public abstract double hitungGaji();

    public void tampilInfo() {
        DecimalFormat df = new DecimalFormat("Rp");

        System.out.println("----------------------------");
        System.out.println("NIP        : " + nip);
        System.out.println("Nama       : " + nama);
        System.out.println("Jabatan    : " + jabatan);
        System.out.println("Gaji Pokok : " + df.format(gajiPokok));
        System.out.println("Gaji Bersih: " + df.format(hitungGaji()));
        System.out.println("----------------------------");
        System.out.println();
    }
}
