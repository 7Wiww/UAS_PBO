/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS_PBO_Kel1;

/**
 *
 * @author mnawa
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class LayananPegawai {
    private ArrayList<Pegawai> data = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public void tambahTetap() {
        try {
            System.out.println();
            System.out.println("--- Tambah Data Pegawai Tetap ---");
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("NIP: ");
            String nip = input.nextLine();
            System.out.print("Jabatan: ");
            String jabatan = input.nextLine();
            System.out.print("Gaji Pokok: ");
            double gaji = input.nextDouble(); 
            
            input.nextLine();

            data.add(new PegawaiTetap(nama, nip, jabatan, gaji));
            System.out.println("Data pegawai tetap berhasil ditambahkan");
            System.out.println();
        } catch (InputMismatchException e) {
            System.out.println("Input gaji harus angka!");
            System.out.println();
            input.nextLine();
        }
    }

    public void tambahKontrak() {
        try {
            System.out.println();
            System.out.println("--- Tambah Data Pegawai Kontrak ---");
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("NIP: ");
            String nip = input.nextLine();
            System.out.print("Jabatan: ");
            String jabatan = input.nextLine();
            System.out.print("Gaji Pokok: ");
            double gaji = input.nextDouble();
            System.out.print("Hari Kerja: ");
            int hari = input.nextInt(); 
            
            input.nextLine();

            data.add(new PegawaiKontrak(nama, nip, jabatan, gaji, hari));
            System.out.println("Data pegawai kontrak berhasil ditambahkan");
            System.out.println();
        } catch (InputMismatchException e) {
            System.out.println("Input harus berupa angka!");
            System.out.println();
            input.nextLine();
        }
    }

    public void tampilData() {
        System.out.println();
        System.out.println("--- Daftar Pegawai Ma'soem Mart ---");
        if (data.isEmpty()) {
            System.out.println("Data masih kosong.");
            System.out.println();
        }

        for (Pegawai pgw : data) {
            pgw.tampilInfo();
        }
    }

    public void updateData() {
        System.out.println();
        System.out.println("--- Update Data Pegawai Ma'soem Mart ---");
        System.out.print("Masukkan NIP pegawai yang akan diupdate: ");
        String nip = input.nextLine();
        
        boolean ditemukan = false;

        for (Pegawai pgw : data) {
            if (pgw.getNip().equals(nip)) {
                try {
                    System.out.print("Nama baru: ");
                    String nama = input.nextLine();
                    System.out.print("Jabatan baru: ");
                    String jabatan = input.nextLine();
                    System.out.print("Gaji Pokok baru: ");
                    double gaji = input.nextDouble();
                    input.nextLine();

                    pgw.setNama(nama);
                    pgw.setJabatan(jabatan);
                    pgw.setGajiPokok(gaji);

                    System.out.println("Data berhasil diperbarui!");
                    System.out.println();
                } catch (InputMismatchException e) {
                    System.out.println("Input gaji harus angka!");
                    System.out.println();
                    input.nextLine();
                }
                break;
            } 
            if (!ditemukan) {
                System.out.println("Pegawai dengan NIP tersebut tidak ditemukan.");
                System.out.println();
            }
        }
    }

    public void hapusData() {
        System.out.println();
        System.out.println("--- Hapus Data Pegawai Ma'soem Mart ---");
        System.out.print("Masukkan NIP: ");
        String nip = input.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getNip().equals(nip)) {
                data.remove(i);
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Data berhasil dihapus");
            System.out.println();
        } else {
            System.out.println("Data dengan NIP tersebut tidak ditemukan");
            System.out.println();
        }
    }
}
