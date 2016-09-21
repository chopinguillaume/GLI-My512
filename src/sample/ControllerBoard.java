package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.input.KeyEvent;

public class ControllerBoard implements EventHandler<KeyEvent> {
    @FXML
    private void initialize() {}


    @Override
    public void handle(KeyEvent event) {
        switch (event.getCode()) {
            case UP: System.out.println("UP"); break;
            case DOWN: System.out.println("DOWN"); break;
            case LEFT: System.out.println("LEFT"); break;
            case RIGHT: System.out.println("RIGHT"); break;
        }
    }

}
