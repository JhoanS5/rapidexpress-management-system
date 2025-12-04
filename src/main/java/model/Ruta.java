package model;

import model.enums.EstadoRuta;
import java.time.LocalDate;
import java.util.List;

public class Ruta {
    private int idRuta;
    private LocalDate fecha;
    private Vehiculo vehiculo;
    private Conductor conductor;
    private double totalPesoKg;
    private EstadoRuta estado;
    private List<Paquete> envios;

    public Ruta(int idRuta, LocalDate fecha, Vehiculo vehiculo, Conductor conductor, double totalPesoKg, EstadoRuta estado, List<Paquete> envios) {
        this.idRuta = idRuta;
        this.fecha = fecha;
        this.vehiculo = vehiculo;
        this.conductor = conductor;
        this.totalPesoKg = totalPesoKg;
        this.estado = estado;
        this.envios = envios;
    }

    public int getIdRuta() { return idRuta; }
    public LocalDate getFecha() { return fecha; }
    public Vehiculo getVehiculo() { return vehiculo; }
    public Conductor getConductor() { return conductor; }
    public double getTotalPesoKg() { return totalPesoKg; }
    public EstadoRuta getEstado() { return estado; }
    public List<Paquete> getEnvios() { return envios; }

    public void setIdRuta(int idRuta) { this.idRuta = idRuta; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
    public void setVehiculo(Vehiculo vehiculo) { this.vehiculo = vehiculo; }
    public void setConductor(Conductor conductor) { this.conductor = conductor; }
    public void setTotalPesoKg(double totalPesoKg) { this.totalPesoKg = totalPesoKg; }
    public void setEstado(EstadoRuta estado) { this.estado = estado; }
    public void setEnvios(List<Paquete> envios) { this.envios = envios; }
    
    @Override
    public String toString() {
        return "Ruta{" +
               "idRuta=" + idRuta +
               ", fecha=" + fecha +
               ", vehiculo=" + (vehiculo != null ? vehiculo.getPlaca() : "null") +
               ", conductor=" + (conductor != null ? conductor.getNombreCompleto() : "null") +
               ", totalPesoKg=" + totalPesoKg +
               ", estado=" + estado +
               ", envios=" + (envios != null ? envios.size() + " paquetes" : "0 paquetes") +
               '}';
    }
}
