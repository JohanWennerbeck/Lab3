import java.awt.*;

/**
 * Created by johan on 2016-12-08.
 */
public class GameUtils {
    /**
     * Set the tile on a specified position in the gameboard.
     *
     * @param pos  The position in the gameboard matrix.
     * @param tile
     */
    public void setGameboardState(Position pos, GameTile tile, GameTile[][] board) {
        setGameboardState(pos.getX(),pos.getY(), tile, board);


    }

    /**
     * Set the tile on a specified position in the gameboard.
     *
     * @param x    Coordinate in the gameboard matrix.
     * @param y    Coordinate in the gameboard matrix.
     * @param tile
     */
    public void setGameboardState(int x, int y, GameTile tile, GameTile[][] board) {
        board[x][y] = tile;
    }
}
