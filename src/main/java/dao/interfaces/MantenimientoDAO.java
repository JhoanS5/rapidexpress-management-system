package dao.interfaces;

import model.Mantenimiento;
import java.util.List;

public interface MantenimientoDAO {
    void crearMantenimiento(Mantenimiento mantenimiento) throws Exception;
    void actualizarMantenimiento(Mantenimiento mantenimiento) throws Exception;
    void eliminarMantenimiento(int idMantenimiento) throws Exception;
    Mantenimiento obtenerMantenimientoPorId(int idMantenimiento) throws Exception;
    List<Mantenimiento> obtenerMantenimientosPorVehiculo(int idVehiculo) throws Exception;
}
