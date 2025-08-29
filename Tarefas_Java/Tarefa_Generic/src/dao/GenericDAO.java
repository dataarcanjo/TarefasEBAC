package dao;

import java.util.ArrayList;
import java.util.List;
import carsSettings.*;

public class GenericDAO<T> {
	
	private List<T> list = new ArrayList();
	
	public void create(T entity) {
		if(entity instanceof Car) {
			list.add(entity);
		} else {
			System.out.println(entity + " isn't a car. You cannot add this to your list");
		}
	}
	
	public void delete(T entity) {
		if(entity instanceof Car) {
			list.remove(entity);
		} else {
			System.out.println(entity + " isn't a car. You cannot add this to your list");
		}
	}
	
	public void listAll() {
		System.out.println("\n******************\n");

		
		for (T t : list) {
			if (t instanceof Kwid) {
				Kwid car = (Kwid) t;
				System.out.println(car.getID() + " Kwid 2016");
			}
			else if(t instanceof Opala) {
				Opala car = (Opala) t;
				System.out.println(car.getID() + " Opala 2010");
			}
		}

	}
}
