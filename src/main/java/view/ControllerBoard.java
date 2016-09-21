package main.java.view;

import javafx.fxml.FXML;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import main.java.model.Board;
import main.java.model.BoardImpl;
import main.java.model.Tile;

public class ControllerBoard {

    private static final int SIZE = 4;

    private Board board;

    @FXML
    private GridPane gridPane;

    @FXML
    private void initialize() {
        board = new BoardImpl(SIZE);
        drawBoard();
    }

    private void drawBoard(){
        gridPane.getChildren().clear();
        int tileSize = (int) gridPane.getPrefWidth()/SIZE;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                Tile tile = board.getTile(j+1,i+1);
                TileView tileView = new TileView(tile,tileSize);
                gridPane.add(tileView,i,j);
            }
        }
    }

    public void handle(KeyEvent event) {
        switch (event.getCode()) {
            case UP:
                board.packIntoDirection(Board.Direction.TOP);
                break;
            case DOWN:
                board.packIntoDirection(Board.Direction.BOTTOM);
                break;
            case LEFT:
                board.packIntoDirection(Board.Direction.LEFT);
                break;
            case RIGHT:
                board.packIntoDirection(Board.Direction.RIGHT);
                break;
            default:
                return;
        }
        drawBoard();
    }

}
