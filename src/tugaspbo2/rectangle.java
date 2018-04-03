package tugaspbo2;
public class rectangle {
    double panjang;
    double lebar;

    public rectangle() {
        panjang=5;
        lebar=2;
    }

    public rectangle(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    
      
    void cetakinfo() {
        System.out.println("======================");
        System.out.println("panjang : "+panjang);
        System.out.println("lebar   : "+lebar);
        System.out.println("======================");
    }
    
    double hitungluas(){
        double luas;
        luas=panjang*lebar;
        return luas;
    }
    
    void cetakluas(){
        System.out.println("luasnya adalah: "+hitungluas());
    }
}
