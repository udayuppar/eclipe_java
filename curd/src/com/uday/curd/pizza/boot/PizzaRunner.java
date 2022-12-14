package com.uday.curd.pizza.boot;

import com.uday.curd.pizza.DTO.PizzaDTO;
import com.uday.curd.pizza.pizzaEnum.PizzaSize;
import com.uday.curd.pizza.survice.PizzaSurviceImpl;

public class PizzaRunner {

	public static void main(String[] args) {
		
		
		PizzaSurviceImpl impl =new PizzaSurviceImpl();
		PizzaDTO dto=new PizzaDTO("Pannir pizza", "Dominose" ,PizzaSize.LARGE, true, 40, "cheese pizza", "Non veg", "System", "Users", null, null);

		//PizzaDTO dto=new PizzaDTO();
		//dto.setName("Pannier pizza");
		
		impl.validateAndSave(dto);
	//	System.out.println(impl.validateAndSave(dto));
		
		
		
	}

}
