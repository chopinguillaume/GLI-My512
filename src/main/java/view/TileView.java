package main.java.view;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import main.java.model.Tile;

/**
 * Created by guillaume on 21/09/16.
 */
class TileView extends Label{

    TileView(Tile tile, int size) {
        super();
        if(tile != null) setText(String.valueOf((int) Math.pow(2,tile.getRank())));
        setAlignment(Pos.CENTER);
        setPrefSize(size,size);
//        setFont(new Font("Clear Sans",25));
        setTileStyle(tile);
    }

    private void setTileStyle(Tile tile) {
        if(tile == null){
            setStyle("-fx-background-color: #CDC1B5;");
        }
        else{
            switch (tile.getRank()){
                case 1:
                    setStyle("-fx-background-color: #EEE4DA;");
                    break;
                case 2:
                    setStyle("-fx-background-color: #ECE0CA;");
                    break;
                case 3:
                    setStyle("-fx-background-color: #F5B272;");
                    break;
                case 4:
                    setStyle("-fx-background-color: #F59565;");
                    break;
                case 5:
                    setStyle("-fx-background-color: #F57C5F;");
                    break;
                case 6:
                    setStyle("-fx-background-color: #F65D3B;");
                    break;
                case 7:
                    setStyle("-fx-background-color: #EDCE71;");
                    break;
                case 8:
                    setStyle("-fx-background-color: #EDCC63;");
                    break;
                case 9:
                    setStyle("-fx-background-color: #EAD140;");
                    break;
                case 10:
                    setStyle("-fx-background-color: #EACE27;");
                    break;
                case 11:
                    setStyle("-fx-background-color: #EEC22E;");
                    break;
                default:
                    setStyle("-fx-background-color: #E81A1D;");
            }
        }
    }
}
