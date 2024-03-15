public class Calculator {

    private Double sum(Double a, Double b) {
        return a + b;
    }

    private Double subtract(Double a, Double b) {
        return a - b;
    }

    private Double multiply(Double a, Double b) {
        return a * b;
    }

    private Double divide(Double a, Double b) {
        if (b == 0) {
            throw new RuntimeException("Division to ZERO is not defined.");
        }
        return a / b;
    }

    private Double pow(Double a, Double b) {
        return Math.pow(a, b);
    }

    private Double powTo2(Double a) {
        return a * a;
    }

    public Double evaluate(Double a, Double b, Character operation) {
        return switch (operation) {
            case '-' -> subtract(a, b);
            case '+' -> sum(a, b);
            case '*' -> multiply(a, b);
            case '/' -> divide(a, b);
            case '^' -> pow(a, b);
            case '$' -> powTo2(a);
            default -> throw new RuntimeException("Wrong operation provided!");
        };
    }

}
