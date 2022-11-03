package com.uday.encapsulation.boot;

import com.uday.encapsulation.things.state.State;
import com.uday.encapsulation.things.state.StateModify;

public class StateRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		State state =new State();
		System.out.println(state.getName());
		System.out.println(state.getCapital());
		System.out.println(state.getChiefMinister());
		System.out.println(state.getFamousActor());
		System.out.println(state.getLanguage());
		System.out.println(state.getNoOfDistricts());
		System.out.println(state.getOldName());
		System.out.println(state.getPopulation());
		
		StateModify modi=new StateModify();
		modi.useState(state);

	}

	}

}
