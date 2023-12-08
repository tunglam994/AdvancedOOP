
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    public static Stage stageMain;

    @Override
    public void start(Stage stage) throws IOException {
        stageMain = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/main.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stageMain.setTitle("CHAT APP");
        stageMain.setResizable(false);
        stageMain.setScene(scene);
        stageMain.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
