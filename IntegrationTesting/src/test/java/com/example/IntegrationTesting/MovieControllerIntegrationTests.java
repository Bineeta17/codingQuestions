package com.example.IntegrationTesting;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.IntegrationTesting.Controller.MovieController;
import com.example.IntegrationTesting.Model.Movie;
import org.junit.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MovieControllerIntegrationTests {
	
	@Autowired
	private MovieController movieController;

	 @Test
	    public void givenMovieControllerWhenQueriedWithAnIdThenGetExpectedMovie() {
	        Movie movie = new Movie(10L,"uri");
	        movieController.createMovie(movie);
	 
	        Movie result = movieController.retrieveMovies(10L);
	 
	        Assert.assertEquals(movie.getTitle().toLowerCase(), result.getTitle());
	    }
}
