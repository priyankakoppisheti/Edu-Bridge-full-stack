package collection;

import java.util.*;

public class vector {

	public static void main(String[] args) {
		
				// TODO Auto-generated method stub
		Vector<Integer>item=new Vector<Integer>();
		item.add(56);
		item.add(78);
		item.add(65);
		item.add(57);
		item.add(7);
		item.add(43);
		item.set(3, 19);
		
		item.add(0, 100);
		
		item.indexOf(item);
		System.out.println(item.indexOf(item));

		item.isEmpty();
		System.out.println(item.isEmpty());

		item.add(56);
		System.out.println(item);
		item.capacity();
		System.out.println(item.capacity());
		item.size();
		System.out.println(item.size());
		item.clone();
		System.out.println(item.clone());
		item.equals(item);
		System.out.println(item.equals(item));
		
		item.lastIndexOf(item);
		System.out.println(item.lastIndexOf(item));
		
		item.removeElement(43);
		System.out.println(item.removeElement(43));
		item.removeElementAt(4);
		
			}

	}


