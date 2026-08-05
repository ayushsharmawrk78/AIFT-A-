package lec20;

public interface Aryan {

	public  void hello() ;
	
	public void random();
	
	default void ans() {
		System.out.println("hello i am in ans");
	}
public  void batch() ;
}

