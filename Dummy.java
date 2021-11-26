

class Dummy {
   public void dummy(){
      System.out.println("Hey...!!!!");
   }
   
   public String toString(){
	   return "Hi";
   }
 
}

class Main 
{
	public static void main(String n[]){
	      Object m=new Dummy();
		  Dummy d=new Dummy();
		  System.out.println(m.toString());
		  System.out.println(m);
		  System.out.println(d.toString());
		  System.out.println(d);
	}
}