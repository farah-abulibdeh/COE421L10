package lab10;
import java.util.Date;

public interface Subject {

	public void registerObserver(Observer o);
	
	public void removeObserver(Observer o);
	
	public void notifyObservers(Date d, int energy);
	
}
