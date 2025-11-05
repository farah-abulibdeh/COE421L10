package lab10;

import java.util.Date;

public class TeamLeader extends ConcreteObserver {

	private String name;
	private UI ui;
	private int patience;
	private boolean finish = false;

	
	public TeamLeader(String name, int patience, UI ui, Eren subject) {
		super(subject);
		this.name = name;
		this.patience = patience;
		this.ui = ui;
		
	}
	
	public void update(Date d, int energy)
	{
		if (finish) {
			return;
		}
		
		patience -= 5;
		
		if (patience == 10)
		{
			ui.print(name + ": My patience is waning!");
		}
		else if(patience == 5)
		{
			ui.print(name + ": Is this enterntaining? ");
			
		}
		else if (patience <= 0)
		{
			ui.print(name + "Omae wa mou shindeiru..");
			finish = true;
		}
	}
	
	
}
