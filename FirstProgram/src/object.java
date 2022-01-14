public class object{
	public static void main(String[] args) {

		student details=new student();
		details.regno=1272;
	    System.out.println(details.regno);
	 new student().id();

	    
	}


	}
	class student{
		int regno,phoneno;
		char name;
		void id() {
			int v=100;
			System.out.println(v);
			System.out.println("enter student id");
		}
		void  marks() {
			System.out.println("enter student marks");
		}
		void address() {
			System.out.println("enter student address");
		}
		
		
	}

