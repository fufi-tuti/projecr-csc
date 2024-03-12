package projectJava113;

public class abstract RecommendationEngine {
	
	public String [] recommendedMovies(User user); //will be overridden in subclasses
	
	public String getRecommendation(User user) { //retrieves recommendations as a string
		
		String [] moviesArray = recommendedMovies(user); //this will hold array of favorite movies
		String str = "";  // will accumulate movies on this string
		
		for( int i = 0 ; i < moviesArray.length ; i++ ) { // a loop to accumulate movies on str
			str += moviesArray[i]+"\n" //new line for each movie
		}
		
		return str; //returning recommended movies as a string
			
		
	}

}
