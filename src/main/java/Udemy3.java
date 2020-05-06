public class Udemy3 {
    public static void main(String[] args){
        String [] [] sehirler =new String[3][3];

        sehirler [0] [0] = "İstambul";
        sehirler [0] [1] = "Bursa";
        sehirler [0] [2] = "Çanakkale";
        sehirler [1] [0] = "Tekirdağ";
        sehirler [1] [1] = "Malatya";
        sehirler [1] [2] = "Bolu";
        sehirler [2] [0] = "İzmir";
        sehirler [2] [1] = "Antep";
        sehirler [2] [2] = "Muş";
        for (int i = 0; i<=2;i++){
            System.out.println("-------------");
            for (int j=0; j<=2;j++)
            System.out.println(sehirler[i] [j]);
        }
    }
}
