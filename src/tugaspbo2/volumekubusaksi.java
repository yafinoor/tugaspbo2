package tugaspbo2;

public class volumekubusaksi {
    public static void main(String[] args) {
        volumekubus n1 = new volumekubus();
        n1.sisi = 10;
        
        n1.cetakinfo();
        System.out.println("isi volume : "+n1.hitungvolume());
        n1.cetakvolume();
        
        volumekubus n2 = new volumekubus();
        n2.cetakinfo();
        
        volumekubus n3 = new volumekubus(8);
        n3.cetakinfo();
    }
}
