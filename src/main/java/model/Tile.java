package main.java.model;

/**
 * Created by plouzeau on 2014-10-09.
 */
public interface Tile {

    int getRank();

    void incrementRank();

    boolean equals(Tile tile);
}
