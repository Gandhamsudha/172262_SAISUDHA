package com.sts2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.sts.Fruit;

public class FruitColorTest {
	public static void main(String args[]) {
		  List<FruitColor> l=new ArrayList<FruitColor>();
		  l.add(new FruitColor("apple",100,"red"));
		  l.add(new FruitColor("banana",1000,"yellow"));
		  l.add(new FruitColor("papaya",89,"orange"));
		  l.add(new FruitColor("orange",60,"yellow"));
		  List<FruitColor> l3=l.stream().sorted((x,y)->x.getColor().compareTo(y.getColor())).collect(Collectors.toList());
			 l3.forEach(System.out::println); 
		} 
}
