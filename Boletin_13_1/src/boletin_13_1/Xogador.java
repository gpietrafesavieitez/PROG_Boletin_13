package boletin_13_1;

public class Xogador extends Seleccion {
    private int dorsal;
    private String demarcación;

    public Xogador() {
    }

    public Xogador(int dorsal, String demarcación) {
        this.dorsal = dorsal;
        this.demarcación = demarcación;
    }

    public Xogador(int id, int edade, String nome, String apelido, int dorsal, String demarcación) {
        super(id, edade, nome, apelido);
        this.dorsal = dorsal;
        this.demarcación = demarcación;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcación() {
        return demarcación;
    }

    public void setDemarcación(String demarcación) {
        this.demarcación = demarcación;
    }

    @Override
    public String toString() {
        return "Xogador{" + "dorsal=" + dorsal + ", demarcaci\u00f3n=" + demarcación + '}';
    }
    
    @Override
    public void viaxar() {
        System.out.println("viaxan os xogadores");
    }
    
    public void xogarPartido() {
        System.out.println("xogarPartido");
    }
    
    public void entrenar(){
        System.out.println("entrenar");
    }
}
