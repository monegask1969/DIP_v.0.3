/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.dao;

import dip.domain.Dog;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author moneg
 */
public class DogDAOImpl implements DogDAO{
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addDog(Dog dog) {
        sessionFactory.getCurrentSession().save(dog);
    }

    @Override
    public List<Dog> DogsList() {
        return sessionFactory.getCurrentSession().createQuery("from Dogs").list();
    }

    @Override
    public void removeDog(Integer id) {
        Dog dog = (Dog) sessionFactory.getCurrentSession().load(Dog.class, id);
        if(null != dog){
            sessionFactory.getCurrentSession().delete(dog);
        }
    }
    
}
