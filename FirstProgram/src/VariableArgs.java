import javax.print.attribute.IntegerSyntax;

public class VariableArgs {

	public static void main(String[] args) {
		new  VariableArgs().add(7,8,9,7,6,5);
		
	}
	
		
         void  add(int... values) {
        	   int total=0;
            	 if(values.length>=2)
            	 {
            		
            		 for(int value:values)
            		 {
            			 total+=value;
            		 }
            		 System.out.println(total);
            	 }
             }
	}


