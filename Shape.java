abstract class Shape{
  protected int noOfSides;
  protected String name;
  
  public Shape(){
	  noOfSides=-1;
	  name="NoName";
  }
  public Shape(int noOfSides,String name){
	  this.noOfSides=noOfSides;
	  this.name=name;
  }
  
  public void display(){
	  System.out.println("noOfSides::"+noOfSides);
	  System.out.println("name::"+name);
  }
  abstract public void area();
  
  abstract  public void perimeter();
}

class Rectangle extends Shape{
	private int length;
	private int breadth;
	
	public Rectangle(){
		
	}
	
	public Rectangle(int noOfSides,String name,int length,int breadth){
		super(noOfSides,name);
		this.length=length;
		this.breadth=breadth;
	}
	

	
	public void display(){
		super.display();
		System.out.println("Length::"+length);
		System.out.println("Breadth::"+breadth);
	}
	
	public void area(){
		System.out.println("Area:"+(length*breadth));
	}
	
	public void perimeter(){
		System.out.println("Perimeter:"+2*(length+breadth));
	}
}


class Square extends Shape{
	private int side;
	
	
	public Square(){
		
	}
	
	public Square(int noOfSides,String name,int side){
		super(noOfSides,name);
		this.side=side;
		
	}
	
	
	
	public void display(){
		super.display();
		System.out.println("side::"+side);
	
	}
	
	public void area(){
		System.out.println("Area:"+(side*side));
	}
	
	public void perimeter(){
		System.out.println("Perimeter:"+4*side);
	}
}
class ShapeMain{
	public static void main(String n[]){
		
		Shape s=new Rectangle(4,"Rectangle",89,90);
		s.display();
		s.area();
		s.perimeter();
		
		s=new Square(4,"Square",18);
		s.display();
		s.area();
		s.perimeter();
		//s.show();
		
		
			
	}
}

/*

abstract  -class

   it cannot be instantiated
   
 abstract -method
 
   the method cannot have definition
   the clild class must override this method
   if the child class not overriding it should make itself abstract
 */