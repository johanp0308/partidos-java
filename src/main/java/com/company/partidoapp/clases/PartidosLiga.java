package com.company.partidoapp.clases;

public class PartidosLiga extends Partidos{
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


}