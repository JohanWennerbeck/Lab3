import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * Created by Omaroueidat on 15/12/16.
 */
public class ReversiScoreView implements PropertyChangeListener{


    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("Show Score")) {
            if (evt.getSource().getClass() == ReversiModel.class) {
                ReversiModel reversiModel = (ReversiModel) evt.getSource();
                System.out.println("The score is: Black: " + reversiModel.getBlackScore() + " White: " + reversiModel.getWhiteScore());
                System.out.println("It is " + reversiModel.getTurnColor().nextTurn(reversiModel.getTurnColor()) + "s turn to play.");
            }
        }
    }
}
