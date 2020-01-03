package ui;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


import dao.GuestDaoImpl;
import util.GuestIdComparator;
import entities.Guest;
import service.GuestService;
import service.GuestServiceImpl;

public class GuestMain {
	 private GuestService service = new GuestServiceImpl(new GuestDaoImpl());
	 
	 public static void main(String[] args) {
		
	        GuestMain ui = new GuestMain();
	        ui.run();
	    }
	 public void run() {
	        try {
	        	Comparator<Guest> comparator = new GuestIdComparator(); 
	    		Set<Guest> set = new TreeSet<>(comparator);
	            Guest g2 = new Guest(3, "Sourav");
	            Guest g3 = new Guest(8, "Neeraj");
	            Guest g4 = new Guest(5, "Diptajit"); 
	            Guest g5 = new Guest(4, "Sumit");
	            
	            service.addGuest(g1);
	            service.addGuest(g2);
	            service.addGuest(g3);
	            service.addGuest(g4);
	            service.addGuest(g5);
	            Guest fetched1 = service.findById(8);
	            Guest fetched2 = service.findById(3);
	            System.out.println("fetched details:"+fetched1.getName());
	            System.out.println("fetched details:"+fetched2.getName());
	            System.out.println("********printing all guest****");
	            Set<Guest> guest = service.allGuest();
	            print(guest);
	        }catch (Throwable e){
	            e.printStackTrace();
	            System.out.println("something went wrong");
	        }
	    }
	 void print(Collection<Guest>guest){
	        for (Guest g:guest){
	            System.out.println(g.getId()+" "+g.getName());
	        }
	    }
}
