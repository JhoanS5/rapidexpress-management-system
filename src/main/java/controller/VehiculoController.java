package controller;

import model.Vehiculo;
import model.enums.EstadoVehiculo;
import service.ServicioVehiculo;

import java.util.List;

public class VehiculoController {

    private ServicioVehiculo vehiculoService;

    public VehiculoController() {
        this.vehiculoService = new ServicioVehiculo();
    }

    public void crearVehiculo(String placa, String marca, String modelo, int anio, double capacidad, EstadoVehiculo estado) {
        try {
            Vehiculo vehiculo = new Vehiculo(placa, marca, modelo, anio, capacidad, estado);
            vehiculoService.crearVehiculo(vehiculo);
            System.out.println("Vehículo creado: " + vehiculo);
        } catch (Exception e) {
            System.err.println("Error al crear vehículo: " + e.getMessage());
        }
    }

    public void listarVehiculos() {
        try {
            List<Vehiculo> vehiculos = vehiculoService.listarVehiculos();
            vehiculos.forEach(System.out::println);
        } catch (Exception e) {
            System.err.println("Error al listar vehículos: " + e.getMessage());
        }
    }

    public void actualizarVehiculo(Vehiculo vehiculo) {
        try {
            vehiculoService.actualizarVehiculo(vehiculo);
            System.out.println("Vehículo actualizado: " + vehiculo);
        } catch (Exception e) {
            System.err.println("Error al actualizar vehículo: " + e.getMessage());
        }
    }
    
    public Vehiculo obtenerVehiculoPorId(int idVehiculo) {
    try {
        return vehiculoService.obtenerVehiculoPorId(idVehiculo);
    } catch (Exception e) {
        System.err.println("Error al obtener vehículo: " + e.getMessage());
        return null;
    }
}
}
