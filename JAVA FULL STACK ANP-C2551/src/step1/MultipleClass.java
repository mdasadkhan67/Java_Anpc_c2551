package step1;

class Second {
	
	int a,b,total;
	
	void add() {
		total = a+b;
	}
	
}


public class MultipleClass {

	public static void main(String[] args) {
		
		Second classsecond = new Second();
		
		classsecond.a=10;
		classsecond.b=20;

		classsecond.add();
		
		System.out.println(classsecond.total);;
		
	}

}
