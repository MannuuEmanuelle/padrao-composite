public class Main {
    public static void main(String[] args) throws Exception {
        Produto celular = new Produto("Celular Samsung Galaxy A03S",900.0);
        Produto livro = new Produto("As Crônicas de Nárnia", 50);
        Produto garrafinha = new Produto("Tupeuare", 35);

        CaixaProduto carrinho = new CaixaProduto("Cesta de compras");
        carrinho.adicionarItem(celular);
        carrinho.adicionarItem(livro);

        CaixaProduto carrinhoPresentes = new CaixaProduto("Presentes");
        carrinhoPresentes.adicionarItem(garrafinha);
        carrinhoPresentes.adicionarItem(carrinho);

        carrinhoPresentes.exibirProduto();
        System.out.println("\n Valor total da caixa de presentes: " + carrinhoPresentes.getPreco());
    }
}
