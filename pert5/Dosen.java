
/**
 * Write a description of class dosen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dosen
{
    // instance variables - replace the example below with your own
    private String nama;
    private String nip;

    /**
     * Constructor for objects of class dosen
     */
    public Dosen(String nama, String nip){
        this.nama = nama;
        this.nip = nip;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getNama(){ 
        return nama; 
    }
    public String getNip(){ 
        return nip; 
    }

    public String toString(){
        return nama + " (NIP: " + nip + ")";
    }
}
