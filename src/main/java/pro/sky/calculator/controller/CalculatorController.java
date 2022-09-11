package pro.sky.calculator.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorController calculatorController;

    public CalculatorController(CalculatorController calculatorController) {
        this.calculatorController = calculatorController;
    }

    public void method() {
        calculatorController.method();
    }
}
