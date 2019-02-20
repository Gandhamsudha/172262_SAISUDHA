package com.sts3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class RedColorTest {
	public static void main(String args[]) {
		  List<RedColor> l=new ArrayList<RedColor>();
		  l.add(new RedColor(100,"red", "apple"));
		  l.add(new RedColor(1000,"yellow","banana"));
		  l.add(new RedColor(89,"orange","papaya"));
		  l.add(new RedColor(60,"yellow","orange"));
		  List<RedColor> l1=l.stream().filter(e->e.getColor()=="red").sorted((x,y)->x.getPrice().compareTo(y.getPrice())).collect(Collectors.toList());
		  l1.forEach(System.out::println);
}
}