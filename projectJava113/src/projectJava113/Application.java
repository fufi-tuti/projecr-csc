package projectJava113;
import java.util.*;
public class Application {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		MovieDataBase DB1 = new MovieDataBase(100);
		
		Movie mov1=new Movie("Inception",2010,"Action,Sci-fi",8.8,"Christopher Nolan");
		Movie mov2=new Movie("Movie mov1=new Movie",2008,"Action,Drama",9.0,"Christopher Nolan");
		
		DB1.addMovie(mov1);
		DB1.addMovie(mov2);
		
		
		System.out.println("please write your first name ");
		String Uname=input.next();
		
		User user1= new User(Uname);
		DB1.setUser(user1);
		
		int count=0;
		do {
			System.out.println("Enter your favorite genre");
			String genre =input.next();
			if(user1.addpreferredGenre(genre))
				System.out.println("the Genre aded sucessfully");
			else 
				System.out.println(	"could not be added" );
			
			System.out.println("Do you wnat to exit to the main menu?");
			boolean answer=input.next();
			if(answer)
		       break;
	
		}while(++count<5);
		
		boolean running =true;
		
		do {
			System.out.println("welcome to Movie Recommendation program ");
		    System.out.println("1_add a movie");
			System.out.println("2_remove a movie");
			System.out.println("3_search for a movie");
			System.out.println("4-add preferred genre");
			System.out.println("5_remove preferred movie");
			System.out.println("6_recommend moives");
			System.out.println("7-exit");
			
			boolean validinput=true;
			int choice;
			do {
				System.out.println("choose one of the option");
				choice=input.nextInt();
				if(choice<=7&choice>0)
					validinput=false;
				
			}while(validinput);
				
				switch (choice) {
				
				case 1: 
				System.out.println("enter a a movie name \n the release year \n the genre \n the rating\n the diroctor");
				String Mname =input.next();
				int yearRelease =input.nextInt();
				String genre =input.next();
				double Mrating=input.nextDouble();
				String Mdiroctor =input.next();
				
				Movie move3=new Movie(Mname,yearRelease,genre,Mrating,Mdiroctor);
				
		        addMovie(mov3);
				break;
				
				case 2:
					System.out.println("enter a Movie you wnt to remove");
					String name = input.next();
					if(DB1.searchMovive(name).equals(null))
						System.out.println("no movie was found with the given name");
					else
						Movie LocalMovie =DB1.searchMovie(name);
					    if (DB1.removeMoive(LocalMovie))
					    	System.out.println("movie was removed successfully");
					    else
					    	System.out.println("Movie is not removed");
					    
					    break;
					    
				case 3 :
					
					Movie localMoive =DB1.getMoiveList();
					
					System.out.println("enter a movie you want to search ");
					String mname=input.next();
					
					Movie goalMovie =DB1.saerchMovie(mname);
					
					if (goalMovie.eqauls(null))
						System.out.println("No movie was found");
					else 
						System.out.println(goalMovie.diplay());
					
					break;
					
				case 4:
					
					System.out.println("what genre do you want to add into your favorite collectin ");
					String favgenre=input.next();
					if (user1.addpreferredGenre(favgenre))
						System.out.println("your favorite genre was added into your into your collectin successfully");
					else 
						System.out.println(" sorry your favorite genre could not be added");
					
					break;
					
				case 5 :
					
					System.out.println("what genre do you want to remove from your collectin");
					String remgenre=input.next();
					if (user1.getremoveGenre(remgenre))
						System.out.println("the genre is removed from your  collectin successfully");
					else 
						System.out.println(" sorry failed to remove");
					
					break;
					
				case 6 :
					
					
					
					break;
					
				case 7: 
					
			System.out.println("Goodbey hope to see you soon");
			   running = false;
			   
			   break;
					
					
					
					
					
				}	
		}while(running);
	}

}
