package projectJava113;

public class MovieDataBase {

	private int numOfMovies;
	private Movie [] movies;
	private User user;
	
	public boolean addMovie(Movie M)
	{
		if(numOfMovies<movies.length)
		{
			movies[numOfMovies++]=M;
			return true;
		}
		return false;
		
	}
	
	public boolean removeMovie(Movie M) //remove with shift 
	{
		for (int i=0; i<numOfMovies;i++)
		if (movies[i].equals(M))
		{
			for (int j=0; j<numOfMovies-1;j++)
				movies[j]=movies[j+1];
			numOfMovies--;
			movies[numOfMovies]=null;
			return true;
		}
			return false;
	}
	
	public Movie searchMovie(String title)
	{
		Movie sm=new Movie();
		for (int i=0; i<numOfMovies;i++)
			if (movies[i].getTitle().equalsIgnoreCase(title))
			{
				return movies[i];
				
			}
		
return null;
	}
	
	public Movie [] getMovieList() {  //getters are useful for the engine class
		return movies;
	}
	
	public int getNumOfMovies() {
		return numOfMovies;
	}
	
	public void setUser(User u) {
		user = u;
	}
	
	public void getUser(User u ) {
		return user;
	}
	
	
}
