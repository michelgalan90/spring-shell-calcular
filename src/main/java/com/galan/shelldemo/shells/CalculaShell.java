package com.galan.shelldemo.shells;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class CalculaShell {
    private final CalculaService calculaService;

    public CalculaShell(CalculaService calculaService) {
        this.calculaService = calculaService;
    }

    @ShellMethod("Suma dos numeros")
    public Integer sumar(
            @ShellOption() Integer num1,
            @ShellOption() Integer num2
    ) {
        return this.calculaService.sumar(num1, num2);
    }
}
