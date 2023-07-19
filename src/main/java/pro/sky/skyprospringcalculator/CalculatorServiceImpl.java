package pro.sky.skyprospringcalculator;

import org.springframework.stereotype.Service;


@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String hello() {
        return "<b> Добро пожаловать в калькулятор! </b>";
    }
    @Override
    public String plus(int num1, int num2) {
        int sum = num1 + num2;
        return num1 + " + " + num2 + " = " + sum;
    }
    @Override
    public String minus(int num1, int num2) {
        int sum = num1 - num2;
        return num1 + " - " + num2 + " = " + sum;
    }
    @Override
    public String multiply(int num1, int num2) {
        int sum = num1 * num2;
        return num1 + " * " + num2 + " = " + sum;
    }
    @Override
    public String divide(int num1, int num2) {
        int sum = num1 / num2;
        if (num2 == 0) {
            return " Делить на ноль нельзя!";
        } else {
            return num1 + " / " + num2 + " = " + sum;
        }
    }
}
