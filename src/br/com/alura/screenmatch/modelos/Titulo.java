package br.com.alura.screenmatch.modelos;

public class Titulo implements Comparable<Titulo> {
    private String title;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.title = meuTituloOmdb.getNome();
        this.anoDeLancamento = Integer.parseInt(meuTituloOmdb.getYear());
    }

    public Titulo(String nome, int anoDeLancamento) {
        this.title = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getNome() {
        return title;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.title = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + title);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "nome='" + title + '\'' +
                ", anoDeLancamento=" + anoDeLancamento +
                ", incluidoNoPlano=" + incluidoNoPlano +
                ", somaDasAvaliacoes=" + somaDasAvaliacoes +
                ", totalDeAvaliacoes=" + totalDeAvaliacoes +
                ", duracaoEmMinutos=" + duracaoEmMinutos +
                '}';
    }
}
