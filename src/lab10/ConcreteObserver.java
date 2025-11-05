package lab10;

import java.util.Date;

public class ConcreteObserver implements Observer {

	protected Subject subject;
	
	public ConcreteObserver(Subject subject)
	{
		this.subject = subject;
		subject.registerObserver(this);
	}
	
	@Override
	public void update(Date d, int energy) {
		// TODO Auto-generated method stub
		 System.out.println("do nothing from "+this);
	}
	
}
