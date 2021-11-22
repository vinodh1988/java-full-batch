class Shape{
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
	
	public void show(){
		System.out.println("Length::"+length);
		System.out.println("Breadth::"+breadth);
	}
	
	public void display(){
		super.display();
		System.out.println("Length::"+length);
		System.out.println("Breadth::"+breadth);
	}
}

class ShapeMain{
	public static void main(String n[]){
		Rectangle r=new Rectangle(4,"Rectangle",23,15);
		r.display();
		r.show();
	}
}