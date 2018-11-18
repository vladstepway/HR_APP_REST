package by.team34.entity.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NameValidator implements ConstraintValidator<Name, String> {

    @Override
    public void initialize(Name paramA) {}

    @Override
    public boolean isValid(String name, ConstraintValidatorContext ctx) {
        if(name == null){
            return false;
        }
        if (name.matches("^[A-Za-zА-Яа-я]{2,20}$")) return true;
        else return false;
    }

}