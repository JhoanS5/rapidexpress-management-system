package dao.interfaces;

import model.Usuario;
import java.util.List;

public interface UsuarioDAO {
    void crearUsuario(Usuario usuario) throws Exception;
    void actualizarUsuario(Usuario usuario) throws Exception;
    void eliminarUsuario(int idUsuario) throws Exception;
    Usuario obtenerUsuarioPorId(int idUsuario) throws Exception;
    Usuario login(String username, String password) throws Exception;
    List<Usuario> obtenerTodos() throws Exception;
}
