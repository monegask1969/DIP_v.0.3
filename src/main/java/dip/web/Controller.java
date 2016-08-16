/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.web;

import dip.domain.Dog;
import dip.service.DogService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller
public class Controller {
    
    @Autowired
    private DogService dogService;
    
    @RequestMapping("/index")
    public String listDogs(Map<String, Object> map){
        map.put("dog", new Dog());
        map.put("dogsList", dogService.DogsList());
        
        return "dog";
    }
    
    @RequestMapping("/")
    public String home(){
        return "redirect:/index";
    }
    
    @RequestMapping(value="/add", method = RequestMethod.POST)
    public String addDog(@ModelAttribute("dog") Dog dog, BindingResult result){
        dogService.addDog(dog);
        return "redirect:/index";
    }
    
    @RequestMapping("/delete/{dogId}")
    public String deleteDog(@PathVariable("dogId") Integer dogId){
        dogService.removeDog(dogId);
        
        return "redirect:/index";
    }
}
