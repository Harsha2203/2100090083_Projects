package Singleton;

public class SingleObject {

	private static SingleObject Instance=new SingleObject();
	
	private SingleObject() {
		
	}
	
	public static SingleObject getInstance() {
		return Instance;
	}
	
	public void showMsg() {
		System.out.println("Hello World this is Sharath HACKER 'hahaha' ");
	}
}

package Singleton;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		SingleObject obj=SingleObject.getInstance();
		obj.showMsg();
	}

}
