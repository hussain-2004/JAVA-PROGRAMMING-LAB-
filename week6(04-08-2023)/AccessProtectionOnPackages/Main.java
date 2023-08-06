import AccessPackage.*;
class Derived extends BaseClass{
	Derived(){
		System.out.println("Sub-Class Constructor!!");
		System.out.println("n_public = "+n_public);
		System.out.println("n_private = "+"connot be accessed in subClass");
		System.out.println("n_protected = "+n_protected);
		System.out.println("n_default = "+"connot be accessed in subClass");

	}
}

class Main{
	public static void main(String args[]){
		Derived obj = new Derived();
		// BaseClass obj = new BaseClass();
		System.out.println("Main class!!");
		System.out.println("n_public = "+obj.n_public);
		System.out.println("n_private = "+"connot be accessed in MainClass");
		System.out.println("n_protected = "+"connot be accessed in MainClass");
		System.out.println("n_default = "+"connot be accessed in MainClass");	
	}
}