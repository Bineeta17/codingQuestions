package com.example.IntegrationTesting.Dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.IntegrationTesting.Model.Movie;


@Repository
public interface MovieRepository extends JpaRepository<Movie,Long>{

}
