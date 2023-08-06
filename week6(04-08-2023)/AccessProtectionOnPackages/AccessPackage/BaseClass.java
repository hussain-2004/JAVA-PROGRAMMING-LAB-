package AccessPackage;

public class BaseClass{
	public final int n_public = 10;
	private final int n_private = 20;
	protected final int n_protected = 30;
	final int n_default = 40; //default scope
	public BaseClass(){
		System.out.println("This is Base Constructor!!");
		System.out.println("n_public = "+n_public);
		System.out.println("n_private = "+n_private);
		System.out.println("n_protected = "+n_protected);
		System.out.println("n_default = "+n_default);
	}
}