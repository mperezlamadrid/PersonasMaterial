package com.example.manuelperez.personamaterial;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by manuelperez on 10/20/17.
 */

public class Metodos {

    public static int fotoAleatoria(ArrayList<Integer> fotos){
        int fotoSeleccionada;
        Random r = new Random();
        fotoSeleccionada = r.nextInt(fotos.size());
        return fotos.get(fotoSeleccionada);
    }

    public static boolean exitenciaPersona(ArrayList<Persona> personas, String cedula){
        for (int i = 0; i <personas.size() ; i++) {
            if(personas.get(i).getCedula().equals(cedula)){
                return true;
            }
        }
        return false;
    }

    public static boolean existenciaPersonaEditar(ArrayList<Persona> personas, String cedulaE, String cedulaActual){
        if (!cedulaActual.equals(cedulaE)) {
            if (exitenciaPersona(personas, cedulaE)) {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }
}
