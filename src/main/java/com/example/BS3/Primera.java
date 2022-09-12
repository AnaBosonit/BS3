package com.example.BS3;

import jdk.jfr.DataAmount;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Data
public class Primera

{

    @PostConstruct
    public void primeraFuncion()

    {

        System.out.println("Hola desde clase inicial");

    }

}