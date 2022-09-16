/** 
	File Name: MethodCalling.java
	Name: I. Lam
	Class: ICS3U1
	Date: Noveber 17, 2018
	Description: This program demonstrates the calls to methods (static and non-static) in another class
*/

public class MethodCalling {
	public static void main (String[] args) {
		methodA();
		
		MethodCalling mc = new MethodCalling();
		mc.methodB();
		
		Methods.methodC();
		
		Methods m = new Methods();
		m.methodD();
	}
	
	public static void methodA () {
		System.out.println("Method A");
	}
	
	public void methodB() {
		System.out.println("Method B");
	}
}