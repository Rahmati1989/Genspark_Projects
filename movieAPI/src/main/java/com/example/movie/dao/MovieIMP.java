package com.example.movie.dao;

import com.example.movie.entity.Movie;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class MovieIMP implements MovieDAO {
    private final EntityManager entityManager;
    @Autowired
    public MovieIMP(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Movie> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Movie> myQuery = currentSession.createQuery("from Movie");
        return myQuery.getResultList();
    }

    @Override
    @Transactional
    public Object findById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(Movie.class, theId);
    }

    @Override
    @Transactional
    public void saveOverUpdate(Movie theMovie) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theMovie);

    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Movie myMovie = currentSession.get(Movie.class, theId);
        currentSession.delete(myMovie);

    }
}
