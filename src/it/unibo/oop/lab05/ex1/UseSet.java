package it.unibo.oop.lab05.ex1;

import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {	
    	TreeSet<String> coll = new TreeSet<String>();
    	
    	for(int i = 1; i <= 20; i++) {
    		coll.add(Integer.toString(i));
    	}
    	
    	Iterator<String> st = coll.iterator();
    	
    	while(st.hasNext()) {
    		System.out.println(st.next());
    	}
    	
    	Iterator<String> st2 = coll.iterator();
    	
    	while(st2.hasNext()) {
    		final int n = Integer.parseInt(st2.next());
    		if(n % 3 == 0) {
    			st2.remove();
    		}
    	}
    	
    	System.out.println("---------------------------------------------------------------------------------");
    	
    	Iterator<String> st3 = coll.iterator();
    	
    	while(st3.hasNext()) {
    		System.out.println(st3.next());
    	}
    	
    	System.out.println("---------------------------------------------------------------------------------");
    	  	
    	if(UseSet.hasEven(coll)) {
    		System.out.println("All elements are even");
    	}else {
    		System.out.println("All elements are even");
    	}
    }
    
    
    private static boolean hasEven(TreeSet<String> coll) {
    	final Iterator<String> st4 = coll.iterator();
    	while(st4.hasNext()) {
    		final int m = Integer.parseInt(st4.next());
    		if(m % 2 != 0) {
    			return false;
    		}
    	}
    	return true;
    }
}
