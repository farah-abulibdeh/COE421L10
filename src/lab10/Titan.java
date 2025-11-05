package lab10;

import java.util.Date;
import java.util.Random;

public class Titan extends ConcreteObserver {

	private String name;
	private UI ui;
	private Random r = new Random();

	
	public Titan(String name, UI ui, Subject subject) {
		super(subject);
		this.name = name;
		this.ui = ui;
		
	}
	
	public void update(Date d, int energy)
	{
		if(r.nextBoolean())
		{
			ui.print(name + " attacks Eren!");
		}
		if(energy > 40) {
			ui.print(name + ": “Now we got problems, and I don't think we can solve 'em”.");
		}
	}
}
