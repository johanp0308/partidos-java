package com.company.partidoapp.clases;
import java.util.Objects;
/**
 * PartidosPlayOff
 */
public class PartidosPlayOff extends Partido{

    private String ronda;

    public PartidosPlayOff() {
    }

    public PartidosPlayOff(
        String equipoLocal,
        String equipoVisitante, 
        int cestasEquipoLocal, 
        int cestasEquipoVisitante, 
        String estadoPartido, 
        String fechaPartido, 
        String lugarPartido,
        String ronda)
    {
        super(equipoLocal,equipoVisitante,cestasEquipoLocal,cestasEquipoVisitante,estadoPartido,fechaPartido,lugarPartido);
        this.ronda = ronda;
    }

    public String getRonda() {
        return this.ronda;
    }

    public void setRonda(String ronda) {
        this.ronda = ronda;
    }

    public PartidosPlayOff ronda(String ronda) {
        setRonda(ronda);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PartidosPlayOff)) {
            return false;
        }
        PartidosPlayOff partidosPlayOff = (PartidosPlayOff) o;
        return Objects.equals(ronda, partidosPlayOff.ronda);
    }


    @Override
    public String toString() {
        return super.toString()+"," +
            " ronda='" + getRonda() + "'" +
            "}";
    }
    

    @Override
    public String resultado() {
        return "Resultados del Partido:"
            + "\nEquipo Local: "+super.getCestasEquipoLocal()
            + "\nEquipo Visitante: "+super.getCestasEquipoVisitante();
    }

    @Override
    public void registrarPuntosLocales(int puntos) {
        if(super.getEstadoPartido().equals("Jugando")){
            super.setCestasEquipoLocal(puntos);
        }
    }

    @Override
    public void registrarPuntosVisitantes(int puntos) {
        if(super.getEstadoPartido().equals("Jugando")){
            super.setCestasEquipoVisitante(puntos);
        }
    }

    
}