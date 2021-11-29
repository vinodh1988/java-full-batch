
/*
   interface can extend another interface
   
   for example if interface a has method m1
               if interface b is extending a and if it has m2
			   
			   if class X implements b, then it has to define both m1 and m2
			   
	multiple inheritance is possible for interfaces
			   
*/

interface A{
	public void m1();
}

interface B extends A{
	public void m2();
}

class X implements B{
	public void m1(){
		System.out.println("M1");
	}
	
	public void m2(){
		System.out.println("M2");
	}
	
}

class Main{
	public static void main(String n[]){
		B obj=new X();
		obj.m1();
		obj.m2();
	}
}