package service;

import dao.implementacion.ConductorDAOImpl;
import model.Conductor;
import model.enums.EstadoConductor;

import java.util.List;

public class ServicioConductor {

    private ConductorDAOImpl conductorDAO;

    public ServicioConductor() {
        this.conductorDAO = new ConductorDAOImpl();
    }

    public void crearConductor(Conductor conductor) throws Exception {
        conductorDAO.crearConductor(conductor);
    }

    public void actualizarConductor(Conductor conductor) throws Exception {
        conductorDAO.actualizarConductor(conductor);
    }

    public void eliminarConductor(int idConductor) throws Exception {
        conductorDAO.eliminarConductor(idConductor);
    }

    public Conductor obtenerConductorPorId(int id) throws Exception {
        return conductorDAO.obtenerConductorPorId(id);
    }

    public Conductor obtenerConductorPorIdentificacion(String identificacion) throws Exception {
        return conductorDAO.obtenerConductorPorIdentificacion(identificacion);
    }

    public List<Conductor> listarConductores() throws Exception {
        return conductorDAO.obtenerTodosConductores();
    }

    public boolean estaDisponible(Conductor conductor) {
        return conductor != null && conductor.getEstado() == EstadoConductor.ACTIVO;
    }
}
