package co.edu.sena.proyectospoo.atributosestaticos;

/**
 * Created by Enrique on 9/05/2017.
 */
public class APP {
    public static void main(String[] args) {
        System.out.println(Audifonos.sonido);
        Audifonos.sonido = "MonoFonico";
        System.out.println(Audifonos.sonido);
        System.out.println(Math.PI);
    }
}
