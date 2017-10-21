package com.example.manuelperez.personamaterial;

import java.util.ArrayList;

/**
 * Created by manuelperez on 10/20/17.
 */

public class Datos {
    private static ArrayList<Persona> personas = new ArrayList();

    public static void guardarPersona(Persona p) {
        personas.add(p);
    }

    public static ArrayList<Persona> obtenerPersonas() {
        return personas;
    }

    public static boolean eliminarPersona(Persona p){
        for (int i = 0; i <personas.size() ; i++) {
            if(p.getCedula().equals(personas.get(i).getCedula())){
                personas.remove(i);
                return true;
            }
        }
        return false;

    }

    public static void editarPersona(Persona p){
        personas.set(0,p);
    }
}
