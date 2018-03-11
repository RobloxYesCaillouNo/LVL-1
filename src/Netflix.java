
public class Netflix {
public static void main(String[] args) {
	Movie movie = new Movie("How2Robux",5);
	Movie movie1 = new Movie("Escape the tycoon obby", 3);
	Movie movie2 = new Movie("This movie sucks", 4);
	Movie movie3 = new Movie("Great movie 2019", 2);
	Movie movie4 = new Movie("Who Murdered Telamon?", 1);
String price = movie.getTicketPrice();
	System.out.println(price);
	
NetflixQueue que = new NetflixQueue();	
que.addMovie(movie);
que.addMovie(movie1);
que.addMovie(movie2);
que.addMovie(movie3);
que.addMovie(movie4);
que.printMovies();
System.out.println("The best movie is " + que.getBestMovie());

que.sortMoviesByRating();
System.out.println("The second best movie is " + que.getMovie(1));
}
}
