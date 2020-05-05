import java.util.ArrayList;
import java.util.List;

public class Node{

 private String isim;

 private List<Node> bizimliste = new ArrayList<Node>();

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public List<Node> getBizimliste() {
        return bizimliste;
    }

    public void setBizimliste(List<Node> bizimliste) {
        this.bizimliste = bizimliste;
    }
}
