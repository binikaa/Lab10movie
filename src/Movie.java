
public class Movie {
	private String title,catagory;
	public String toString()
	{
		return (" The names of movies with" + catagory + " catagory ");
	}
	
	public Movie(String catagory)
	{
	
		this.setCatagory(catagory);
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
