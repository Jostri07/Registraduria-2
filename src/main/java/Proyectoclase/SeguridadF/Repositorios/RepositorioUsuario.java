package Proyectoclase.SeguridadF.Repositorios;
import Proyectoclase.SeguridadF.Modelos.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioUsuario extends MongoRepository<Usuario,String> {
}