package LEC25;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DEMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//B obj = new B();
//System.out.println(obj.getClass());
//
//A obj2 = new A();
//System.out.println(obj2.getClass());
//
//A obj3 = new B();
//System.out.println(obj3.getClass());

Intro obj =new Intro() {
};// DEMO$1 extends Intro

System.out.println(obj.getClass());


// DEMO$2 implements C
C obj1 = new C() {
	
	@Override
	public void fun() {
		// TODO Auto-generated method stub
		
	}
};System.out.println(obj1.getClass());

List<Integer>ll =new List<Integer>() {
	
	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Integer> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public Integer set(int index, Integer element) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public Integer remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public ListIterator<Integer> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public ListIterator<Integer> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public Integer get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean addAll(int index, Collection<? extends Integer> c) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean addAll(Collection<? extends Integer> c) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public void add(int index, Integer element) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean add(Integer e) {
		// TODO Auto-generated method stub
		return false;
	}
};

System.out.println(ll.getClass());

	}

}
