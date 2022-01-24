package com.cd.controller;

import com.cd.domain.Movie;
import com.cd.service.IMoviesService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author cdviviany
 * @version 1.00
 */
@Controller
@RequestMapping("/moviesController")
public class MoviesController {
    @Autowired
    private IMoviesService iMoviesService;
    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("findAll方法执行");
        List<Movie> movies = iMoviesService.findAll();
        model.addAttribute("movies",movies);
        return "success";
    }
    @RequestMapping("/findOne")
    public String findOne(Integer id,Model model){
        Movie movie = iMoviesService.findMovieById(id);
        model.addAttribute("movie",movie);
        return "success";
    }
    @RequestMapping("/addMovie")
    public String addMovie(Movie movie,Model model){
        iMoviesService.addMovie(movie);
        return "success";
    }
    @RequestMapping("/modifyMovie")
    public String modifyMovie(Movie movie,Model model){
        iMoviesService.modifyMovie(movie);
        return "success";
    }
    @RequestMapping("/deleteMovie")
    public String deleteMovie(Integer id,Model model){
       iMoviesService.deleteMovieById(id);
        return "success";
    }

}
