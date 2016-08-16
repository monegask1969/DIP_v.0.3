/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.service;

import dip.dao.DogDAO;
import dip.domain.Dog;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author moneg
 */
public class DogServiceImpl implements DogService{

    @Autowired
    private DogDAO dogDAO;
    
    @Override
    public void addDog(Dog dog) {
        dogDAO.addDog(dog);
    }

    @Override
    public List<Dog> DogsList() {
        return dogDAO.DogsList();
    }

    @Override
    public void removeDog(Integer id) {
        dogDAO.removeDog(id);
    }
    
}
