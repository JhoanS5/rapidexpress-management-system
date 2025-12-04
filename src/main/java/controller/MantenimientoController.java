package controller;

import model.Mantenimiento;
import service.ServicioMantenimiento;

import java.util.List;

public class MantenimientoController {

    private ServicioMantenimiento mantenimientoService;

    public MantenimientoController() {
        this.mantenimientoService = new ServicioMantenimiento();
    }

    public void registrarMantenimiento(Mantenimiento mantenimiento) {
        try {
            mantenimientoService.registrarMantenimiento(mantenimiento);
            System.out.println("Mantenimiento registrado: " + mantenimiento);
        } catch (Exception e) {
            System.err.println("Error al registrar mantenimiento: " + e.getMessage());
        }
    }

    public void listarMantenimientosPorVehiculo(int idVehiculo) {
        try {
            List<Mantenimiento> lista = mantenimientoService.obtenerMantenimientosPorVehiculo(idVehiculo);
            lista.forEach(System.out::println);
        } catch (Exception e) {
            System.err.println("Error al listar mantenimientos: " + e.getMessage());
        }
    }

    public void actualizarMantenimiento(Mantenimiento mantenimiento) {
        try {
            mantenimientoService.actualizarMantenimiento(mantenimiento);
            System.out.println("Mantenimiento actualizado: " + mantenimiento);
        } catch (Exception e) {
            System.err.println("Error al actualizar mantenimiento: " + e.getMessage());
        }
    }

    public void eliminarMantenimiento(int id) {
        try {
            mantenimientoService.eliminarMantenimiento(id);
            System.out.println("Mantenimiento eliminado con ID: " + id);
        } catch (Exception e) {
            System.err.println("Error al eliminar mantenimiento: " + e.getMessage());
        }
    }
}
