package br.edu.usj.ads.lpii.helloname;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloName {

    @PostMapping(value="helloName")
    public ModelAndView postHelloName(@RequestParam String nome,@RequestParam String email) {
    ModelAndView modelAndView = new ModelAndView("hello-name");

    String atividade = "Olá  " + nome + ", seu email é  " + email + ".";
     
    modelAndView.addObject("mensagem", atividade);
       
        return modelAndView;       
    
    }
    
    
}
