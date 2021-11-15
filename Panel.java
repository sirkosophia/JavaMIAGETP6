package tp;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Panel extends AbstractList<Integer>{
	public final int a;
	private final int b;
	
	public Panel(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public static Iterator<Integer> panel1(int a, int b){
		List<Integer> list = new ArrayList<Integer>();
		for (int i = a; i<= b; i++) {
			list.add(i);
		}
		Iterator<Integer> l = list.iterator();
		
		return l;
	}
	
	public static ArrayList<Integer> panel2(int a, int b){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = a; i<= b; i++) {
			list.add(i);
		}
		return list;
	}

	@Override
	public Integer get(int index) {
		return a+index;
	}

	@Override
	public int size() {
		return b-a+1;
	}
	
	public static List<Integer> panel(int x, int y){
		Panel p = new Panel(x, y);
		return p.subList(0, p.size());
		
	}

}
