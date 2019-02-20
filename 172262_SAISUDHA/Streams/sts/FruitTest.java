package com.sts;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.stream.Collectors;

	import com.sts.Fruit;

	public class FruitTest {
	  public static void main(String args[]) {
		  List<Fruit> l=new ArrayList<Fruit>();
		  l.add(new Fruit("apple",100));
		  l.add(new Fruit("banana",1000));
		  l.add(new Fruit("papaya",89));
		  l.add(new Fruit("orange",60));
	List<Fruit> l2=l.stream().filter(e->e.getCalories()<100).sorted((x,y)->x.getCalories().compareTo(y.getCalories())).collect(Collectors.toList());
		 l2.forEach(System.out::println); 
	  
		 
	  } 
	}

