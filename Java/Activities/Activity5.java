package examples;

public class Activity5 {
	
	    
	    public static void main(String []args) {
	        //Initialize title of the book
	        String title = "Harry Potter";
	       
	        Book newNovel = new MyBook();
	        newNovel.setTitle(title);
	        System.out.println("The title of the book is: " + newNovel.getTitle());
	    }
}
