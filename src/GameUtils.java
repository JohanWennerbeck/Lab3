import java.awt.*;

/**
 * Created by johan on 2016-12-08.
 */


public abstract class GameUtils implements GameModel  {
    /**
     * Set the tile on a specified position in the gameboard.
     *
     * @param pos  The position in the gameboard matrix.
     * @param tile
     */

    public static GameTile setGameboardState(Position pos, GameTile tile, GameTile[][] matt) {
        return setGameboardState(pos.getX(), pos.getY(), tile, matt);
    }

    /**
     * Set the tile on a specified position in the gameboard.
     *
     * @param x    Coordinate in the gameboard matrix.
     * @param y    Coordinate in the gameboard matrix.
     * @param tile
     */
    public static GameTile setGameboardState(int x, int y, GameTile tile, GameTile[][] matt) {
        return matt[x][y] = tile ;
    }

    /**
     * Returns the GameTile in logical position (x,y) of the gameboard.
     *
     * @param pos The position in the gameboard matrix.
     */
    @Override
    public GameTile getGameboardState(Position pos, GameTile[][] gameboardState) {
        return getGameboardState(pos.getX(), pos.getY(), gameboardState);
    }

    /**
     * Returns the GameTile in logical position (x,y) of the gameboard.
     *
     * @param x Coordinate in the gameboard matrix.
     * @param y
     */
    @Override
    public GameTile getGameboardState(int x, int y, GameTile [][] gameboardState) {
        return gameboardState[x][y];
    }

    public GameTile [][] getGameboard(){
        return null;
    }
    /**
     * Returns the size of the gameboard.
     */
    @Override
    public Dimension getGameboardSize() {
        return null;
    }

    /**
     * This method is called repeatedly so that the game can update it's state.
     *
     * @param lastKey The most recent keystroke.
     */
    @Override
    public void gameUpdate(int lastKey) throws GameOverException {

    }
}
