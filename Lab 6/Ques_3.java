class Worker{
	String name;   // employee name
	int emp_no;    // employee id
	Worker(int emp_no, String name)   // constructor 
	{
		this.emp_no = emp_no;
		this.name = name;
	}
	void print()   // method to print the details 
	{
		System.out.println("ID : " + this.emp_no);
		System.out.println("Name : "+this.name);
	}
}
class DailyWorker extends Worker
{
	int rate;
	DailyWorker(int emp_no, String name, int rate)   // constructor
	{
		super(emp_no, name);   // calls the constructor of parent class 
		this.rate = rate;
	}
	void print()
	{
		super.print();
		System.out.println("Rate : "+this.rate);
	} 
	
	void ComPay(int hours)
	{
		if(hours > 7*24)
		{
			System.out.println("Wrong hours input !");
			return;
		}
		System.out.println("Total pay is : " + rate*hours);
	}
}
class SalariedWorker extends Worker
{
	int rate;
	SalariedWorker(int emp_no, String name, int rate)
	{
		super(emp_no, name);
		this.rate = rate;
	}
	void print()
	{
		super.print();    // calls the method of the parent class 
		System.out.println("Rate : "+this.rate);
	} 
	int hours = 40;
	void ComPay()
	{
		System.out.println("Total pay is : " + rate*hours);
	}
}
public class Ques_3 {
	public static void main(String[] args) {
		DailyWorker obj = new DailyWorker(1, "Chopper", 400);
		obj.print();
		obj.ComPay(89);
		SalariedWorker obj1 = new SalariedWorker(2, "Sanji", 1000);
		obj1.print();
		obj1.ComPay();
	}
}
