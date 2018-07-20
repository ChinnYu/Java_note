package com.jason;

public class Test {

	public static void main(String[] args) {
		
		Cat cat = new Cat("¤p¥Õ",2);
		try {
			Cat newCat = (Cat) cat.clone();
			
			System.out.println("cat="+cat);
			System.out.println("new cat="+newCat);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
