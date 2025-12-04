package dao.interfaces;

import model.Auditoria;
import java.util.List;

public interface AuditoriaDAO {
    void registrarAccion(Auditoria auditoria) throws Exception;
    List<Auditoria> obtenerTodas() throws Exception;
    List<Auditoria> obtenerPorUsuario(String usuario) throws Exception;
}
