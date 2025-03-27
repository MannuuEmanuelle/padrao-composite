
import java.util.ArrayList;
import java.util.List;

public class CaixaProduto implements ProdutoComponente {

    private String nome;

    private List<ProdutoComponente> caixaDeProdutos = new ArrayList<>();

    public CaixaProduto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<ProdutoComponente> getCaixaDeProdutos() {
        return caixaDeProdutos;
    }

    public void adicionarItem(ProdutoComponente item) {
        this.caixaDeProdutos.add(item);
    }

    public double getPreco() {
        double total = 0;

        for (ProdutoComponente item : caixaDeProdutos) {
            total += item.getPreco();
        }
        return total;
    }

    @Override
    public void exibirProduto(){
        System.out.println("Caixa: " + nome + "\n" + "Preço total: " + "\n" + getPreco());
        for (ProdutoComponente item : caixaDeProdutos) {
            item.exibirProduto();
        }
    }
}
