package ejemplo_08_ciudad;

import java.util.ArrayList;

/**
 *
 * @author abi
 */
public class Ejecutable {

    public static void main(String[] args) {

        Ciudad laCiudad = new Ciudad();

        Colonia colonia1 = new Colonia();
        Colonia colonia2 = new Colonia();

        Ciudadano ciudadano1 = new Ciudadano();
        Ciudadano ciudadano2 = new Ciudadano();
        Ciudadano ciudadano3 = new Ciudadano();
        Ciudadano ciudadano4 = new Ciudadano();

        ArrayList<Colonia> lasColonias = new ArrayList<>();
        ArrayList<Ciudadano> losCiudadanos = new ArrayList<>();

        laCiudad.setEstado("Guerrero");
        laCiudad.setNombre("Tlapa");

        colonia1.setNombre("Tepeya");
        colonia1.setUbicacion("Este");

        colonia2.setNombre("Aviacion");
        colonia2.setUbicacion("Norte");

        ciudadano1.setNombre("Ana");
        ciudadano1.setEdad(23);

        ciudadano2.setNombre("Berna");
        ciudadano2.setEdad(34);

        ciudadano3.setNombre("Celia");
        ciudadano3.setEdad(45);

        ciudadano4.setNombre("ABI DS");
        ciudadano4.setEdad(30);

        lasColonias.add(colonia1);
        lasColonias.add(colonia2);

        losCiudadanos.add(ciudadano1);
        losCiudadanos.add(ciudadano2);
        losCiudadanos.add(ciudadano3);
        losCiudadanos.add(ciudadano4);

        laCiudad.setLasColonias(lasColonias);
        laCiudad.setLosCiudadanos(losCiudadanos);

        laCiudad.imprimir();
    }

}
