package dao.interfaces;

import model.Vehiculo;
import java.util.List;

public interface VehiculoDAO {
    void crearVehiculo(Vehiculo vehiculo) throws Exception;
    void actualizarVehiculo(Vehiculo vehiculo) throws Exception;
    void eliminarVehiculo(int idVehiculo) throws Exception;
    Vehiculo obtenerVehiculoPorId(int idVehiculo) throws Exception;
    List<Vehiculo> obtenerTodosVehiculos() throws Exception;
}
