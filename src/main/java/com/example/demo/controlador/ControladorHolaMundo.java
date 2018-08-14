package com.example.demo.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ControladorHolaMundo {
    @Autowired
    private Environment environment;

    @RequestMapping(value = "/saludar/{nombre}", method = RequestMethod.GET)
    public @ResponseBody String saludar(@PathVariable("nombre") String nombre) {
        return "Estoy en el ambiente " + environment.getActiveProfiles()[0];
    }

}