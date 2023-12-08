import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

public class Controller {
    public static void switchScene(String s) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Controller.class.getResource(s));
            Scene scene = new Scene(fxmlLoader.load());
            App.stageMain.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
