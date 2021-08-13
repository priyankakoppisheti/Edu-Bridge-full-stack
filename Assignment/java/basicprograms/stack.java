package collection;
import java.util.Stack;
public class stack {
	
		public static void main(String[] args) {
			
					// TODO Auto-generated method stub
			Stack<Integer>item=new Stack<Integer>();
			item.add(56);
			item.add(78);
			item.add(65);
			item.add(57);
			item.add(7);
			item.add(43);
			item.set(3, 19);
			
			item.add(0, 100);
			System.out.println(item);
			System.out.println(item.push(111));
			System.out.println(item.push(333));
			System.out.println(item.push(444));
			System.out.println(item.pop());
			System.out.println(item.peek());
			System.out.println(item.search(item));
			System.out.println(item.size());
			System.out.println(item.contains(item));
			System.out.println(item.empty());
			System.out.println(item.indexOf(43));
			
			System.out.println(item);
				
			
				}

		}


