
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class ChatController extends Controller {

    @FXML
    void backToMain(MouseEvent event) {
        switchScene("/main.fxml");
    }

    @FXML
    void intoCall(MouseEvent event) throws IOException {
        switchScene("/call.fxml");
    }
    @FXML
    void intoChat(MouseEvent event) throws IOException {
        switchScene("/chat.fxml");
    }
}
