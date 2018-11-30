package boletin_13_1;

public class Masaxista extends Seleccion {
    private String titulacion;
    private int anosExperiencia;

    public Masaxista() {
    }

    public Masaxista(String titulacion, int anosExperiencia) {
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public Masaxista(String titulacion, int anosExperiencia, int id, int edade, String nome, String apelido) {
        super(id, edade, nome, apelido);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public String toString() {
        return "Masaxista{" + "titulacion=" + titulacion + ", anosExperiencia=" + anosExperiencia + '}';
    }
    
    @Override
    public void viaxar() {
        System.out.println("viaxan os xogadores");
    }
    
    public void darMasaxes(){
        System.out.println("darMasaxes");
    }
}
