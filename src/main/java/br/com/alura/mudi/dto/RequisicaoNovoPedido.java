package br.com.alura.mudi.dto;

import br.com.alura.mudi.model.Pedido;
import br.com.alura.mudi.model.StatusPedido;

import javax.validation.constraints.NotBlank;
import java.security.Principal;

public class RequisicaoNovoPedido {

    @NotBlank
    private String nomeProduto;

    @NotBlank
    private String urlDoProduto;

    @NotBlank
    private String urlImagem;

    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getUrlDoProduto() {
        return urlDoProduto;
    }

    public void setUrlDoProduto(String urlDoProduto) {
        this.urlDoProduto = urlDoProduto;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public Pedido toPedido() {
        Pedido pedido = new Pedido();
        pedido.setNomeProduto(nomeProduto);
        pedido.setUrlDaImagem(urlImagem);
        pedido.setUrlDoProduto(urlDoProduto);
        pedido.setDescricaco(descricao);
        pedido.setStatus(StatusPedido.AGUARDANDO);
        return pedido;
    }

}
