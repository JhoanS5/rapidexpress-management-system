package controller;

import model.Auditoria;
import service.ServicioAuditoria;

import java.util.List;

public class AuditoriaController {

    private ServicioAuditoria auditoriaService;

    public AuditoriaController() {
        this.auditoriaService = new ServicioAuditoria();
    }

    public void registrarAccion(String usuario, String accion, String detalles) {
        try {
            Auditoria auditoria = new Auditoria(usuario, accion, detalles);
            auditoriaService.registrarAccion(auditoria);
            System.out.println("Acción registrada en auditoría: " + auditoria);
        } catch (Exception e) {
            System.err.println("Error al registrar auditoría: " + e.getMessage());
        }
    }

    public void listarTodas() {
        try {
            List<Auditoria> lista = auditoriaService.obtenerTodas();
            lista.forEach(System.out::println);
        } catch (Exception e) {
            System.err.println("Error al listar auditoría: " + e.getMessage());
        }
    }

    public void listarPorUsuario(String usuario) {
        try {
            List<Auditoria> lista = auditoriaService.obtenerPorUsuario(usuario);
            lista.forEach(System.out::println);
        } catch (Exception e) {
            System.err.println("Error al listar auditoría por usuario: " + e.getMessage());
        }
    }
}
