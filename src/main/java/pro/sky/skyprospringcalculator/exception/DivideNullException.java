package pro.sky.skyprospringcalculator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class DivideNullException extends IllegalArgumentException{
    public DivideNullException(String s) {
        super(s);
    }
}
