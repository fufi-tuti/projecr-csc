package projectJava113;

public class abstract RecommendationEngine {
	
	public Movie [] recommendedMovies( MovieDataBase DB); //will be overridden in subclasses
	
	
	public void displayRecommendations( MovieDataBase DB ) {
		Movie [] recommendations = recommendedMovies( DB ); // calling the needed recomendation method
		for( int i = 0 ; i < recommendations.length ; i++ ) { // i used .length because i know for sure this array is full.
			System.out.println( recommendations[i].getDetails() )
			System.out.println(); // just a new line to enhance readability.
			
		}
	}
	
	/*public String getRecommendation(User user) { //retrieves recommendations as a string
		
		Movie [] recommends = recommendedMovies(user); //creating a local array and assigning it to the output of this method
		String str = ""; // a string to accumulate movies names on it
		
		for ( int i = 0 ; i < recommends.length ; i++ ) {
			
			str += recommends[i].getDetails() + "\n\n"; //accumulate movie names over str
		}
		
		return str;*/ 

}
