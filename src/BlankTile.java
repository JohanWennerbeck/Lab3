import java.awt.*;

/**
 * Created by Omaroueidat on 11/12/16.
 */
public class BlankTile implements GameTile {
    @Override
    public void draw(Graphics g, int x, int y, Dimension d) {
        // The default GameTile is transparent,
        // therefore no drawing is performed.
    }
}
