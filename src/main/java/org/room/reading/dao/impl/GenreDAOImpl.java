package org.room.reading.dao.impl;

import org.hibernate.SessionFactory;
import org.room.reading.dao.interfaces.GenreDAO;
import org.room.reading.entities.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Анастасия on 04.05.2015.
 */
@Component
public class GenreDAOImpl implements GenreDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public List<Genre> getGenres() {
        return sessionFactory.getCurrentSession().createCriteria(Genre.class).list();
    }

}
