public class MiniProje1 {
    public static void main(String[] args){
        int number = 25;
        int remeinder = number % 2;
        //System.out.println(remeinder);
        boolean isPrime = true;
        if (number==1){
            System.out.println("Dostum Sayı Asal Değil.");
            return;
        }

        if (number<1){
            System.out.println("Sayı Gçersiz");
        }


        if (number<2){
            System.out.println("Düzgün Bir sayı Gir");
        }


        for (int i=2; i<number;i++){
            if (number % i == 0){
                isPrime = false;
            }
        }
        if (isPrime){
            System.out.println("Sayı Asaldır");
        } else {
            System.out.println("Sayı asal değildir");
        }
    }


}
