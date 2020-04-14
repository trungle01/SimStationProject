package boids;

import mvc.*;
import simstation.*;

public class FlockingPanel extends SimulationPanel{
	
	public FlockingPanel(AppFactory factory) {
		super(factory);		
	}
	
	public static void main(String[] args) {
		AppFactory factory = new FlockingFactory();
		AppPanel panel = new FlockingPanel(factory);
		panel.display();
	}
	
}
