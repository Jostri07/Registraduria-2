package Proyectoclase.SeguridadF.Repositorios;
import Proyectoclase.SeguridadF.Modelos.Rol;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioRol extends MongoRepository<Rol,String> {
}
