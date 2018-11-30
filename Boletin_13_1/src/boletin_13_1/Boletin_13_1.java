package boletin_13_1;

public class Boletin_13_1 {

    public static void main(String[] args) {
        // instancia un obxecto de cada clase
        Xogador xogador = new Xogador();
        Adestrador adestrador = new Adestrador();
        Masaxista masaxista = new Masaxista();
        // instancia un xogador de tipo Seleccion
        Seleccion seleccion = new Seleccion();
        // chama ao método concentrarse a través de cada obxecto. ¿ Que observas ?.
        seleccion.concentrarse();
        xogador.concentrarse();
        adestrador.concentrarse();
        masaxista.concentrarse();
        // El método es accesible para las subclases dado que lo heredan directamente de la superclase.
        // Invoca ao método viaxar a través de cada obxecto. ¿ Cal é a saida ?
        seleccion.viaxar();
        xogador.viaxar();
        adestrador.viaxar();
        masaxista.viaxar();
        // El método es distinto en las subclases porque lo sobreescriben por uno propio.
        // ¿ Podes invocar a un método da superclase con un obxecto dunha subclase ?.Comprobao
        xogador.concentrarse();
        // Obviamente, porque la subclase hereda los métodos de su superclase más inmediata.
        // ¿ Podes invocar a un método da subclase con un obxecto do tipo da superclase ? .Comprobao
        try{    
            seleccion.dirixirPartido();
        }catch(Exception e){
            System.out.println("No, porque la superclase no puede heredar de la subclase.");
        }
    }
}
