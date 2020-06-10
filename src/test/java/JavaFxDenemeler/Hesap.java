package JavaFxDenemeler;

public class Hesap {
    static void kare(int x){
        System.out.println("Tam Sayı Kare: "+x*x);
    }
    static void kare(double x){
        System.out.println("Ondalıklı Kare: "+x*x);
    }
    public static void main(String[] args){
      kare(2.5);
    }

}
