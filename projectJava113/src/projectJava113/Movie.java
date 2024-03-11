package projectJava113;

public class Movie {

	private String title;
	private int releaseYear;
	private String genre;
	private double rating;
	private String director;

	
	public Movie()
	{
		title="";
		releaseYear=0;
		genre="";
		rating=0;
		director="";
	}


	public Movie(String title, int releaseYear, String genre, double rating, String director) {
		this.title = title;
		this.releaseYear = releaseYear;
		this.genre = genre;
		this.rating = rating;
		this.director = director;
	}
	
	public String getDetails()
	{
		String str= "Movie [Title=" + title + ", releaseYear=" + releaseYear + ", genre=" + genre + ", rating=" + rating
				+ ", director=" + director + "]";
		return str;
	}


	public String getGenre() {
		return genre;
	}







	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
