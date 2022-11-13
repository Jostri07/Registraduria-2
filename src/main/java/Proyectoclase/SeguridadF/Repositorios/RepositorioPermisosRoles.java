package Proyectoclase.SeguridadF.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import Proyectoclase.SeguridadF.Modelos.PermisosRoles;

public interface RepositorioPermisosRoles extends MongoRepository<PermisosRoles,String> {

}
