package services;

import entity.models.Bicycle;

import java.util.List;

public interface IBicycleService {

    public Bicycle get(long id); //Read
    public List<Bicycle> getAll();
    public void post(Bicycle bicycle); //Create
    public void put(Bicycle bicycle, long id); //Update
    public void  delete(long id); //Delete

}
