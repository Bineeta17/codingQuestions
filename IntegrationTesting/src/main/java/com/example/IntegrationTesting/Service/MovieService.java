package com.example.IntegrationTesting.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.IntegrationTesting.Dao.MovieRepository;
import com.example.IntegrationTesting.Model.Movie;


@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepository;
	
	public List<Movie> retrieveAllMovies()
	{
		return movieRepository.findAll();
	}
	
	public Movie retrieveMovies(@PathVariable long id)
	{
		Movie movie=movieRepository.findById(id).get();
		Movie response=new Movie();
		response.setTitle(movie.getTitle().toLowerCase());
		return response;
		
	}
	
	public long createMovie(@RequestBody Movie movie)
	{
		return movieRepository.save(movie).getId();
	}

}
