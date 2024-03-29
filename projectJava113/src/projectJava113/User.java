package projectJava113;

public class User {
  private String Name;
	private String preferredGeners [];
	private int count;
	
	public User(String name ) {
	Name=name;
	preferredGeners=new String[5];
	count=0;
}
	
	
	public boolean addpreferredGenre(String genre)	{
	
		if (count<preferredGeners.length) {
			preferredGeners[count]=genre;
			return true; 
		}
		else return false;
	}	
	public boolean removeGenre(String genre) {
	
		for (int i =0 ; i<count ;i++)
			if(preferredGeners[i].getGenre().equals(genre) ) {
				
				preferredGeners[i]=preferredGeners[count-1];
				count--;
				preferredGeners[count]=null;
				return true;
		
			}
		return false;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String[] getPreferredGeners() {
		return preferredGeners;

	}
	
	public int getCount() {
		return count;
	}


}
