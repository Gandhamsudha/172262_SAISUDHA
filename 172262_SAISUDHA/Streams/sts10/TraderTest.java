package com.sts10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.Streams.Trader;



public class TraderTest {
	public static void main(String args[]) {
	  List<Trader> l=new ArrayList<Trader>();
	  l.add(new Trader("sudha","hyd"));
	  l.add(new Trader("vani","pune"));
	  l.add(new Trader("aaaa","indhore"));
	  l.add(new Trader("bbb","indhore"));
	  l.add(new Trader("cccc","pune"));
	List<Trader> l2= l.stream().filter(e->e.getCity()=="pune").sorted((x,y)->x.getName().compareTo(y.getName())).collect(Collectors.toList());
	 l2.forEach(System.out::println);
}
}
