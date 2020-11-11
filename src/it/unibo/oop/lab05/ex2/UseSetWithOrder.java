package it.unibo.oop.lab05.ex2;
import java.util.TreeSet;
import java.util.Iterator;

/**
 * 
 */
public final class UseSetWithOrder {

    private UseSetWithOrder() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
    	
    	TreeSet<String> set = new TreeSet<>(new Comparator());
    	
    	for(int i = 0; i < 100; i++) {
    		set.add(String.valueOf(Math.random()));
    	}
    	
    	Iterator<String> st1 = set.iterator();
    	
    	while(st1.hasNext()) {
    		System.out.println(st1.next());
    	}
        /*
         * Write a program which:
         * 
         * 1) Creates a new ORDERED TreeSet of Strings. To order the set, define
         * a new Comparator in a separate class.
         * 
         * 2) Inserts in the set a hundred strings containing randomly generated
         * numbers (use Math.random())
         * 
         * 3) Prints the set, which must be ordered
         */
    }
}
