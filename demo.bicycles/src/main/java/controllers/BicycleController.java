package controllers;

import entity.models.Bicycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.IBicycleService;

import java.util.List;

@RestController
public class BicycleController{

    @Autowired
    IBicycleService bicycleService;

    @GetMapping("/bicycles")
    public List<Bicycle> getAllBicycles(){
        return bicycleService.getAll();
    }

    @GetMapping("/bicycle/{id}")
    public Bicycle getOne(@PathVariable(value = "id") long id){
        return bicycleService.get(id);
    }

    @PostMapping("/bicycle")
    public void add(Bicycle bicycle){
        bicycleService.post(bicycle);
    }

    @PutMapping("/bicycle")
    public void update(Bicycle bicycle, Long id){
        bicycleService.put(bicycle, id);
    }
}
