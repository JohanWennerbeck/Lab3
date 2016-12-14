import java.beans.PropertyChangeListener;

/**
 * Created by Omaroueidat on 14/12/16.
 */
public interface IObesrvable {

    void addObserver(PropertyChangeListener observer);

    void removeObserver(PropertyChangeListener observer);
}
