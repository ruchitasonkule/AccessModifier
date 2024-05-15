package advanced.accessmodifiers;

public class DerivedClass extends BaseClass
{
	public String derivedVariable="This is public variable"; //Anywhere access
	
public void derivedMethod() {
	System.out.println("This is derivedMethod");
	//baseMethod();  //Access protected 
	
}	
public void baseMethod()
{
	System.out.println("This is base method");
	}

}


