package services;

import dao.IBicycleDao;
import entity.models.Bicycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BicycleServiceImpl implements IBicycleService{

    @Autowired
    private IBicycleDao bicycleDao;

    @Override
    public Bicycle get(long id) {
        return bicycleDao.findById(id).get();
    }

    @Override
    public List<Bicycle> getAll() {
        return (List<Bicycle>) bicycleDao.findAll(); //aquí podría recibir un bicycle y convertir a lista<>? o eso se hace en el COR?
    }

    @Override
    public void post(Bicycle bicycle) {
        bicycleDao.save(bicycle);
    }

    @Override
    public void put(Bicycle bicycle, long id) {
        bicycleDao.findById(id).ifPresent(x->{
            bicycle.setId(id);
            bicycleDao.save(bicycle);
        });
    }

    @Override
    public void delete(long id) {
        bicycleDao.deleteById(id);
    }
}
