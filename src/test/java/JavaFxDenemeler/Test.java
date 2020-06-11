package JavaFxDenemeler;
import javafx.application.Application;
import javafx.stage.Stage;
public class Test extends Application        {
   @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("İlk Java Uygulaması");
        primaryStage.show();
    }
    public static void main(String[] args){
       Application.launch(args);
    }
}
