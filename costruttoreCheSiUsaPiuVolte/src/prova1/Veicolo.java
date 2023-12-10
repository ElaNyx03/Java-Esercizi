package prova1;

//classe veicolo
public class Veicolo {
    private String targa;
    private String marca;
    private int anno;

    /*
     * costruttore per una classe Veicolo
     */
    public Veicolo(String targa, String marca, int anno) {
        this.targa = targa;
        this.marca = marca;
        this.anno = anno;
    }

    //getter and setter
    public String getTarga() {
        return targa;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnno() {
        return anno;
    }

    @Override
    public String toString() {
        return "Veicolo [Targa=" + targa + ", Marca=" + marca + ", Anno=" + anno + "]";
    }}
