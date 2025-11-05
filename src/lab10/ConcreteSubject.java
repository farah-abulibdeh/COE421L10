
package lab10;

import java.util.Date;
import java.util.ArrayList;


public class ConcreteSubject implements Subject{

	private ArrayList<Observer> observers;
	
	public ConcreteSubject(){
	observers = new ArrayList <Observer>();
	}
	
	public void registerObserver(Observer o) {
	observers.add(o);
	}
	

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}

	@Override
	public void notifyObservers(Date d, int energy) {
		// TODO Auto-generated method stub
		for (int i =0; i<observers.size(); i++)
		{
		Observer observer = observers.get(i);
		observer.update(d, energy);
		}
	}

}
