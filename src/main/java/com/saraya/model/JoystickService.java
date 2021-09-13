package com.saraya.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class JoystickService {
	private static ArrayList<Joystick> joysticks = new ArrayList<Joystick>();
	private static int count = 11;
	
	static {
		joysticks.add(new Joystick(1, 2020, "Jazane", "filaire PS4", "https://images.unsplash.com/photo-1597933437986-5b61315e70fc?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=760&q=80"));
		joysticks.add(new Joystick(2, 2021, "GIOTECH", "TGMP", "https://images.unsplash.com/flagged/photo-1580234748052-2c23d8b27a71?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=747&q=80"));
		joysticks.add(new Joystick(3, 2019, "YINAIER", "Dualshock", "https://images.unsplash.com/photo-1542549237432-a176cb9d5e5e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=351&q=80"));
		joysticks.add(new Joystick(4, 2012, "Kontrol-Freekk", "PS6", "https://images.unsplash.com/photo-1571716846252-df1324ce17bb?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=750&q=80"));
		joysticks.add(new Joystick(5, 2011, "Powerlead", "PS5", "https://images.unsplash.com/photo-1577583123610-238683cc3f9b?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=750&q=80"));
		joysticks.add(new Joystick(6, 2018, "XBOX-360", "ps3", "https://images.unsplash.com/photo-1605835963874-a7c87f56259e?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=750&q=80"));
		joysticks.add(new Joystick(7, 2015, "LUNTUS", "sILLICON", "https://images.unsplash.com/photo-1614294148960-9aa740632a87?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=750&q=80"));
		joysticks.add(new Joystick(8, 2017, "Razer", "Ultimate", "https://images.unsplash.com/photo-1526509867162-5b0c0d1b4b33?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=750&q=80"));
		joysticks.add(new Joystick(9, 2010, "Sony", "GTX", "https://images.unsplash.com/photo-1593118247619-e2d6f056869e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=750&q=80"));
		joysticks.add(new Joystick(10, 2009, "GEEKEN", "ACCZ", "https://images.unsplash.com/photo-1619382581049-c87bedd3b479?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=375&q=80"));
		joysticks.add(new Joystick(11, 2016, "Logitech", "G29", "https://images.unsplash.com/photo-1610733251107-bc08cfc2c5af?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=749&q=80"));
		
			}
	
	
	public List<Joystick> getAllJoysticks(){
		return joysticks;
	}
	
	public void addJoystick(int year, String make, String model, String image) {
		joysticks.add(new  Joystick(++count, year, make, model, image));
	}
	
	public void removeJoystick(int id) {
		Iterator<Joystick> tounkara =  joysticks.iterator();
		while(tounkara.hasNext()) {
		
			 Joystick joystick = tounkara.next();
			if(joystick.getId() == id) {
				tounkara.remove();
			}
		}
	}
	
	
	
}