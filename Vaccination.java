interface Vaccination{
	
    void vaccinate();
}

class Plumber implements Vaccination{
	
	public void plumbing(){
		System.out.println("Doing plumbing job");
	}
	
	public void vaccinate(){
		System.out.println("Plumber gets Vaccinated");
	}
}

class Electrician implements Vaccination{
	public void electricWork(){
		System.out.println("Electrician Doing Electric Work");
	}
	
	public void vaccinate(){
		System.out.println("Electrician gets Vaccinated");
	}
}

class Carpenter implements Vaccination{
	public void woodWork(){
		System.out.println("Carpenter doing Wood Work");
	}
	
	public void vaccinate(){
		System.out.println("Carpenter gets vaccinated");
	}
}

class Main{
	public static void main(String n[]){
		Vaccination v=new Carpenter();
		v.vaccinate();
		//v.woodWork();
		v=new Electrician();
		v.vaccinate();
		v=new Plumber();
		v.vaccinate();
	}
}
/*
  interface is a collection of abstract methods
  
  interface will not have any instance variable because instance is not possible
  for interface
  
  But interface can have constants
  
 */