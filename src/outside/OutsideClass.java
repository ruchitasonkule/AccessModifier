package outside;
import advanced.accessmodifiers.*;

public class OutsideClass {

	public static void main(String[] args) {
		DerivedClass derivedClass = new DerivedClass(); //create object of derived class
		
		System.out.println(derivedClass.derivedVariable); //access public
		derivedClass.derivedMethod();
		
		
		//System.out.println(derivedClass.baseVariable); //Compile Time Error//private
		derivedClass.baseMethod();    //Compile Time Error//(protected not visible outside package)
		
		
	}

}
