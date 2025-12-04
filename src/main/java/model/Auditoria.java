package model;

import java.time.LocalDateTime;

public class Auditoria {

    private int idAuditoria;
    private String usuario;
    private String accion;
    private String detalles;
    private LocalDateTime fechaHora;

    public Auditoria() {}

    public Auditoria(int idAuditoria, String usuario, String accion, String detalles, LocalDateTime fechaHora) {
        this.idAuditoria = idAuditoria;
        this.usuario = usuario;
        this.accion = accion;
        this.detalles = detalles;
        this.fechaHora = fechaHora;
    }

    public Auditoria(String usuario, String accion, String detalles) {
        this.usuario = usuario;
        this.accion = accion;
        this.detalles = detalles;
    }

    public int getIdAuditoria() {
        return idAuditoria;
    }

    public void setIdAuditoria(int idAuditoria) {
        this.idAuditoria = idAuditoria;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    @Override
    public String toString() {
        return "Auditoria{" +
                "idAuditoria=" + idAuditoria +
                ", usuario='" + usuario + '\'' +
                ", accion='" + accion + '\'' +
                ", detalles='" + detalles + '\'' +
                ", fechaHora=" + fechaHora +
                '}';
    }
}
