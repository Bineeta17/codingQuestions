package com.example.IntegrationTesting.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.IntegrationTesting.Model.Movie;
import com.example.IntegrationTesting.Service.MovieService;


@RestController
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	
	
	public MovieController(MovieService movieService) {
		this.movieService = movieService;
	}

	@GetMapping("/movies")
	public List<Movie> retrieveAllMovies()
	{
		return movieService.retrieveAllMovies();
	}
	
	@GetMapping("/movies/{id}")
	public Movie retrieveMovies(@PathVariable long id)
	{
		return movieService.retrieveMovies(id);
	}
	
	public long createMovie(@RequestBody Movie movie)
	{
		return movieService.createMovie(movie);
	}
	
	
	

}
