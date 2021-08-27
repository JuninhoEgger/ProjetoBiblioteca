package projbibliotecaarraylist;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Biblioteca objBiblioteca = new Biblioteca();
        byte op;

        JOptionPane.showMessageDialog(null, "INFORME OS DADOS DA BIBLIOTECA", "CADASTRO", JOptionPane.DEFAULT_OPTION);
        objBiblioteca.setNome(JOptionPane.showInputDialog(null, "Nome", "CADASTRO", JOptionPane.DEFAULT_OPTION));
        objBiblioteca.setCnpj(Long.parseLong(JOptionPane.showInputDialog(null, "CNPJ", objBiblioteca.getNome(), JOptionPane.DEFAULT_OPTION)));

        do {
            op = Byte.parseByte(JOptionPane.showInputDialog(null, "1 - CADASTRAR NOVO LIVRO\n"
                    + "2 - MOSTRAR TODOS OS LIVROS\n"
                    + "3 - MOSTRAR QUANTIDADE DE LIVROS\n"
                    + "4 - ESVAZIAR CARRINHO\n"
                    + "0 - SAIR", objBiblioteca.getNome(), JOptionPane.DEFAULT_OPTION));

            switch (op) {
                case 1:
                    Livro objLivro = new Livro();
                    JOptionPane.showMessageDialog(null, "INFORME OS DADOS DO LIVRO", objBiblioteca.getNome(), JOptionPane.DEFAULT_OPTION);
                    objLivro.setTitulo(JOptionPane.showInputDialog(null, "Nome", objBiblioteca.getNome(), JOptionPane.DEFAULT_OPTION));
                    objLivro.setGenero(JOptionPane.showInputDialog(null, "Gênero", objBiblioteca.getNome(), JOptionPane.DEFAULT_OPTION));
                    objLivro.setAutor(JOptionPane.showInputDialog(null, "Autor", objBiblioteca.getNome(), JOptionPane.DEFAULT_OPTION));
                    do {
                        objLivro.setValorUnitario(Double.parseDouble(JOptionPane.showInputDialog(null, "Valor unitário", objBiblioteca.getNome(), JOptionPane.DEFAULT_OPTION)));
                        if (objLivro.getValorUnitario() < 0) {
                            JOptionPane.showMessageDialog(null, "VALOR INVÁLIDO\n"
                                    + "TENTE NOVAMENTE", objBiblioteca.getNome(), JOptionPane.DEFAULT_OPTION);
                        }
                    } while (objLivro.getValorUnitario() < 0);
                    objBiblioteca.getListaDeLivros().add(objLivro);
                    JOptionPane.showMessageDialog(null, "LIVRO CADASTRADO COM SUCESSO", objBiblioteca.getNome(), JOptionPane.DEFAULT_OPTION);
                    break;
                case 2:
                    if (objBiblioteca.getListaDeLivros().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "NÃO HÁ NENHUM LIVRO NO CARRINHO", objBiblioteca.getNome(), JOptionPane.DEFAULT_OPTION);
                    } else {
                        JOptionPane.showMessageDialog(null, objBiblioteca, objBiblioteca.getNome(), JOptionPane.DEFAULT_OPTION);
                    }
                    break;
                case 3:
                    if (objBiblioteca.getListaDeLivros().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "NÃO HÁ LIVROS NO CARRINHO");
                    } else {
                        JOptionPane.showMessageDialog(null, "QUANTIDADE TOTAL DE LIVROS NO CARRINHO: " + objBiblioteca.getListaDeLivros().size(), objBiblioteca.getNome(), JOptionPane.DEFAULT_OPTION);
                    }
                    break;
                case 4:
                    if (objBiblioteca.getListaDeLivros().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "NÃO HÁ LIVROS PARA SEREM EXCLUÍDOS", objBiblioteca.getNome(), JOptionPane.DEFAULT_OPTION);
                    } else {
                        do {
                            op = Byte.parseByte(JOptionPane.showInputDialog(null, "Tem certeza que deseja excluir TODOS OS LIVROS DO CARRINHO?\n"
                                    + "1 - SIM\n"
                                    + "2 - NÃO", objBiblioteca.getNome(), JOptionPane.DEFAULT_OPTION));
                            switch (op) {
                                case 1:
                                    objBiblioteca.getListaDeLivros().clear();
                                    JOptionPane.showMessageDialog(null, "TODOS OS LIVROS FORAM EXCLUÍDOS", objBiblioteca.getNome(), JOptionPane.DEFAULT_OPTION);
                                    break;
                                case 2:
                                    JOptionPane.showMessageDialog(null, "NENHUM LIVRO FOI EXCLUÍDO", objBiblioteca.getNome(), JOptionPane.DEFAULT_OPTION);
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA\n"
                                            + "DIGITE NOVAMENTE", objBiblioteca.getNome(), JOptionPane.DEFAULT_OPTION);
                            }

                        } while (op < 1 || op > 2);
                    }
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, "SISTEMA ENCERRADO", objBiblioteca.getNome(), JOptionPane.DEFAULT_OPTION);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OÇÃO INVÁLIDA\n"
                            + "DIGITE NOVAMENTE", objBiblioteca.getNome(), JOptionPane.DEFAULT_OPTION);
            }
        } while (op != 0);

    }

}
