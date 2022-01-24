package com.cd.test;

import com.cd.dao.IMoviesDao;
import com.cd.domain.Movie;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.plaf.SpinnerUI;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author cdviviany
 * @version 1.00
 */
public class TestMybatis {
    private IMoviesDao iMoviesDao;
    private SqlSession sqlSession;
    @Before
    public void init() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
         sqlSession = sqlSessionFactory.openSession();
         iMoviesDao = sqlSession.getMapper(IMoviesDao.class);
    }
    @After
    public void destroy(){
        sqlSession.close();
    }
    @Test
    public void test(){
        List<Movie> all = iMoviesDao.findAll();
        for (Movie movie : all) {
            System.out.println(movie);
        }
    }
}
