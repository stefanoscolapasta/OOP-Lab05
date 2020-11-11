package it.unibo.oop.lab05.ex2;

public class Comparator implements java.util.Comparator<String>{
	
	public Comparator() {
		
	}
	
	public int compare(String s1, String s2) {
		return s1.compareTo(s2);
	}
	
}
