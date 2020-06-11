package JavaFxDenemeler;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
public class Test extends Application        {
   @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("İlk Java Uygulaması");
        Label label = new Label("Merhaba JavaFx");
        Scene scene = new Scene(label,250,100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){
       Application.launch(args);
    }
}
