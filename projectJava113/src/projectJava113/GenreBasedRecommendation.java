package projectJava113;

public class GenreBasedRecommendation extends RecommendationEngine{
	
	public Movie [] recommendedMovies( MovieDataBase DB ) { //@override
		
	
		String [] userPreference = DB.getUser().getPreferredGeners() //to easly access the user preference list
		int preferenceCounter = DB.getUser().getCount(); // to easly access the number of existing preferences 
		Movie [] movieList = DB.getMovieList(); // to easly access the BIG movieList within this method
		
		int size = 0; ////to store the local array size
		for( int i = 0 ; i < DB.getNumOFMovies() ; i++) {
			for( int j = 0 ; j < preferenceCounter ; j++ ) {
				if( movieList[i].getGenre().equals( userPreference[j] ) ) // here the condition is the number of preferences that exist in the prefrences array
					size++ // increment the size each time the condition is satisfied
			}
			
		}	
		
		Movie [] recommendationsArr = new Movie[size]; //creating a local array to store recommended movies 
		int k = 0; //just a counter for the local array
		
		for( int i = 0 ; i < DB.getNumOFMovies() ; i++) {
			for( int j = 0 ; j < preferenceCounter ; j++ ) {
				if( movieList[i].getGenre().equals( userPreference[j] ) ) // here the condition is the number of preferences that exist in the prefrences array
					recomendationsArr[k++] = movieList[i] //assigns the movie to the local Array
			}
				
		}
		
		if(k==0)
			return null;
		else
			return recomendationsArr;

	}

}
