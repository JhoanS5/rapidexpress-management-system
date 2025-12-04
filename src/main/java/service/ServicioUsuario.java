package service;

import dao.implementacion.UsuarioDAOImpl;
import model.Usuario;

import java.util.List;

public class ServicioUsuario {

    private UsuarioDAOImpl usuarioDAO;

    public ServicioUsuario() {
        this.usuarioDAO = new UsuarioDAOImpl();
    }

    public void registrarUsuario(Usuario usuario) throws Exception {
        usuarioDAO.crearUsuario(usuario);
    }

    public void actualizarUsuario(Usuario usuario) throws Exception {
        usuarioDAO.actualizarUsuario(usuario);
    }

    public void eliminarUsuario(int idUsuario) throws Exception {
        usuarioDAO.eliminarUsuario(idUsuario);
    }

    public Usuario obtenerUsuarioPorId(int idUsuario) throws Exception {
        return usuarioDAO.obtenerUsuarioPorId(idUsuario);
    }

    public Usuario login(String username, String password) throws Exception {
        return usuarioDAO.login(username, password);
    }

    public List<Usuario> obtenerTodos() throws Exception {
        return usuarioDAO.obtenerTodos();
    }
}
