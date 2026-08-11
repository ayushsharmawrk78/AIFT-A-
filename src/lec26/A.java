package lec26;

public class   A  <T,K>{

	T obj;
	K datamember;
	int val;
	
	
	public A(T value) {
		this.obj=value;
	}
	public void setvalue(K ele) {
		this.datamember=ele;
	}
	
	
	public T fun() {
		return obj;
	}
	public <M> void fun2(int val , M data) {
		int a =1;
		//data = val+data;

		System.out.println(data);
		System.out.println(val);
	}
}
