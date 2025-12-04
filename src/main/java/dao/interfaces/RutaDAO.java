package dao.interfaces;

import model.Ruta;
import java.util.List;

public interface RutaDAO {
    void crearRuta(Ruta ruta) throws Exception;
    void actualizarRuta(Ruta ruta) throws Exception;
    void eliminarRuta(int idRuta) throws Exception;
    Ruta obtenerRutaPorId(int idRuta) throws Exception;
    List<Ruta> obtenerTodasRutas() throws Exception;
}
