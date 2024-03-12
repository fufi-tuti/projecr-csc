package projectJava113;

public class MovieDataBase {

	private int numOfMovies;
	public Movie [] movies;
	
	public boolean addMovie(Movie M)
	{
		if(numOfMovies<movies.length)
		{
			movies[numOfMovies++]=M;
			return true;
		}
		return false;
		
	}
	
	public boolean removeMovie(Movie M)
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
	
}
