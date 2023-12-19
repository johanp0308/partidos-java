package com.company.partidoapp.clases;

public class PartidosLiga extends Partido{
    private int numeroJornada;

    public PartidosLiga() {
    }

    public PartidosLiga(int numeroJornada) {
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
    public void registrarPuntosLocales() {
        if(){

        }
    }

    @Override
    public void registrarPuntosVisitantes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registrarPuntosVisitantes'");
    }
}