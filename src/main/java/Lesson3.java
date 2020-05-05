import java.util.ArrayList;
import java.util.List;

public class Lesson3 {

    List<Node> result1 = new ArrayList<Node>();

    public void listetara(){
        agactarama(result1);
    }

    public static void main(String[] args) {

        Lesson3 lesson3 = new Lesson3();
        lesson3.listehazırla();
        lesson3.listetara();
    }

    public void listehazırla(){
        Node n1 = new Node();
        n1.setIsim("N1");

        Node n2 = new Node();
        n2.setIsim("N2");




        Node n3 = new Node();
        n3.setIsim("N3");

        Node n4 = new Node();
        n4.setIsim("N4");

        result1.add(n1);
        result1.add(n2);

        n2.getBizimliste().add(n3);

        n1.getBizimliste().add(n4);
    }

    public void agactarama(List<Node> result) {
        for (Node birisi : result) {
            System.out.println(birisi.getIsim());
            if (!birisi.getBizimliste().isEmpty()) {
                System.out.println("-------");
                agactarama(birisi.getBizimliste());
                System.out.println("-------");
            }
        }
    }
}
