package com.sts.MaxMin;

import java.util.ArrayList;

import com.Streams.Trader;
import com.Streams.Transaction;

public class TransMaxMin {
	public static void main(String args[]) {

	
	
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
	 long minval=al.stream().min((x,y) -> x.getValue().compareTo(y.getValue())).map(Transaction::getValue).get();
	  System.out.println(minval);

	  long maxval=al.stream().max((x,y) -> x.getValue().compareTo(y.getValue())).map(Transaction::getValue).get();
	  System.out.println(maxval);
}
}