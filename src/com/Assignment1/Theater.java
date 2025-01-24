package com.Assignment1;

public class Theater {
	// Global Variables
	String movieName;
	String movie_time;

	public void watch_movie() {
		System.out.println(" Watching " + movieName);
		System.out.println(" Watching " + movie_time);
	}

	public static void main(String[] args) {
		// Instance of the class/ Objects
		Theater movie1 = new Theater();
		Theater movie2 = new Theater();

		// Setting values for movie1
		movie1.movieName = "Jailer";
		movie1.movie_time = "6:30 PM";

		// Setting values for movie2
		movie2.movieName = "Leo";
		movie2.movie_time = "7:00 PM";

		// Calling watch_movie method using both instances
		movie1.watch_movie();
		movie2.watch_movie();

	}
}
