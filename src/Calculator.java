public class Calculator {

    private Double sum(Double a, double b) {
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
            System.out.println("Can't divide by ZERO!");
            return Double.POSITIVE_INFINITY;
        }
        return a / b;
    }

    public Double evaluate(Double a, Double b, Character c) {
        return switch (c) {
            case '-' -> subtract(a, b);
            case '+' -> sum(a, b);
            case '*' -> multiply(a, b);
            case '/' -> divide(a, b);
            default -> throw new RuntimeException("Wrong operator provided!");
        };
    }

//    public Double evaluate(Double a, Double b, Character c) {
//        if (c == '-') {
//            return subtract(a, b);
//        } else if (c == '+') {
//            return sum(a, b);
//        } else if (c == '*') {
//            return multiply(a, b);
//        } else if (c == '/') {
//            return divide(a, b);
//        } else {
//            throw new RuntimeException("Wrong operator provided!");
//        }
//    }
}
