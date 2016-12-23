

public class Shadow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a = new Address(2, 22, "Latur");
		Employee original = new Employee(1,"ABC",a);
		Employee cloned = null;
		try {
			 cloned = (Employee) original.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Must be true and objects must have different memory addresses
        System.out.println(original != cloned);
 
        //As we are returning same class; so it should be true
        System.out.println(original.getClass() == cloned.getClass());
 
        //Default equals method checks for refernces so it should be false. If we want to make it true,
        //we need to override equals method in Employee class.
        System.out.println(original.equals(cloned));
        
        System.out.println("/////////////////////////////////////////////");
    
        System.out.println("original");
        System.out.println(original);
        System.out.println();
        System.out.println("cloned");
        System.out.println(cloned);
        System.out.println();
        cloned.getAddress().setCity("pune");
        
        System.out.println("/////////////////////////////////////////////");
        System.out.println();
        System.out.println("original");
        System.out.println(original);
        System.out.println();
        System.out.println("cloned");
        System.out.println(cloned);
	}

}
