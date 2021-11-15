package tp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class main {

	interface Panel1{
		Iterator<Integer> panel1(int a, int b);
	}

	public static void main(String[] args) {
		
		
		var p = new Panel1(){
			public Iterator<Integer> panel1(int a, int b){
				List<Integer> list = new ArrayList<Integer>();
				for (int i = a; i<= b; i++) {
					list.add(i);
				}
				Iterator<Integer> l = list.iterator();
				
				return l;
			}
		};
		Iterator<Integer> it = p.panel1(1,5);
		for(;it.hasNext();)
			System.out.println(it.next());
		
		for(int i:Panel.panel2(1, 5)) {
			System.out.println(i);
		}
		
		List<Integer> l = Panel.panel(3, 6);
		for (int i:l) {
			System.out.println(i);
		}
		
		System.out.println(l.get(1));
		
	}

}
