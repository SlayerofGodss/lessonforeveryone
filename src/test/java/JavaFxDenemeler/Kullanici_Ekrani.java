package JavaFxDenemeler;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class Kullanici_Ekrani extends Application {
    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Kullanıcı Giriş");
        Label lblKullanici = new Label("Kullanıcı Adı");
        TextField txtKullanici = new TextField();
        Label lblSifre = new Label("Şifre");
        TextField txtSifre = new TextField();
        Button btnTamam = new Button("Tamam");
        GridPane grid = new GridPane();
        grid.add(lblKullanici,1,1);
        grid.add(txtKullanici,2,1);
        grid.add(lblSifre,1,2);
        grid.add(txtSifre,2,2);
        grid.add(btnTamam,2,3);
        grid.setHgap(10);
        grid.setVgap(5);
        Scene scene = new Scene(grid,250,150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
