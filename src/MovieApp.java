import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieApp {
	
        
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to the Movie List Application!\n");
		System.out.println("There are 10 movies in this list");
		String userChoice = "y";
		do {
		
		System.out.println("We have 4 catogories\n 1) animated\n 2) drama \n 3) horror\n 4) scifi\n");
		System.out.println("Which catagory number are you interedted in?");
		Scanner scr = new Scanner(System.in);
		String catagory = scr.nextLine();
		Movie m = new Movie(catagory);
		switch(m.getCatagory())
		{ 
		case "1": addAnimatedMovies();break;
		case "2": addDramaMovies();break;
		case "3":addHorrorMovies();break;
		case "4":addScifiMovies();break;
		
		}
		System.out.println("continue?(y/n)");
		userChoice= scr.nextLine();
	}while(userChoice.equals("y"));
		if(userChoice.equals("n"))
			System.exit(0);
			
	}	

	
	public static void addAnimatedMovies()
	{
		List<String> animated = new ArrayList<>();
		animated.add("Frozen");animated.add("Incredible 2");animated.add("Zootopia");
		System.out.println(animated);
		
	}
	public static void addDramaMovies()

	{
		List<String> drama = new ArrayList<>();
		drama.add("Moonlight");drama.add("A star is born");drama.add("96");drama.add("Wonder women");
		System.out.println(drama);
	}
	public static void addHorrorMovies()
	{
		List<String> horror= new ArrayList<>();
		horror.add("Vvitch");horror.add("it");horror.add("snister");
		System.out.println(horror);
	}
	public static void addScifiMovies()
	{
		List<String> scifi = new ArrayList<>();
		scifi.add("StarWars");
		System.out.println(scifi);
	}	
		
	}


