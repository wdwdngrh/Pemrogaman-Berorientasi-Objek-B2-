
/**
 * Write a description of class Mobil here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mobil extends Kendaraan {
    private int jumlahRoda;

    public Mobil(String merk, String model, int tahunProduksi, int jumlahRoda) {
        super(merk, model, tahunProduksi);
        this.jumlahRoda = jumlahRoda;
    }

    @Override
    public String getInfo() {
        return "Mobil: " + super.getInfo() + ", Roda: " + jumlahRoda;
    }
}
