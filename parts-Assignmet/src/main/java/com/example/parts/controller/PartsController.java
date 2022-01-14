package com.example.parts.controller;

import com.example.parts.entity.Parts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import com.example.parts.service.PartsService;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000"})
@RestController
//@RequestMapping("/parts")
public class PartsController {
    private final PartsService partsService;
    @Autowired
    public PartsController(@Qualifier("partsServiceIMPL")PartsService partsService) {
        this.partsService = partsService;
    }
    @GetMapping("/retrieveAllParts/{partsId}")
    public Parts findById(@PathVariable int partsId){return (Parts) partsService.findById(partsId);}
    //http://localhost:8085/retrieveAllParts
    @GetMapping("/retrieveAllParts")
    public List<Parts> findAll() {
        return partsService.findAll();
    }

    //http://localhost:8085/addParts
    @PostMapping("/addParts")
    public Parts addParts(@RequestBody Parts theParts) {

        theParts.setId(0);


        partsService.saveOrUpdate(theParts);
        return theParts;
    }
    //http://localhost:8085/updateParts
    @PutMapping("/updateParts")
    public Parts updateParts(@RequestBody Parts updateParts) {
        partsService.saveOrUpdate(updateParts);
        return updateParts;
    }
    //http://localhost:8080/deleteParts/1
    @DeleteMapping("/deleteParts/{partsId}")
    public String deletePart(@PathVariable int partsId) {
        partsService.deleteById(partsId);
        return "Deleted parts id : " + partsId;
    }

}
