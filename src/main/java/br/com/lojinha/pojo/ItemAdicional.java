package br.com.lojinha.pojo;

public class ItemAdicional {
    private int quantidade;
    private String item;

    public ItemAdicional(int qtdInicial, String itemInicial){
        this.item = itemInicial;
        this.quantidade = qtdInicial;

    }


    public int getQuantidade() {

        return quantidade;
    }

    public void setQuantidade(int novaQuantidade) {

        this.quantidade = novaQuantidade;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String novoItem) {
        this.item = novoItem;
    }
}
