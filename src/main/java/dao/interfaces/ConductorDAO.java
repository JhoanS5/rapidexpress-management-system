package dao.interfaces;

import model.Conductor;
import java.util.List;

public interface ConductorDAO {
    void crearConductor(Conductor conductor) throws Exception;
    void actualizarConductor(Conductor conductor) throws Exception;
    void eliminarConductor(int idConductor) throws Exception;
    Conductor obtenerConductorPorId(int idConductor) throws Exception;
    Conductor obtenerConductorPorIdentificacion(String identificacion) throws Exception;
    List<Conductor> obtenerTodosConductores() throws Exception;
}
