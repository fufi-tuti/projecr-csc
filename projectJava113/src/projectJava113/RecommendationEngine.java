package projectJava113;

public class abstract RecommendationEngine {
	
	public String [] recommendedMovies(User user); //will be overridden in subclasses
	
	
	public String getRecommendation(User user) { //retrieves recommendations as a string
		
		Movie [] recommends = recommendedMovies(user); //creating a local array and assigning it to the output of this method
		String str = ""; // a string to accumulate movies names on it
		
		for ( int i = 0 ; i < recommends.length ; i++ ) {
			
			str += recommends[i].getDetails() + "\n\n"; //accumulate movie names over str
		}
		
		return str;

}
