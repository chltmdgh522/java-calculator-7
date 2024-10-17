package calculator.controller;

import calculator.service.CalculatorService;
import calculator.view.InputView;
import calculator.view.OutputView;

import java.io.IOException;
import java.util.List;

public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public String run() throws IOException {
        InputView inView =new InputView();
        String number = inView.input();

        return calculatorService.solution(number);
    }
}