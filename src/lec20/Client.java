package lec20;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Introtoabstractclass obj = new Introtoabstractclass();
//
//obj.fun2();
		
//		Introtoabstractclass obj = new Introtoabstractclass() {
//			
//			@Override
//			public void fun2() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		
		
		Parent obj = new Parent() {
			
			@Override
			public int fun3() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public void fun2() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void fun() {
				// TODO Auto-generated method stub
				
			}
		};
	}

}
