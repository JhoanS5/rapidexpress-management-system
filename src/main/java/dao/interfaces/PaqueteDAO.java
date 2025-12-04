package dao.interfaces;

import model.Paquete;
import java.util.List;

public interface PaqueteDAO {
    void crearPaquete(Paquete paquete) throws Exception;
    void actualizarPaquete(Paquete paquete) throws Exception;
    void eliminarPaquete(int idPaquete) throws Exception;
    Paquete obtenerPaquetePorId(int idPaquete) throws Exception;
    Paquete obtenerPaquetePorTracking(String trackingCode) throws Exception;
    List<Paquete> obtenerTodosPaquetes() throws Exception;
    List<Paquete> obtenerPaquetesPorEstado(String estado) throws Exception;
}
