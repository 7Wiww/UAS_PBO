package UAS_PBO_Kel1;

public class PegawaiKontrak extends Pegawai {
    private int jumlahHariKerja;

    public PegawaiKontrak(String nama, String nip, String jabatan, double gajiPokok, int hariKerja) {
        super(nama, nip, jabatan, gajiPokok);
        this.jumlahHariKerja = hariKerja;
    }

    @Override
    public double hitungGaji() {
        return getGajiPokok() + (jumlahHariKerja * 10000);
    }
}
