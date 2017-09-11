package com.gmc.first;

import com.gmc.inputs.Ward;

public class SampleProgram {

	
	public String sayHello(String name) {
		return "Hello" + name;
		
	}
	
	public Ward createNewWard(String wardNo, String wardName) {
		Ward ward = new Ward();
		ward.setWardName(wardName);
		ward.setWardNo(wardNo);
		return ward;
		
	}
	
	public void displayWard(Ward ward) {
		System.out.println("WardName:  " + ward.getWardName() + "  Ward Number: " + ward.getWardNo());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = new String("Sangamithra");
		SampleProgram samprg = new SampleProgram();
		Ward ward = samprg.createNewWard("1", "krishna");
		samprg.displayWard(ward);
		ward = samprg.createNewWard("2", "nagamalai");
		samprg.displayWard(ward);
		System.out.println(samprg.sayHello(name));
	}

}
