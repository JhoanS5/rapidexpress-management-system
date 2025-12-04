package service;

import dao.implementacion.MantenimientoDAOImpl;
import model.Mantenimiento;

import java.util.List;

public class ServicioMantenimiento {

    private MantenimientoDAOImpl mantenimientoDAO;

    public ServicioMantenimiento() {
        this.mantenimientoDAO = new MantenimientoDAOImpl();
    }

    public void registrarMantenimiento(Mantenimiento mantenimiento) throws Exception {
        mantenimientoDAO.crearMantenimiento(mantenimiento);
    }

    public void actualizarMantenimiento(Mantenimiento mantenimiento) throws Exception {
        mantenimientoDAO.actualizarMantenimiento(mantenimiento);
    }

    public void eliminarMantenimiento(int id) throws Exception {
        mantenimientoDAO.eliminarMantenimiento(id);
    }

    public Mantenimiento obtenerMantenimientoPorId(int id) throws Exception {
        return mantenimientoDAO.obtenerMantenimientoPorId(id);
    }

    public List<Mantenimiento> obtenerMantenimientosPorVehiculo(int idVehiculo) throws Exception {
        return mantenimientoDAO.obtenerMantenimientosPorVehiculo(idVehiculo);
    }
}
