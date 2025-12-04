package controller;

import model.Ruta;
import service.ServicioRuta;

import java.util.List;

public class RutaController {

    private ServicioRuta rutaService;

    public RutaController() {
        this.rutaService = new ServicioRuta();
    }

    public void crearRuta(Ruta ruta) {
        try {
            rutaService.crearRuta(ruta);
            System.out.println("Ruta creada: " + ruta);
        } catch (Exception e) {
            System.err.println("Error al crear ruta: " + e.getMessage());
        }
    }

    public void iniciarRuta(Ruta ruta) {
        try {
            rutaService.iniciarRuta(ruta);
            System.out.println("Ruta iniciada: " + ruta);
        } catch (Exception e) {
            System.err.println("Error al iniciar ruta: " + e.getMessage());
        }
    }

    public void finalizarRuta(Ruta ruta) {
        try {
            rutaService.finalizarRuta(ruta);
            System.out.println("Ruta finalizada: " + ruta);
        } catch (Exception e) {
            System.err.println("Error al finalizar ruta: " + e.getMessage());
        }
    }

    public void listarRutas() {
        try {
            List<Ruta> rutas = rutaService.listarRutas();
            rutas.forEach(System.out::println);
        } catch (Exception e) {
            System.err.println("Error al listar rutas: " + e.getMessage());
        }
    }

    public Ruta obtenerRutaPorId(int id) {
        try {
            return rutaService.obtenerRutaPorId(id);
        } catch (Exception e) {
            System.err.println("Error al obtener ruta: " + e.getMessage());
            return null;
        }
    }
}
