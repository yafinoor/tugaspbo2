package tugaspbo2;

public class rectangleaksi {
    public static void main(String[] args) {
        rectangle rl = new rectangle ();
        rl.panjang = 9;
        rl.lebar = 4;
        
        rl.cetakinfo();
        System.out.println("luas rectangle = "+rl.hitungluas());
        rl.cetakluas();
        
        rectangle r2 = new rectangle();
        r2.cetakinfo();
        
        rectangle r3 = new rectangle(50,30);
        r3.cetakinfo();
        
    }
   
}
