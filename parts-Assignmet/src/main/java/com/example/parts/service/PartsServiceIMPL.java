package com.example.parts.service;

import com.example.parts.dao.PartsDAO;
import com.example.parts.entity.Parts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartsServiceIMPL implements PartsService {
    private final PartsDAO partsDOA;
    @Autowired
    public PartsServiceIMPL(PartsDAO partsDAO){
        this.partsDOA = partsDAO;
    }
    @Override
    public List<Parts> findAll() {
        return partsDOA.findAll();
    }

    @Override
    public Object findById(int partsId) {
        return partsDOA.findById(partsId);
    }

    @Override
    public void saveOrUpdate(Parts theParts) {
        partsDOA.saveOrUpdate(theParts);

    }

    @Override
    public void deleteById(int partsId) {
        partsDOA.deleteById(partsId);

    }
}
