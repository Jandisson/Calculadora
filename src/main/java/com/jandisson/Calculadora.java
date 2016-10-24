package com.jandisson;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculadora {


    /**
     * Realiza a soma de dois números de ponto flutuante
     * @param numero1
     * @param numero2
     * @return
     */
    @RequestMapping("/soma/{numero1}/{numero2}")
    public double soma(
            @PathVariable double numero1,
            @PathVariable double numero2) {
        return numero1+numero2;
    }


}