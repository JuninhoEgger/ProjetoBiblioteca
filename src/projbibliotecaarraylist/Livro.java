package projbibliotecaarraylist;

import java.text.DecimalFormat;

public class Livro {

    private String titulo;
    private String genero;
    private String autor;
    private double valorUnitario;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString() {
        DecimalFormat f = new DecimalFormat("R$ ##,00.00");
        return "\n"
                + "Título: " + titulo + "\n"
                + "Gênero: " + genero + "\n"
                + "Autor: " + autor + "\n"
                + "Valor unitário: " + f.format(valorUnitario);
    }

}
