
class Parent
{
	private int a = 10;
	void print() {
		System.out.println(a);
	}
}
public class Private_check extends Parent{

	public static void main(String[] args) {
		Parent obj = new Parent();
		obj.print();
		System.out.println(obj.a);
		
	}

}





