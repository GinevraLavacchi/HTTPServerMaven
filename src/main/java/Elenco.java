
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ginevra
 */
public class Elenco {
    private ArrayList<Persona> nominativi;

    public Elenco(ArrayList<Persona> nomi) {
        nominativi=nomi;
    }

    public ArrayList<Persona> getNominativi() {
        return nominativi;
    }

    public void setNominativi(ArrayList<Persona> nominativi) {
        this.nominativi = nominativi;
    }
}
