class Person{

   private int sno;
   private String name;
   private String city; //instance Variables or instance member
   
   public Person(){
	   sno=-1;
	   name="NoName";
	   city="NoPlace";
   }
   public Person(int sno,String name,String city){
	   this.sno=sno;
	   this.name=name;
	   this.city=city;
   }
   public void setPerson(int sno,String name,String city){
	   this.sno=sno;
	   this.name=name;
	   this.city=city;
   }
   public void setPerson(String name){
	   this.name=name;
   }
   public void setPerson(String name,String city){
	   this.name=name;
	   this.city=city;
   }
   public void display(){
      System.out.println(sno+ " "+name+"  "+city);
   }//instance of member method
   
  
   
}

class Main{
	public static void main(String n[]){
	  Person p1=new Person();
      Person p2=new Person(5,"Sam","Mumbai");
	  p1.display();
	  p2.display();
	  p1.setPerson(1,"Ravi","Mumbai");
	  p2.setPerson(2,"Rohit","Chennai");
	 // p1.name="Ram";//this is not good
	 // p2.city="Hyderabad"; //this is not good
      p1.display();
      p2.display();	 
      p1.setPerson("Kiran","Lahore");
	  p2.setPerson("Roger");
	   p1.display();
      p2.display();	 
	}
}

/*

Access specifiers

   1. public
   2. private
   3. protected
   4. default
   
   Access specifiers can be applied before class, variables ,interface and methods
 
Note : for outer class,interface only public and default  allowed

In java there are three kinds of variables

1. Instance Variable
2. class/static Variable
3. Local Variable - variable declared within a method

Method /Constructor overloading


   - if method overloading
   
          creating differences in return types does not matter
		  difference should be in parameters
		  
		  public void dothis(){
			  
		  }
		  public float dothis(){
			  
		  } //this is not overloading
		  
		if you overload constructor/method difference should be in
		
		1. Order of parameter types
		2. number of parameters 
		3. types of paramters
		
		   public void doThis(int a,int b){
			   
		   }
		   
		   public void doThis(int b,int a){
			   
		   }//not overloading
		   
		   public void doThis(int a,float b){
			   
		   }
*/ 