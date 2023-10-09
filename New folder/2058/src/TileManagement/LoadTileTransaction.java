package TileManagement;

import java.util.ArrayList;
import java.util.List;


public class LoadTileTransaction {

    public static List<Tile> gameTiles = new ArrayList<Tile>();


    public List<Tile> loadTiles(){


        //all tiles on board
        Tile t0 = new Tile("N/A", "Go", 0, 0, 0, 0, "goTile", false);
        Tile t1 = new Tile("Grey", "tile1", 60, 2, 200, 90, "propertyTile", true);
        Tile t2 = new Tile("N/A", "Go", 0, 0, 0, 0, "goTile", false);
        Tile t3 = new Tile("N/A", "Go", 0, 0, 0, 0, "goTile", false);
        Tile t4 = new Tile("N/A", "Go", 0, 0, 0, 0, "goTile", false);
        Tile t5 = new Tile("N/A", "Go", 0, 0, 0, 0, "goTile", false);
        Tile t6 = new Tile("N/A", "Go", 0, 0, 0, 0, "goTile", false);
        Tile t7 = new Tile("N/A", "Go", 0, 0, 0, 0, "goTile", false);
        Tile t8 = new Tile("N/A", "Go", 0, 0, 0, 0, "goTile", false);
        Tile t9 = new Tile("N/A", "Go", 0, 0, 0, 0, "goTile", false);
        Tile t10 = new Tile("N/A", "Go", 0, 0, 0, 0, "goTile", false);
        Tile t11 = new Tile("N/A", "Go", 0, 0, 0, 0, "goTile", false);
        Tile t12 = new Tile("N/A", "Go", 0, 0, 0, 0, "goTile", false);
        
        //adding tiles to list
        gameTiles.add(t0);
        gameTiles.add(t1);
        gameTiles.add(t2);
        gameTiles.add(t3);
        gameTiles.add(t4);
        gameTiles.add(t5);
        gameTiles.add(t6);
        gameTiles.add(t7);
        gameTiles.add(t8);
        gameTiles.add(t9);
        gameTiles.add(t10);
        gameTiles.add(t11);
        gameTiles.add(t12);
        return gameTiles;
    }

}
