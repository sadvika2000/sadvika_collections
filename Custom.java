package epam.task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
public  class Custom implements Collection<String >
{   

	ArrayList<String> al=new ArrayList<String>(Arrays.asList("one","two","three","4","five","6","seven","8","9","10"));

	public boolean add(String e)       //This method will add the strings o the list
	{    
		return al.add(e);
	}
	
	public boolean remove(Object o)       //This method will remove the elements from the list
	{
		return al.remove(o);
	}
	
	public void printAll()                //This method will print all the strings present in the list
	{
		System.out.println(al);
	}
	
	public void fetch(String i)                 //This method will give us the index value of the string we give in the list
	{
		int in=al.indexOf(i);                 
		System.out.println(in);
	}
	
	
	
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	

	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}
	public boolean addAll(Collection<? extends String> c) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}