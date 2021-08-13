package overiding;

class disp3 {
	 void show()
	{
		System.out.println("method overloading");
	}
}
class met extends disp3{
	
 static void show(disp3 m)
{
	 if(m instanceof met)
	 {
		 
	 met t=(met)m;
	System.out.println("method overriding");
}
}
}
class main2
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
disp3 m=new met();
met.show(m);
	}

}

