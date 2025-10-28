import java.util.ArrayList;
/**
 * Write a description of class MataKuliah here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MataKuliah
{
    // instance variables - replace the example below with your own
    private String kode;
    private String nama;
    private int sks;
    private ArrayList<Dosen> dosenPengampu;

    /**
     * Constructor for objects of class MataKuliah
     */
    public MataKuliah(String kode, String nama, int sks){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.dosenPengampu = new ArrayList<>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void tambahDosen(Dosen d){
        dosenPengampu.add(d);
    }

    public String getKode(){ 
        return kode; 
    }
    public String getNama(){ 
        return nama; 
    }
    public int getSks(){ 
        return sks; 
    }
    public ArrayList<Dosen> getDosenPengampu(){ 
        return dosenPengampu; 
    }

    public String toString(){
        return kode + " - " + nama + " (" + sks + " SKS)";
    }
}
