package com.sts9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.Streams.Trader;

public class CityUniqueTest {
	public static void main(String[] args) {
		  List<Trader> l=new ArrayList<Trader>();
		  l.add(new Trader("sudha","hyd"));
		  l.add(new Trader("vani","pune"));
		  l.add(new Trader("charan","indhore"));
		  l.add(new Trader("manu","indhore"));
		  l.add(new Trader("hrithik","pune"));
List<String> l1=l.stream().map(Trader::getCity).distinct().collect(Collectors.toList());
l1.forEach(System.out::println);
	}
	
}
