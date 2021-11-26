
//final
 class UnExtendable{
	public final void show(){
		
	}
	
}

class Two extends UnExtendable{
	
	/*public void show(){
		
	}*/
}

class Main{
	
	public static void main(String n[]){
		UnExtendable ext=new UnExtendable();
		final int a=90;
		a=900;
	}
}