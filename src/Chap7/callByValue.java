package Chap7;

public class callByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 ob = new Test1();
		
		int a = 15, b=20;
		
		System.out.println("a and b before call: "+a+" "+b);
		
		ob.meth(a, b);
		
		System.out.println("a and b after call: "+a+" "+b);
		System.out.println("i and j after call: "+ob.a+" "+ob.b);
	}

}
