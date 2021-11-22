class Item{

   private int id;
   private int quantity;
   public static int id_generator; //class member
   public static int total_quantity; //class member
   
   //college -> student [bag]-> own books[personal]   -> library [common place-books]
   
   public Item(int quantity){
	  this.quantity = quantity;
	  this.id=++id_generator;
	  this.total_quantity+= quantity;
   }
   
   public void display(){
	   System.out.println("------------------######---------------------------");
	   System.out.println("id: "+id);
	   System.out.println("quantity: "+quantity);
	    System.out.println("Total quantity: "+total_quantity);
	   System.out.println("####################################################");
   }
   
   public static void commonPrint(){
	   System.out.println("id_generator:"+id_generator);
	   System.out.println("total_quantity:"+total_quantity);
   }
}

class Store{
	public static void main(String n[]){
		Item.commonPrint();
		Item obj=new Item(50);
		obj.display();
		Item obj1=new Item(100);
		
		obj1.display();
		
		Item.commonPrint();
		obj1.commonPrint();
		
	}
}