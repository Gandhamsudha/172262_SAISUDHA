package com.sts8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.Streams.Trader;
import com.Streams.Transaction;



public class TranTest {
	public static void main(String args[]) {
		
	
	// List<Trader> l=new ArrayList<Trader>();
	 Trader t=new Trader("sudha","hyd");
	  Trader t1=new Trader("vani","pune");
	  Trader t2=new Trader("manu","delhi");
	  
	  Transaction  td=new Transaction(t,2000,1);
	  
	  Transaction  td1=new Transaction(t1,1996,2);
	  
	  Transaction  td2=new Transaction(t2,1996,2);
	ArrayList<Transaction> al=new ArrayList<Transaction>();
	al.add(td);
	al.add(td1);
	al.add(td2);
	List<Integer> l2=al.stream().filter(e->e.getTrader().getCity().equals("delhi")).map(Transaction::getValue).collect(Collectors.toList());
	l2.forEach(System.out::println);
	

	
	 
	 
}
}