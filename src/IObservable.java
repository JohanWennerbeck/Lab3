import java.beans.PropertyChangeListener;

/**
 * Created by Omaroueidat on 14/12/16.
 */
public interface IObservable {

    void addObserver(PropertyChangeListener observer);

    void removeObserver(PropertyChangeListener observer);
}
