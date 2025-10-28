import java.util.ArrayList;
/**
 * Write a description of class Mahasiswa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mahasiswa
{
    // instance variables - replace the example below with your own
    private String nama;
    private String nrp;
    private ArrayList<FRSItem> frs;
    /**
     * Constructor for objects of class Mahasiswa
     */
    public Mahasiswa(String nama, String nim){
        this.nama = nama;
        this.nrp = nim;
        this.frs = new ArrayList<>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void ambilMatkul(MataKuliah matkul, Dosen dosen){
        FRSItem item = new FRSItem(matkul, dosen);
        if(!frs.contains(item)){  
            frs.add(item);
            System.out.println(nama + " berhasil mengambil " + matkul.getNama() + " dengan " + dosen.getNama());
        } 
        else{
            System.out.println("Mata kuliah sudah diambil!");
        }
    }

    public void tampilkanFRS(){
        System.out.println("\nFRS " + nama + " (" + nrp + "):");
        for (FRSItem item : frs) {
            System.out.println("- " + item);
        }
    }
}
