package oscar.prueba.test;

import java.util.ArrayList;
import java.util.List;

public class Fibonachi {
	
	public String calcularFibonachi() {
		
		List<Integer> fibo = new ArrayList<Integer>();
	
		
		for(int i = 0; i < 10; i++) {
			
			if(i == 0 || i == 1) {
				
				fibo.add(i);
				
			} else {
				
				fibo.add((fibo.get(i-1) + fibo.get(i-2)));
				
			}
		}
		
		return fibo.toString();
		
	}

}
