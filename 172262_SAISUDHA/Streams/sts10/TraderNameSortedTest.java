package com.sts10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.Streams.Trader;

public class TraderNameSortedTest {

	public static void main(String[] args) {
		  List<Trader> l=new ArrayList<Trader>();
		  l.add(new Trader("sudha","hyd"));
		  l.add(new Trader("vani","pune"));
		  l.add(new Trader("charan","indhore"));
		  l.add(new Trader("manu","indhore"));
		  l.add(new Trader("hrithik","pune"));

	
 List<Trader>l2=l.stream().sorted((x,y)->x.getName().compareTo(y.getName())).collect(Collectors.toList());
 l2.forEach(System.out::println);
}

 
}
