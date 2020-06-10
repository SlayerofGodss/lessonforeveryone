package main;
public class Vasita {
    String renk ="Mavi";
    String vitesturu;
    public void MotoruCalistir(){
        System.out.println("Motor Çalışıyor: ");
    }
}
class otomobil extends Vasita{
    String kasaTipi;
}
class anaPrg{
    public static void main(String[] args ){
        otomobil oto1 = new otomobil();
        oto1.vitesturu="Manuel";
        oto1.kasaTipi="Sedan";
        System.out.println("Rengi: "+oto1.renk);
        System.out.println("Kasa Tipi: "+oto1.kasaTipi);
        System.out.println("Vites: "+oto1.vitesturu);
        oto1.MotoruCalistir();
    }
}