package com.avega.training.ems.excercises.pojo;

/*6.  will this following  code compile 
     public class StaticInitializeOrder 
     {
        public static final String place;
          static
          {
           place = "Tambaram";
           System.out.println(place);
           System.out.println(pincode);
          }
        public static final int pincode = 600045;
        public static void main(String[] args)
        {
         StaticInitializeOrder sio =
                    new StaticInitializeOrder();
        }
     }*/


public class StaticInitializeOrder {
	public static final String place;
	
    static
    {
     place = "Tambaram";
     System.out.println(place);
     //System.out.println(pincode);
    }
   // public static final int pincode = 600045;
	public static void main(String[] args) {
		 StaticInitializeOrder sio =  new StaticInitializeOrder();
	}

}

/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 

	at com.avega.training.ems.excercises.pojo.StaticInitializeOrder.main(StaticInitializeOrder.java:12)
	first we have to initialize the value then we can place it inside the statis block and we can print
	Static init blocks run in the order in which their classes are initialized.
	
	*/
