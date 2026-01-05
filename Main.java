package UAS_PBO_Kel1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        LayananPegawai layanan = new LayananPegawai();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=== SISTEM MANAJEMEN PEGAWAI MA'SOEM MART ===");
            System.out.println("1. Tambah Pegawai Tetap");
            System.out.println("2. Tambah Pegawai Kontrak");
            System.out.println("3. Tampil Data Pegawai");
            System.out.println("4. Update Data Pegawai");
            System.out.println("5. Hapus Data Pegawai");
            System.out.println("6. Keluar");
            System.out.print("Pilih: ");

            try {
                pilihan = input.nextInt();
                input.nextLine();

                switch (pilihan) {
                    case 1 :
                        layanan.tambahTetap();
                        break;
                    case 2 :
                        layanan.tambahKontrak();
                        break;
                    case 3 :
                        layanan.tampilData();
                        break;
                    case 4 :
                        layanan.updateData();
                        break;
                    case 5 :
                        layanan.hapusData();
                        break;
                    case 6 :
                        System.out.println("Program selesai.");
                        break;
                    default :
                        System.out.println("Menu tidak tersedia");
                        System.out.println();
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input harus angka!");
                input.nextLine();
                pilihan = 0;
                System.out.println();
            }
        } while (pilihan != 6);
        input.close();
    }
}
