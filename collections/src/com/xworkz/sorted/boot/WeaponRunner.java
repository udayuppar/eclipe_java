package com.xworkz.sorted.boot;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

import com.xworkz.sorted.dto.WeaponDto;
import com.xworkz.sorted.enums.Type;

public class WeaponRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Collection<WeaponDto> weapons=new ArrayList<WeaponDto>();
	weapons.add(new WeaponDto("M4-16", "Uday", LocalDate.of(2022, 12, 12), 10000, Type.MACHINE_GUN));
	weapons.add(new WeaponDto("Short gun", "Shashi", LocalDate.of(2021, 10, 14), 20000, Type.MACHINE_GUN));
	weapons.add(new WeaponDto("Pistul", "Arun", LocalDate.of(2022, 11, 22), 5000, Type.SHORT_GUN));
	weapons.add(new WeaponDto("AWM", "neeraj", LocalDate.of(2021, 1, 12), 20000, Type.SHORT_GUN));
	weapons.add(new WeaponDto("Grenade", "Ashu", LocalDate.of(2022, 8, 22), 5000, Type.GRENADE));
	weapons.add(new WeaponDto("RDX", "Akash", LocalDate.of(2021, 2, 12), 1000,Type.GRENADE));
	weapons.add(new WeaponDto("Knif", "Ajay", LocalDate.of(2022, 1, 16), 1345, Type.BOW_AND_ARROW));
	weapons.add(new WeaponDto("Cross bow", "Prasanna", LocalDate.of(2022, 12, 02), 10455, Type.BOW_AND_ARROW));
	weapons.add(new WeaponDto("Stick", "Praveena", LocalDate.of(2020, 11, 12), 1520, Type.STICK));
	weapons.add(new WeaponDto("Spear", "Shrinivas", LocalDate.of(2021, 4, 2), 3215, Type.STICK));
	weapons.add(new WeaponDto("Hammar", "Santhosh", LocalDate.of(2021, 2, 16), 3245, Type.IRON));
	weapons.add(new WeaponDto("Bow", "Sanjay", LocalDate.of(2022, 12, 29), 6541, Type.BOW_AND_ARROW));
	weapons.add(new WeaponDto("Sheilds", "kiran", LocalDate.of(2022, 3, 12), 5412, Type.IRON));
	weapons.add(new WeaponDto("Rifle", "Nayana", LocalDate.of(2021, 5, 12), 3215, Type.SHORT_GUN));
	weapons.add(new WeaponDto("Revolver", "ShreSham", LocalDate.of(2021, 9, 1), 6148, Type.SHORT_GUN));
	weapons.add(new WeaponDto("Tanks", "Anusha", LocalDate.of(2022, 12, 12), 3987, Type.GRENADE));
	weapons.add(new WeaponDto("Sword", "Harshitha", LocalDate.of(2022, 12, 2), 4987, Type.IRON));
	weapons.add(new WeaponDto("Submarine", "Archana", LocalDate.of(2022, 7, 12), 9123, Type.ROCKET));
	weapons.add(new WeaponDto("MA -58", "Lokesh", LocalDate.of(2022, 12, 9), 7145, Type.MACHINE_GUN));
	weapons.add(new WeaponDto("AkM", "asha", LocalDate.of(2022, 12, 28), 1034, Type.MACHINE_GUN));
	
	System.out.println("Weapon price is greater than 2000");
	weapons.stream().filter(e->e.getPrice()>2000).collect(Collectors.toList()).forEach(e->System.out.println(e.getPrice()));
	
	System.out.println(System.lineSeparator());
	System.out.println("Weapons is madeBy and madeOn.......");
	weapons.stream().forEach(e->System.out.println("Made by :"+ e.getMadeBy()+"            " + "Made on :"+e.getMadeOn()));
	
	
	System.out.println(System.lineSeparator());
	System.out.println("Weapons by name is sorted by decending order.......");
	weapons.stream().sorted().forEach(e->System.out.println(e));
	
	System.out.println(System.lineSeparator());
	System.out.println("Weapons is sort by madeBy.......");
	Comparator<WeaponDto> dto=(p1,p2)->p1.getMadeBy().compareToIgnoreCase(p2.getMadeBy());
	weapons.stream().sorted(dto).forEach(e->System.out.println(e));
	
	System.out.println(System.lineSeparator());
	System.out.println("Weapons is sort by madeOn.......");
	Comparator<WeaponDto> dto2=(a1,a2)->a1.getMadeOn().compareTo(a2.getMadeOn());
	weapons.stream().sorted(dto2).forEach(e->System.out.println(e));
	
	System.out.println(System.lineSeparator());
	System.out.println("Weapons is sort by Price in acending.......");
	Comparator<WeaponDto> dtp=(a1,a2)->Double.compare(a1.getPrice(), a2.getPrice());
	weapons.stream().sorted(dtp).forEach(e->System.out.println(e));
	
	System.out.println(System.lineSeparator());
	System.out.println("Weapons is sort by Price in decending.......");
	Comparator<WeaponDto> dto1=(a1,a2)->Double.compare(a2.getPrice(), a1.getPrice());
	weapons.stream().sorted(dto1).forEach(e->System.out.println(e));
	
	System.out.println(System.lineSeparator());
	System.out.println("Weapons is sort by name and madeOn ascending order.......");
	//Comparator<WeaponDto> dto3=(b1,b2)->b1.getName().compareToIgnoreCase(b2.getName());
	//Comparator<WeaponDto> dto4=(c1,c2)->c1.getMadeOn().compareTo(c2.getMadeOn());
	weapons.stream().sorted((b1,b2)->b1.getName().compareToIgnoreCase(b2.getName()))
	.sorted((c1,c2)->c1.getMadeOn().compareTo(c2.getMadeOn())).forEach(e->System.out.println(e.getName()+e.getMadeOn()));
	
	System.out.println(System.lineSeparator());
	System.out.println("Weapons is sort by type , madeBy and name in dece.......");
	weapons.stream().sorted((d1,d2)->d1.getType().compareTo(d2.getType()))
	.sorted((a1,a2)->a1.getMadeBy().compareToIgnoreCase(a2.getMadeBy()))
	.sorted((p1,p2)->p2.getName().compareToIgnoreCase(p1.getName()))
	.forEach(e->System.out.println(":"+e.getType()+":"+e.getMadeBy()+":"+e.getName()));
	
	
	
	
	
	

	}

}
