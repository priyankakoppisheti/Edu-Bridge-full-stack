package collection;
import java.util.*;
public class datatype3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Collection item=new ArrayList();
item.add(481);
item.add("priya");
item.add(78.98);
item.add(23);
System.out.println(item);
item.add("2020");
item.remove(78.98);
((ArrayList) item).set(2,88.89);

for(Object i : item) 
{
System.out.println(i);
	}
	}
}
