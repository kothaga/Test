
public class StaticDemo {
static void mydetails()//method  without parameters/arguments
{
	System.out.println(" hello from static demo ");

}

void mydetails2()//method without  static and aruments 
{

	System.out.println(" hello from my friend have a nice Diwali ");
}

static int i=10;//static variable which can be invoked directly in main 
int j=20;//non static variable cna be invoked using object only;


public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static can call static only  
		//static methods wont requrie object invocation 
		mydetails();
		mydetails();
		
		
		
		//non static methods needs object declration
		//object declaration can be done in two ways
		//classname objectname=new Classname();
		
		//classname objectname;
		//objectname=new classname();
		
		StaticDemo sd=new StaticDemo();
		sd.mydetails2();
		System.out.println(i);
		System.out.println(sd.j);//used object 
	//	System.out.println(sd.i);//using object invoked the variable i
		
		StaticDemo sd2;
		sd2=new StaticDemo();
		sd2.mydetails2();
		
		

	}

}
