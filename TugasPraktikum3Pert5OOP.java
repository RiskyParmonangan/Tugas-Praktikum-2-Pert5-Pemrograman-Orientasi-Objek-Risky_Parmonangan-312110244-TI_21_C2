package tugas.praktikum.pkg3.pert.pkg5.oop;

public class TugasPraktikum3Pert5OOP {

    public static void main(String[] args) {
       
       Person Anton  = new Person ();
    
    Anton.setNama("Anton");
    Anton.setJenisKelamin("Pria");
    Anton.setUmur(18);
    System.out.println("Nama         : " + Anton.getNama());
    System.out.println("JenisKelamin : " + Anton.getJenisKelamin());
    System.out.println("Umur         : " + Anton.getUmur());
    System.out.println("                       ");
    
       Person Riko = new Person ();
    
    Riko.setNama("Riko");
    Riko.setJenisKelamin("Pria");
    Riko.setUmur(18);
    System.out.println("Nama         : " + Riko.getNama());
    System.out.println("JenisKelamin : " + Riko.getJenisKelamin());
    System.out.println("Umur         : " + Riko.getUmur());
    
    }
    }
