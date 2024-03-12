package projectJava113;

public class RatingBased extends RecommendationEngine{
	
	int size = 0;  //to store the local array size
	
	for(int i = 0 ; i < numOfMovies ; i++ ) { //this loop will determine the local array exact size
		if( movies[i].getRating >= 9 )
			size++;
	}
	
	Movie [] recommendationsArr = new String[size]; //creating a local array to store recommended movies 
	int j = 0; //just a counter for the local array
	
	for(int i = 0 ; i < numOfMovies ; i++ ) {
		if( movies[i].getRating >= 9 )
			recommendationsArr[j++] = movies[i]; // assigns top rated movies to the local array
	}
	
	return recommendationsArr; // returning an array of type movies
	
	
}
