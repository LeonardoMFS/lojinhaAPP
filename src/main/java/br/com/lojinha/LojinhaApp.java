package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemAdicional;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
            Produto meuProduto = new Produto("Sony", Tamanho.MEDIO);

            meuProduto.setNome("Play Station 5");
            meuProduto.setValor(5.000);


            List<ItemAdicional> itensInclusos = new ArrayList<>();

            ItemAdicional primeiroItemAdicional = new ItemAdicional(2, "Controles");
            itensInclusos.add(primeiroItemAdicional);

            ItemAdicional segundoItemAdicional = new ItemAdicional(1, "Jogos");
            itensInclusos.add(segundoItemAdicional);

            ItemAdicional terceiroItemAdicional = new ItemAdicional(1, "Cabo HDMI");
            itensInclusos.add(terceiroItemAdicional);

            meuProduto.setItensInclusos(itensInclusos);

        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Sony", Tamanho.MEDIO);
        meuProdutoNacional.setImpostoNacional(0.55);


        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("Samsung", Tamanho.PEQUENO);
        meuProdutoInternacional.setTaxaInternacional(1.7);
        meuProdutoInternacional.setValor(100);




        for(ItemAdicional itemAtual : meuProduto.getItensInclusos()) {
            System.out.println(itemAtual.getItem());
            System.out.println(itemAtual.getQuantidade());
        }



    }


}
