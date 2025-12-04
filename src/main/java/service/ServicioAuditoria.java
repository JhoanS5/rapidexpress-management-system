package service;

import dao.implementacion.AuditoriaDAOImpl;
import model.Auditoria;

import java.util.List;

public class ServicioAuditoria {

    private AuditoriaDAOImpl auditoriaDAO;

    public ServicioAuditoria() {
        this.auditoriaDAO = new AuditoriaDAOImpl();
    }

    public void registrarAccion(Auditoria auditoria) throws Exception {
        auditoriaDAO.registrarAccion(auditoria);
    }

    public List<Auditoria> obtenerTodas() throws Exception {
        return auditoriaDAO.obtenerTodas();
    }

    public List<Auditoria> obtenerPorUsuario(String usuario) throws Exception {
        return auditoriaDAO.obtenerPorUsuario(usuario);
    }
}
