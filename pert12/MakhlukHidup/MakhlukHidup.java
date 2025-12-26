
/**
 * Write a description of class MahklukHidup here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class MakhlukHidup {
    
    private String nama;

    public MakhlukHidup(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    // Method abstract (harus di-override)
    public abstract void bernafas();
    public abstract void berkembangBiak();

    // Method non-abstract
    public void info(){
        System.out.println("Saya adalah makhluk hidup bernama " + nama);
    }
}
