import java.awt.*;

/**
 * Created by johan on 2016-12-08.
 */


public abstract class GameUtils implements GameModel  {

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
