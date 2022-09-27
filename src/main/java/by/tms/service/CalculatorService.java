package by.tms.service;

import by.tms.entity.Operation;
import org.springframework.stereotype.Component;

@Component
public class CalculatorService {

    private double sum(double num1, double num2) {
        return num1 + num2;
    }

    private double sub(double num1, double num2) {
        return num1 - num2;
    }

    private double mul(double num1, double num2) {
        return num1 * num2;
    }

    private double div(double num1, double num2) {
        return num1 / num2;
    }

    public Operation getResult(double num1, double num2, String operation) {
        Operation operation1 = new Operation();
        double result = 0;
        switch (operation) {
            case "sum":
                result = num1 + num2;
                break;
            case "sub":
                result = num1 - num2;
                break;
            case "mul":
                result = num1 * num2;
                break;
            case "div":
                result = num1 / num2;

        }
        operation1.setResult(result);
        return operation1;
    }
}
