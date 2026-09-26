package br.com.alura.screenmatch.modelos;

public class TituloOmdb extends Titulo{
    private String year;
    private String runtime;

    public TituloOmdb(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }


    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }
}
