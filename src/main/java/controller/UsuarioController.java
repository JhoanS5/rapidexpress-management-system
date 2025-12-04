package controller;

import model.Usuario;
import service.ServicioUsuario;

import java.util.List;

public class UsuarioController {

    private ServicioUsuario usuarioService;

    public UsuarioController() {
        this.usuarioService = new ServicioUsuario();
    }

    public void registrarUsuario(Usuario usuario) {
        try {
            usuarioService.registrarUsuario(usuario);
            System.out.println("Usuario registrado: " + usuario);
        } catch (Exception e) {
            System.err.println("Error al registrar usuario: " + e.getMessage());
        }
    }

    public void actualizarUsuario(Usuario usuario) {
        try {
            usuarioService.actualizarUsuario(usuario);
            System.out.println("Usuario actualizado: " + usuario);
        } catch (Exception e) {
            System.err.println("Error al actualizar usuario: " + e.getMessage());
        }
    }

    public void eliminarUsuario(int idUsuario) {
        try {
            usuarioService.eliminarUsuario(idUsuario);
            System.out.println("Usuario eliminado con ID: " + idUsuario);
        } catch (Exception e) {
            System.err.println("Error al eliminar usuario: " + e.getMessage());
        }
    }

    public void listarUsuarios() {
        try {
            List<Usuario> lista = usuarioService.obtenerTodos();
            lista.forEach(System.out::println);
        } catch (Exception e) {
            System.err.println("Error al listar usuarios: " + e.getMessage());
        }
    }

    public Usuario login(String username, String password) {
        try {
            Usuario usuario = usuarioService.login(username, password);
            if (usuario != null) {
                System.out.println("Login exitoso: " + usuario);
                return usuario;
            } else {
                System.err.println("Usuario o contraseña incorrectos.");
            }
        } catch (Exception e) {
            System.err.println("Error en login: " + e.getMessage());
        }
        return null;
    }
}
