
/**
 * Write a description of class FRSItem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FRSItem
{
    // instance variables - replace the example below with your own
    private MataKuliah matkul;
    private Dosen dosen;
    /**
     * Constructor for objects of class FRSItem
     */
    public FRSItem(MataKuliah matkul, Dosen dosen){
        this.matkul = matkul;
        this.dosen = dosen;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public MataKuliah getMatkul(){ 
        return matkul; 
    }
    public Dosen getDosen(){ 
        return dosen; 
    }

    public String toString(){
        return matkul.getKode() + " - " + matkul.getNama() + " (" + matkul.getSks() + " SKS)"
               + " | Dosen: " + dosen.getNama();
    }
}
