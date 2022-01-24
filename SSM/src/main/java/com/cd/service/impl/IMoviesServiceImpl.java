package com.cd.service.impl;

import com.cd.dao.IMoviesDao;
import com.cd.domain.Movie;
import com.cd.service.IMoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author cdviviany
 * @version 1.00
 */
@Service("MoviesService")
public class IMoviesServiceImpl implements IMoviesService {
    @Autowired
    private IMoviesDao iMoviesDao;
    @Override
    public List<Movie> findAll() {
        System.out.println("IMoviesService方法执行。。。。");
        return iMoviesDao.findAll();
    }

    @Override
    public Movie findMovieById(Integer id) {
        return iMoviesDao.findById(id);
    }

    @Override
    public void addMovie(Movie movie) {
        iMoviesDao.addMovie(movie);
    }

    @Override
    public void deleteMovieById(Integer id) {
        iMoviesDao.deleteMovieById(id);
    }

    @Override
    public void modifyMovie(Movie movie) {
        iMoviesDao.modifyMovie(movie);
    }
}
