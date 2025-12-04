package model;

import model.enums.RolUsuario;

public class Usuario {
    private int idUsuario;
    private String username;
    private String password;
    private RolUsuario rol;
    
    public Usuario(int idUsuario, String username, String password, RolUsuario rol) {
        this.idUsuario = idUsuario;
        this.username = username;
        this.password = password;
        this.rol = rol;
    }

    public int getIdUsuario() { return idUsuario; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public RolUsuario getRol() { return rol; }

    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }
    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }
    public void setRol(RolUsuario rol) { this.rol = rol; }
    
    @Override
    public String toString() {
        return "Usuario{" +
               "idUsuario=" + idUsuario +
               ", username='" + username + '\'' +
               ", rol=" + rol +
               '}';
    }
}
