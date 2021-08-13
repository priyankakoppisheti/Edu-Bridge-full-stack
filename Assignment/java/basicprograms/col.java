package collection;

import java.util.LinkedList;

public class col {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Integer>item=new LinkedList<Integer>();
item.add(56);
item.add(78);
item.add(65);
item.add(57);
item.add(7);
item.add(43);
item.set(2, 19);
item.remove(3);
item.size();
item.contains(item);
System.out.println(item.contains(item));

item.add(0, 100);
item.indexOf(item);
System.out.println(item.indexOf(item));

item.getClass();
System.out.println(item.getClass());

item.isEmpty();
System.out.println(item.isEmpty());

item.addFirst(0);
System.out.println(item);


item.getFirst();
System.out.println(item.getFirst());
item.getLast();
System.out.println(item.getLast());
item.clone();
System.out.println(item.clone());
item.equals(item);
System.out.println(item.equals(item));
item.lastIndexOf(item);
System.out.println(item.lastIndexOf(item));

	}

}
