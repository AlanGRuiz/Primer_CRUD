package dao;

import entity.models.Bicycle;
import org.springframework.data.repository.CrudRepository;

public interface IBicycleDao extends CrudRepository<Bicycle, Long> {
//////Aquí es donde estatodo el CRUD ya hecho, por lo tanto se ocupa en la Implementacion
}
