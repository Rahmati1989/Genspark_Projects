package com.example.parts.dao;

import com.example.parts.entity.Parts;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;
@Repository
public class PartsIMPL implements PartsDAO {

    private final EntityManager entityManager;

    @Autowired
    public PartsIMPL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Parts> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Parts> myQuery = currentSession.createQuery("from Parts");
        return myQuery.getResultList();
    }

    @Override
    @Transactional
    public Parts findById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(Parts.class, theId);
    }

    @Override
    @Transactional
    public void saveOrUpdate(Parts theParts) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theParts);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Parts myParts = currentSession.get(Parts.class, theId);
        currentSession.delete(myParts);
    }

}
