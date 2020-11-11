package it.unibo.oop.lab05.ex4;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.ProductImpl;

public class ComparableProduct extends ProductImpl implements Comparable<Product> {
	
	public ComparableProduct(final String name, final int quantity) {
		super(name, quantity);
	}
	
	public int compareTo(Product p1) {
		return ((p1.getName() == this.getName() && p1.getQuantity() == this.getQuantity()) ? 1 : 0);
	}
}
