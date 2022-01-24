package com.cd.test;

import com.cd.domain.Movie;
import com.cd.service.IMoviesService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author cdviviany
 * @version 1.00
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestSpring {
    @Autowired
    private IMoviesService iMoviesService;
    @Test
    public void test(){
        List<Movie> all = iMoviesService.findAll();
        for (Movie movie : all) {
            System.out.println(movie);
        }

    }
}
