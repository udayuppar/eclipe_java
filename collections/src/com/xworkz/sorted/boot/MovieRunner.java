package com.xworkz.sorted.boot;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

import com.xworkz.sorted.dto.MovieDto;

public class MovieRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<MovieDto> movies=new ArrayList<MovieDto>();
		movies.add(new MovieDto("kantara", 10, LocalDate.of(2022, 07, 12), 500,"Kannada"));
		movies.add(new MovieDto("KGF", 25, LocalDate.of(2020, 04, 25), 450,"Telugu"));
		movies.add(new MovieDto("Charlee", 5, LocalDate.of(2022, 01, 22), 700,"English"));
		movies.add(new MovieDto("Rabart", 25, LocalDate.of(2019, 07, 12), 400,"kannada"));
		movies.add(new MovieDto("Vikram", 35, LocalDate.of(2018, 05, 12), 200,"Tamil"));
		
		System.out.println("name is sorted by ascending order");
		 movies.stream().sorted().collect(Collectors.toList()).forEach(e->System.out.println(e));
		
		System.out.println(System.lineSeparator());
		System.out.println("Budget is sorted desc");
		Comparator<MovieDto> dtos=(p1,p2)->Double.compare(p2.getBudget(), p1.getBudget());
		movies.stream().sorted(dtos).forEach(e->System.out.println(e));
		
		System.out.println(System.lineSeparator());
		System.out.println("profit is sorted Asce");
		Comparator<MovieDto> movii=(p1,p2)->Double.compare(p1.getProfit(), p2.getProfit());
		movies.stream().sorted(movii).forEach(e->System.out.println(e));
		//movies.stream().sorted().collect(Collectors.toList()).forEach(e->System.out.println(e));
		
		System.out.println(System.lineSeparator());
		System.out.println("language is sorted Asce");
		movies.stream().filter(e->e.getLanguage().endsWith("a")).sorted((p1,p2)->p1.getLanguage().compareToIgnoreCase(p2.getLanguage()))
		.forEach(e->System.out.println(e));
		
	}

}
