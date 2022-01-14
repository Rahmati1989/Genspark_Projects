package com.example.parts.dao;

import com.example.parts.entity.Parts;

import java.util.List;

public interface PartsDAO {
    List<Parts> findAll();
    Object findById(int theId);
    void saveOrUpdate(Parts theParts);
    void deleteById(int theId);
}
