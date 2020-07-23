package com.example.IntegrationTesting;

import java.util.Optional;
import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.IntegrationTesting.Dao.MovieRepository;
import com.example.IntegrationTesting.Model.Movie;
import com.example.IntegrationTesting.Service.MovieService;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class MovieServiceUnitTests {

	@InjectMocks
	private MovieService movieService;
	
	@Mock
	private MovieRepository movieRepository;
	
	@Before
	public void setup()
	{
		
	  MockitoAnnotations.initMocks(this);
	  
	}
	
	@Test
	public void givenMovieServiceWhenQueriedWithAnIdThenGetExpectedMovie()
	{
		Movie movie=new Movie(10L,"uri");
		Mockito.when(movieRepository.findById(10L))
		.thenReturn(Optional.ofNullable(movie));
	
		Movie result=movieService.retrieveMovies(10L);
		
		Assert.assertEquals(movie.getTitle().toLowerCase(),result.getTitle());
	}
	
}
