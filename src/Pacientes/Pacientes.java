/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pacientes;

import java.util.Date;

/**
 *
 * @author Student
 */
public class Pacientes {

    int cedula;
    private String nombre;
    private Date fecha;
    private Date HoraLLegada;
    private Date HoraSalida;
    private String Clasificacion;

    public String getNombre() {
        return nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public Date getHoraLLegada() {
        return HoraLLegada;
    }

    public Date getHoraSalida() {
        return HoraSalida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setHoraLLegada(Date HoraLLegada) {
        this.HoraLLegada = HoraLLegada;
    }

    public void setHoraSalida(Date HoraSalida) {
        this.HoraSalida = HoraSalida;
    }

    public int getCedula() {
        return cedula;
    }

    
    public Pacientes(int cedula, String nombre, Date fecha, Date HoraLLegada, Date HoraSalida, String Clasificacion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fecha = fecha;
        this.HoraLLegada = HoraLLegada;
        this.HoraSalida = HoraSalida;
        this.Clasificacion = Clasificacion;
    }

    
}
