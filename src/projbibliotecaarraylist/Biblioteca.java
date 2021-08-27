package projbibliotecaarraylist;

import java.util.ArrayList;

public class Biblioteca {

    private String nome;
    private long cnpj;
    private ArrayList<Livro> listaDeLivros;

    public Biblioteca() {
        this.listaDeLivros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Livro> getListaDeLivros() {
        return listaDeLivros;
    }

    public void setListaDeLivros(ArrayList<Livro> listaDeLivros) {
        this.listaDeLivros = listaDeLivros;
    }

    @Override
    public String toString() {
        String resposta = "";
        for (int i = 0; i < this.getListaDeLivros().size(); i++) {
            resposta += (i + 1) + "º livro" + this.listaDeLivros.get(i) + "\n\n";
        }
        return "Lista de livros\n" + resposta;
    }

}
