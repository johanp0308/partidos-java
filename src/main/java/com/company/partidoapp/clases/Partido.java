package com.company.partidoapp.clases;

import java.util.Date;
import java.util.Objects;

/**
 * Partido
 */

public abstract class Partido implements Acciones{
    private String equipoLocal;
    private String equipoVisitante;
    private int cestasEquipoLocal;
    private int cestasEquipoVisitante;
    /*
     * Estado Partido solo tiene tres valores posibles los cuales son:
     * Terminado, Jugando, Cancelado. 
     */
    private String estadoPartido;
    private Date fechaPartido;
    private String lugarPartido;

    public Partido() {
    }

    public Partido(String equipoLocal, String equipoVisitante, int cestasEquipoLocal, int cestasEquipoVisitante, String estadoPartido, Date fechaPartido, String lugarPartido) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.cestasEquipoLocal = cestasEquipoLocal;
        this.cestasEquipoVisitante = cestasEquipoVisitante;
        this.estadoPartido = estadoPartido;
        this.fechaPartido = fechaPartido;
        this.lugarPartido = lugarPartido;
    }

    public String getEquipoLocal() {
        return this.equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return this.equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getCestasEquipoLocal() {
        return this.cestasEquipoLocal;
    }

    public void setCestasEquipoLocal(int cestasEquipoLocal) {
        this.cestasEquipoLocal = cestasEquipoLocal;
    }

    public int getCestasEquipoVisitante() {
        return this.cestasEquipoVisitante;
    }

    public void setCestasEquipoVisitante(int cestasEquipoVisitante) {
        this.cestasEquipoVisitante = cestasEquipoVisitante;
    }

    public String getEstadoPartido() {
        return this.estadoPartido;
    }

    public void setEstadoPartido(String estadoPartido) {
        this.estadoPartido = estadoPartido;
    }

    public Date getFechaPartido() {
        return this.fechaPartido;
    }

    public void setFechaPartido(Date fechaPartido) {
        this.fechaPartido = fechaPartido;
    }

    public String getLugarPartido() {
        return this.lugarPartido;
    }

    public void setLugarPartido(String lugarPartido) {
        this.lugarPartido = lugarPartido;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Partido)) {
            return false;
        }
        Partido Partido = (Partido) o;
        return Objects.equals(equipoLocal, Partido.equipoLocal) && Objects.equals(equipoVisitante, Partido.equipoVisitante) && cestasEquipoLocal == Partido.cestasEquipoLocal && cestasEquipoVisitante == Partido.cestasEquipoVisitante && Objects.equals(estadoPartido, Partido.estadoPartido) && Objects.equals(fechaPartido, Partido.fechaPartido) && Objects.equals(lugarPartido, Partido.lugarPartido);
    }

    @Override
    public String toString() {
        return "{" +
            " equipoLocal='" + getEquipoLocal() + "'" +
            ", equipoVisitante='" + getEquipoVisitante() + "'" +
            ", cestasEquipoLocal='" + getCestasEquipoLocal() + "'" +
            ", cestasEquipoVisitante='" + getCestasEquipoVisitante() + "'" +
            ", estadoPartido='" + getEstadoPartido() + "'" +
            ", fechaPartido='" + getFechaPartido() + "'" +
            ", lugarPartido='" + getLugarPartido() + "'" +
            "";
    }

    public String resultado(){
        return "Resultados del Partido de Basketball"
        +"\nEquipo Local: "+getCestasEquipoLocal()
        +"\nEquipo Visitant: "+getCestasEquipoVisitante();
    }
}