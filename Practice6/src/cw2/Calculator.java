package cw2;

import java.security.InvalidParameterException;

public class Calculator {
    public void calculate(CalculatorOperator operator) {
        if (operator == null) {
            throw new InvalidParameterException("Can not perform operation");
        }

        if (operator instanceof Addition) {
            Addition addition = (Addition) operator;
            addition.setResult(addition.getLeft() + addition.getRight());
        } else if (operator instanceof Subtraction) {
            Subtraction subtraction = (Subtraction) operator;
            subtraction.setResult(subtraction.getLeft() - subtraction.getRight());
        }
    }

    public void calculateCorrect(CalculatorOperator operator) {
        if (operator instanceof Addition) {
            Addition addition = (Addition) operator;
            addition.setResult(addition.getLeft() + addition.getRight());
        } else if (operator instanceof Subtraction) {
            Subtraction subtraction = (Subtraction) operator;
            subtraction.setResult(subtraction.getLeft() - subtraction.getRight());
        } else {
            throw new InvalidParameterException("Can not perform operation");
        }
    }

    public void calculateSwitch(CalculatorOperator operator) {
        switch (operator.getClass().getSimpleName().toString()) {
            case "Addition":
                Addition addition = (Addition) operator;
                addition.setResult(addition.getLeft() + addition.getRight());
                break;
            case "Subtraction":
                Subtraction subtraction = (Subtraction) operator;
                subtraction.setResult(subtraction.getLeft() - subtraction.getRight());
                break;
            default:
                throw new InvalidParameterException("Can not perform operation");
        }
    }
}


