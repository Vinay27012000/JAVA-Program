package javaprogram;

public class MultipleCatchStatement {
int a,b;
int x[];
MultipleCatchStatement(){
	a=b=0;
	x=new int[10];
}
MultipleCatchStatement(int a,int b) {
	this.a=a;
	this.b=b;
	x=new int[10];
}
void function() {
	try {
		int i=0;
		for(i=0;i<=10;i++,b--) {
			x[i]=i+1;
			System.out.println(x[i]/b);
		}
	}
	catch(ArithmeticException e)
	{
		System.out.println(e.toString());
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e.toString());	
	}
}
	public static void main(String[] args) {
		MultipleCatchStatement  obj=new MultipleCatchStatement(10,20);	
		MultipleCatchStatement  obj2=new MultipleCatchStatement(10,3);
		obj.function();
		obj2.function();
	}

}
