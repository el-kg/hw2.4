package pro.sky.skyprospringcalculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String hello() {
        return "<b> Добро пожаловать в калькулятор! </b>";
    }

    public String plus(int num1, int num2) {
        int sum = num1 + num2;
        return num1 + " + " + num2 + " = " + sum;
    }

    public String minus(int num1, int num2) {
        int sum = num1 - num2;
        return num1 + " - " + num2 + " = " + sum;
    }

    public String multiply(int num1, int num2) {
        int sum = num1 * num2;
        return num1 + " * " + num2 + " = " + sum;
    }

    public String divide(int num1, int num2) {
        int sum = num1 / num2;
        return num1 + " / " + num2 + " = " + sum;
    }
}
