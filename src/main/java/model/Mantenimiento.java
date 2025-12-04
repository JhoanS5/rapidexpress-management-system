package model;

import java.time.LocalDate;

public class Mantenimiento {
    private int idMantenimiento;
    private Vehiculo vehiculo;
    private LocalDate fecha;
    private String descripcion;
    private String tipo; 

    public Mantenimiento(int idMantenimiento, Vehiculo vehiculo, LocalDate fecha, String descripcion, String tipo) {
        this.idMantenimiento = idMantenimiento;
        this.vehiculo = vehiculo;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    public Mantenimiento(Vehiculo vehiculo, LocalDate fecha, String descripcion, String tipo) {
        this.vehiculo = vehiculo;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    public int getIdMantenimiento() { return idMantenimiento; }
    public Vehiculo getVehiculo() { return vehiculo; }
    public LocalDate getFecha() { return fecha; }
    public String getDescripcion() { return descripcion; }
    public String getTipo() { return tipo; }

    public void setIdMantenimiento(int idMantenimiento) { this.idMantenimiento = idMantenimiento; }
    public void setVehiculo(Vehiculo vehiculo) { this.vehiculo = vehiculo; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    @Override
    public String toString() {
        return "Mantenimiento{" +
                "idMantenimiento=" + idMantenimiento +
                ", vehiculo=" + (vehiculo != null ? vehiculo.getPlaca() : "null") +
                ", fecha=" + fecha +
                ", descripcion='" + descripcion + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
