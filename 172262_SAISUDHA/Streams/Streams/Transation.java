package com.Streams;

public class Transation {
private	Trader trader;
private int year; 
private int value;
public Transation(Trader trader, int year, int value) {
	super();
	this.trader = trader;
	this.year = year;
	this.value = value;
}
public Trader getTrader() {
	return trader;
}
public void setTrader(Trader trader) {
	this.trader = trader;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getValue() {
	return value;
}
public void setValue(int value) {
	this.value = value;
}

}
