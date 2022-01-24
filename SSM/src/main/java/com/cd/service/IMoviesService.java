package com.cd.service;

import com.cd.domain.Movie;

import java.util.List;

/**
 * @author cdviviany
 * @version 1.00
 */
public interface IMoviesService {
    List<Movie> findAll();
    //根据id查询电影
     Movie findMovieById(Integer id);

    //增加电影
     void addMovie(Movie movie);

    //删除电影
     void deleteMovieById(Integer id);

    //修改电影信息
     void modifyMovie(Movie movie);
}
