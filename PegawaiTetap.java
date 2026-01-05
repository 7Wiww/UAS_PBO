package UAS_PBO_Kel1;

public class PegawaiTetap extends Pegawai {

    public PegawaiTetap(String nama, String nip, String jabatan, double gajiPokok) {
        super(nama, nip, jabatan, gajiPokok);
    }

    @Override
    public double hitungGaji() {
        return getGajiPokok() + (getGajiPokok() * 0.1);
    }
}
