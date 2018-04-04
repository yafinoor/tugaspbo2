package tugaspbo2;

public class volumekubus {
 double sisi;

    public volumekubus() {
        sisi=10;
    }

    public volumekubus(double sisi) {
        this.sisi = sisi;
    }
 
 
 void cetakinfo(){
     System.out.println("=====================");
     System.out.println("Sisi : "+sisi);
     System.out.println("=====================");
  }
 
 double hitungvolume(){
     double volume;
     volume=sisi*sisi*sisi;
     return volume;
 }
 
 void cetakvolume(){
     System.out.println("Hasil isi volume adalah :"+hitungvolume());
 }
}
