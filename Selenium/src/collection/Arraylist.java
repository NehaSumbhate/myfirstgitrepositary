package collection;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList obj = new ArrayList();
String Str = "Testing";
String str = "LOve";
String s="ok";//
String bb = "us";
System.out.println(obj.add("ooo"));
obj.add("fff");
obj.add(5);
obj.add(null);
System.out.println(obj);
ArrayList obj1 = new ArrayList();
obj1.add("Testing");
obj1.addAll(obj);
System.out.println(obj1);
ArrayList obj2 = new ArrayList();
obj2.add("Anku");
System.out.println(obj2);
obj.addAll(3, obj2);
System.out.println(obj);




	}
	public void t1() {
		
	}

}
