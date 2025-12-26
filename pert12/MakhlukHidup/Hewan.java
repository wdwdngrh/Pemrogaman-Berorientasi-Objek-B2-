
/**
 * Write a description of class Hewan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hewan extends MakhlukHidup {

    public Hewan(String nama){
        super(nama);
    }

    @Override
    public void bernafas(){
        System.out.println(getNama() + " bernafas menggunakan paru-paru atau insang.");
    }

    @Override
    public void berkembangBiak(){
        System.out.println(getNama() + " berkembang biak secara bertelur atau melahirkan.");
    }
}
