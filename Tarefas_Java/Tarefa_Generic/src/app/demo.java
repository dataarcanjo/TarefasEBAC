package app;

import carsSettings.*;
import dao.*;

public class demo {

	public static void main(String[] args) {
		
		Kwid newModel = new Kwid("2016", "2016", "2016", 120);
		Opala newModel1 = new Opala("2010", "fdsfss", "@0347", 140);
		
		GenericDAO list = new GenericDAO();
		
		list.create(newModel);
		list.create(newModel1);
		
		list.listAll();
		
		list.delete(newModel);
		
		list.listAll();

	}
}
