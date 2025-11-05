package lab10;

import java.util.Date;
import java.util.Random;

public class Eren extends ConcreteSubject implements Runnable {

	private Random r = new Random();
	private UI ui;
	private int energy;
	
	
public Eren(int energy, UI ui){
	
		this.energy = energy;
		this.ui = ui;
		
		Thread t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(energy > 0 ) {
			
			try {
				Thread.sleep((5 + r.nextInt(6) *1000));
				
				Date s = new Date();
				
				ui.print("Eren transform at " + s + " energy = " + energy);
				
				notifyObservers(s, energy);
				
				Thread.sleep(1000);
				
				energy -= 5;
				
			} catch (InterruptedException e) {
			 e.printStackTrace();
			 break;
			}
			ui.print("Eren is exhausted now, stopping.");
			}

	}


}
