package com.example.projetinhodosfelas1.controler;

import org.springframework.ui.Model;
import com.example.projetinhodosfelas1.BackEnd.CalculadoraDeIMC;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MeuControlador{



    @GetMapping("/Formulario") //Url do site, pode ser qualquer nome
    public ModelAndView forms(){
        ModelAndView mv = new ModelAndView("Formulario"); //Criando um objeto do tipo ModelAndView que recebe como parametro o documento html Formulario
        mv.addObject("CriacaoFormulario",new CalculadoraDeIMC()); //adiciona um objeto da classe Java que eu criei "CalculadoraDeIMC"
        return mv;
    }


    @PostMapping("/RespFormulario")
    public ModelAndView respFormulario(@ModelAttribute("CriacaoFormulario") CalculadoraDeIMC objetoParaCalcularIMC ){
        // O ModelAttribute faz faz com que o sistema pegue busque o nome que voce deu para o formulario, nesse caso "CriacaoFormulario" e passe para a o objeto da classe criada E preenche os dados automaticamente com dados vazios caso não haja nada no formulario
        ModelAndView mv = new ModelAndView("RespFormulario"); //carrega o formulario de resposta que foi criado
        mv.addObject("dados", objetoParaCalcularIMC); //// Envia os dados para a nova página com o nome "dados"
        mv.addObject("status", objetoParaCalcularIMC.calcularIMC());
        return mv;
    }
}

















