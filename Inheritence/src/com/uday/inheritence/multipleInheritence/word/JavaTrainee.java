package com.uday.inheritence.multipleInheritence.word;

import com.uday.inheritence.multipleInheritence.rulls.XworkzRule;

public    class JavaTrainee extends Person implements XworkzRule {
	
	public void training()
	{
		System.out.println("running training method");
	}
	
	public void executeProgram()
	{
		System.out.println("running execute program method");
	}

	public boolean uploadedTask() {
		System.out.println("running upload task");
		return false;
	}

	public boolean completedProgram() {
		System.out.println("running completed program");
		return false;
	}

}
