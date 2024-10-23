package main.java.list.OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class CarrinhodeCompras1 {
    private List<Item> Itemlist;

    public CarrinhodeCompras1() {
        this.Itemlist = new ArrayList<>();
    }

    public void adicionarItem (String nome, double preco, int quantidade){
        Item item = new Item( nome, preco,quantidade);
        this.Itemlist.add(item);
    }

    public void removerItem(String nome){
        List <Item> itemParaRemover = new ArrayList<>();
        for (Item I : Itemlist){
            if (I.getNome().equalsIgnoreCase(nome)){
            itemParaRemover.add(I);}
        }
         Itemlist.removeAll(itemParaRemover);
    }
    public double calcularValorTotal(){
        double valorTotal =0;
       if(!Itemlist.isEmpty()) {
           for (Item item : Itemlist) {
            double valorTotalItem = item.getPreco() * item.getQuant();
            valorTotal+=valorTotalItem ; //para somar ao valor total

           }
           return valorTotal;}
       else {
           throw new RuntimeException("A lista está vazia!");
       }
    }

    public void exibirItens(){
       if (!Itemlist.isEmpty()){
           System.out.println(this.Itemlist);
       }else {
           System.out.println(" A lista esta Vazia");
       }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Carrinho de Compras:\n");

        if (Itemlist.isEmpty()) {
            sb.append("A lista está vazia.\n");
        } else {
            for (Item item : Itemlist) {
                sb.append(String.format("- %s: %.2f (Quantidade: %d)\n",
                        item.getNome(), item.getPreco(), item.getQuant()));
            }
        }

        sb.append(String.format("Valor total: %.2f", calcularValorTotal()));
        return sb.toString();
    }


    public static void main(String[] args) {
        CarrinhodeCompras1 carrinhoDeCompras = new CarrinhodeCompras1();

        carrinhoDeCompras.adicionarItem("Maçã", 2.0, 3);
        carrinhoDeCompras.adicionarItem("Banana", 1.5, 5);
        carrinhoDeCompras.adicionarItem("Arroz",  22.50 , 2);

        // Exibindo os itens
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total
        double total = carrinhoDeCompras.calcularValorTotal();
        System.out.println("Valor total do carrinho: " + total);
    }

}
