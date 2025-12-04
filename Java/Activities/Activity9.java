package examples;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<String> myList = new ArrayList<String>();
       myList.add("Name1");
       myList.add("Name2");
       myList.add("Name3");
       myList.add("Name4");
       myList.add("Name5");
       
       for(String s:myList){
           System.out.println(s);
       }
       
       System.out.println("3rd element in the list is: " + myList.get(2));
       System.out.println("Is Name4 is in list: " + myList.contains("Name4"));
       System.out.println("Size of ArrayList: " + myList.size());
       
       myList.remove("Name5");
       
       System.out.println("New Size of ArrayList: " + myList.size());

       
	}
	
	
}
