package pro.sky.skyprospringcalculator;

import org.springframework.stereotype.Service;
import pro.sky.skyprospringcalculator.exception.DivideNullException;


@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String hello() {
        return "<b> Добро пожаловать в калькулятор! </b>";
    }
    @Override
    public long plus(int num1, int num2) {
        return (long)num1 + num2;

    }
    @Override
    public long minus(int num1, int num2) {
        return (long)num1 - num2;
    }
    @Override
    public long multiply(int num1, int num2) {
        return (long) num1 * num2;
    }
    @Override    public double divide(int num1, int num2) {
        if (num2 == 0) {
            throw new DivideNullException("Деление на ноль недопустимо!");
        } else {
            return (double) num1 / num2;
        }
    }
}
