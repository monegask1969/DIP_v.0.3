/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.dao;

import dip.domain.Dog;
import java.util.List;

/**
 *
 * @author moneg
 */
public interface DogDAO {
    
    public void addDog(Dog dog);
    public List<Dog> DogsList();
    public void removeDog(Integer id);
    
}
