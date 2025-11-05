package lab10;

import java.util.Date;
import java.util.Random;


public class Friend extends ConcreteObserver {
	
	private String name;
	private UI ui;
	private Random r = new Random();
	

	
	public Friend(String name, UI ui, Subject subject) {
		super(subject);
		this.name = name;
		this.ui = ui;
		
	}
	
	public void update(Date d, int energy)
	{
		if(r.nextBoolean())
		{
			ui.print(name + ": Eren, be safe!");
		}
		if(energy <= 20) {
			ui.print(name + ": rage, rage against the dying of the light.");
		}
	}

}
