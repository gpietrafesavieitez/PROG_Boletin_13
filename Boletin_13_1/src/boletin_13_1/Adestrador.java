package boletin_13_1;

public class Adestrador extends Seleccion {
    private String idFederacion;

    public Adestrador() {
    }

    public Adestrador(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public Adestrador(String idFederacion, int id, int edade, String nome, String apelido) {
        super(id, edade, nome, apelido);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return "Adestrador{" + "idFederacion=" + idFederacion + '}';
    }
    
    @Override
    public void viaxar() {
        System.out.println("viaxan os xogadores");
    }
    
    public void dirixirPartido(){
        System.out.println("dirixirPartido");
    }
    
    public void dirixirAdestramento(){
        System.out.println("dirixirAdestramento");
    }
}
