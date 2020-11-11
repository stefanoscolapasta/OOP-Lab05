package it.unibo.oop.lab05.ex3;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class WarehouseImpl implements Warehouse {
	private final static int HAS_NO_PRODUCTS = -1;
	LinkedHashSet<Product> wareSet;
	
	public WarehouseImpl() {
		this.wareSet = new LinkedHashSet<>();
	}
	
	public void addProduct(Product p) {
		this.wareSet.add(p);
	}

	public Set<String> allNames() {
		Iterator<Product> pr1 = wareSet.iterator();
		Set<String> set1 = new HashSet<>();	
		while(pr1.hasNext()) {
			set1.add(pr1.next().getName());
		}
		return set1;
	}

	public Set<Product> allProducts() {
		return new HashSet<>(this.wareSet); 
	}

	public boolean containsProduct(Product p) {
		Iterator<Product> pr1 = wareSet.iterator();	
		while(pr1.hasNext()) {
			if(pr1.next() == p) {
				return true;
			}
		}
		return false;
	}

	public double getQuantity(String name) {
		Iterator<Product> pr1 = wareSet.iterator();	
		while(pr1.hasNext()) {
			if(pr1.next().getName() == name) {
				return pr1.next().getQuantity();
			}
		}
		return WarehouseImpl.HAS_NO_PRODUCTS;
	}

}
