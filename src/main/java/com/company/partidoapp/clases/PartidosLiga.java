package com.company.partidoapp.clases;


public class PartidosLiga extends Partido{
    private int numeroJornada;

    public PartidosLiga() {
    }

    public PartidosLiga(
        String equipoLocal,
        String equipoVisitante,
        int cestasEquipoLocal,
        int cestasEquipoVisitante,
        String estadoPartido,
        String fechaPartido,
        String lugarPartido,
        int numeroJornada) {
        super(equipoLocal,equipoVisitante,cestasEquipoLocal,cestasEquipoVisitante,estadoPartido,fechaPartido,lugarPartido);
        this.numeroJornada = numeroJornada;
    }

    public int getNumeroJornada() {
        return this.numeroJornada;
    }

    public void setNumeroJornada(int numeroJornada) {
        this.numeroJornada = numeroJornada;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PartidosLiga)) {
            return false;
        }
        PartidosLiga partidosLiga = (PartidosLiga) o;
        return numeroJornada == partidosLiga.numeroJornada;
    }


    @Override
    public String toString() {
        return super.toString()+"," +
            " numeroJornada='" + getNumeroJornada() + "'" +
            "}";
    }

    @Override
    public void registrarPuntosLocales(int puntos) {
        if(super.getEstadoPartido().equals("Jugando")){
            super.setCestasEquipoLocal(super.getCestasEquipoLocal()+puntos);
        }
    }

    @Override
    public void registrarPuntosVisitantes(int puntos) {
        if(super.getEstadoPartido().equals("Jugando")){
            super.setCestasEquipoVisitante(super.getCestasEquipoVisitante()+puntos);
        }
    }
}