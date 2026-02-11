package com.benr.product;

public class Computer extends Product{
	public int cpu;
	protected int ram;
	int hdd;
	
	public Computer(String name, int price, int cpu, int ram, int hdd) {
		super(name, price);
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}
	
	
	
}
