package view;

import controller.UsuarioController;
import model.Usuario;
import model.enums.RolUsuario;
import util.CLIUtils;

public class MenuPrincipalCLI {

    private UsuarioController usuarioController;

    public MenuPrincipalCLI() {
        this.usuarioController = new UsuarioController();
    }

    public void iniciar() {
        System.out.println("=======================================");
        System.out.println("   BIENVENIDO A RAPIDEXPRESS CLI");
        System.out.println("=======================================");

        Usuario usuario = null;
        while (usuario == null) {
            String username = CLIUtils.leerString("Ingrese su usuario");
            String password = CLIUtils.leerString("Ingrese su contraseña");
            usuario = usuarioController.login(username, password);
            if (usuario == null) {
                System.out.println("Usuario o contraseña incorrectos. Intente nuevamente.\n");
            }
        }

        System.out.println("\nLogin exitoso! Bienvenido, " + usuario.getUsername());
        // Redirigir según rol
        if (usuario.getRol() == RolUsuario.ADMIN) {
            MenuAdministradorCLI menuAdmin = new MenuAdministradorCLI(usuario);
            menuAdmin.iniciar();
        } else if (usuario.getRol() == RolUsuario.TRABAJADOR) {
            MenuTrabajadorCLI menuTrabajador = new MenuTrabajadorCLI(usuario);
            menuTrabajador.mostrarMenu();
        } else {
            System.err.println("Rol no reconocido. Saliendo del sistema.");
        }
    }

}
