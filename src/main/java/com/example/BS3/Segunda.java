package com.example.BS3;

import lombok.Data;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Data
@Component
public class Segunda implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        System.out.println("Hola desde clase secundaria");

    }


}
