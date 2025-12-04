package service;

import dao.implementacion.VehiculoDAOImpl;
import model.Vehiculo;
import java.util.List;

public class ServicioVehiculo {
    private VehiculoDAOImpl vehiculoDAO;

    public ServicioVehiculo() {
        this.vehiculoDAO = new VehiculoDAOImpl();
    }

    public void crearVehiculo(Vehiculo vehiculo) throws Exception {
        vehiculoDAO.crearVehiculo(vehiculo);
    }

    public void actualizarVehiculo(Vehiculo vehiculo) throws Exception {
        vehiculoDAO.actualizarVehiculo(vehiculo);
    }

    public void eliminarVehiculo(int idVehiculo) throws Exception {
        vehiculoDAO.eliminarVehiculo(idVehiculo);
    }

    public Vehiculo obtenerVehiculoPorId(int id) throws Exception {
        return vehiculoDAO.obtenerVehiculoPorId(id);
    }

    public List<Vehiculo> listarVehiculos() throws Exception {
        return vehiculoDAO.obtenerTodosVehiculos();
    }
}
