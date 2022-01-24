package com.cd.dao;

import com.cd.domain.Movie;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author cdviviany
 * @version 1.00
 */

public interface IMoviesDao {

    @Select("SELECT * FROM movie_list")
    List<Movie> findAll();
    //根据id查询电影
    @Select("SELECT * FROM movie_list WHERE id = #{id}")
    Movie findById(Integer id);

    //增加电影
    @Insert("INSERT  INTO movie_list(`name`,`director`,`actor`) VALUES(#{name},#{director},#{actor})")
    void addMovie(Movie movie);

    //删除电影
    @Delete("DELETE FROM movie_list WHERE id = #{id}")
    void deleteMovieById(Integer id);
    //修改电影信息
    @Update("UPDATE movie_list SET `name` = #{name},`director`= #{director},`actor`= #{actor} WHERE id = #{id}")
    void modifyMovie(Movie movie);
}
