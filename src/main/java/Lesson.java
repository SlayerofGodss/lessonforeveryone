public class Lesson {
    public static void main(String[] args) {

        int syc = 0;
        for(int sayi=2;sayi<=1000000;sayi++)
        {
            int kontrol = 0;
            for (int i = 2; i < sayi; i++)
            {
                if (sayi % i == 0)
                {
                    kontrol = 1;
                    break;
                }
            }

            if(kontrol==0)
            {
                System.out.print(sayi+"\n");
                syc++;
            }
        }
    }
}
