package br.com.alura.mudi.controller;

import br.com.alura.mudi.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(Model model){
        Pedido pedido = new Pedido();
        pedido.setNomeProduto("The Last of Us Part II - PlayStation 4");
        pedido.setUrlDaImagem("https://images-na.ssl-images-amazon.com/images/I/61OZeW%2BpPYL._AC_SL1000_.jpg");
        pedido.setUrlDoProduto("https://www.amazon.com.br/dp/B07ZGFHZVZ/ref=s9_acsd_al_bw_c2_x_1_i?pf_rd_m=A3RN7G7QC5MWSZ&pf_rd_s=merchandised-search-3&pf_rd_r=KJN0R7DT8C0K5SFCT85N&pf_rd_t=101&pf_rd_p=7b43f1c2-0945-4ec2-800d-57e0a663d5a9&pf_rd_i=7791985011");
        pedido.setDescricaco("Descrição do produto");

        List<Pedido> pedidos = Arrays.asList(pedido);
        model.addAttribute("pedidos", pedidos);
        return "home";
    }
}
