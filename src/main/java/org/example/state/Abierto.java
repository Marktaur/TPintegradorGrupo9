package org.example.state;
import org.example.entety.Incidente;
import org.example.state.IEstado;
import org.example.entety.Incidente;

public class Abierto implements IEstado {
    @Override
    public void estadoAbierto(Incidente incidente) {
        System.out.println("**** incidente en estado  Abierto ******");

    }

    @Override
    public void estadoEnReparacion(Incidente incidente) {
        if ( incidente.getTecnico()!=1)
            incidente.setEstado(new EnReparacion());

        System.out.println("Cambiando de estado a en Reparacion");
    }

    @Override
    public void estadoResuelto(Incidente incidente) {
        System.out.println("Incidente Abierto, no puede cerrarse, Asigne el tecnico primero");
    }
}
