package com.uday.copies.things;
import com.uday.copies.boot.Bus;
public class BusRunner {

	public static void main(String[] args) {
	
		
		Bus ksrtc=new Bus();
		
		System.out.println(ksrtc.number);
		System.out.println(ksrtc.starting);
		System.out.println(ksrtc.destination);
		System.out.println("****************");
		ksrtc.number=254;
		ksrtc.starting="Tarikere";
		ksrtc.destination="Bengalur";
		System.out.println(ksrtc.number);
		System.out.println(ksrtc.starting);
		System.out.println(ksrtc.destination);

	}

}
