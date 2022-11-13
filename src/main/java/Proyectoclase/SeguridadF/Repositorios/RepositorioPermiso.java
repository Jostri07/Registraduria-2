package Proyectoclase.SeguridadF.Repositorios;
import Proyectoclase.SeguridadF.Modelos.Permiso;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioPermiso extends MongoRepository<Permiso,String> {
}
