package au.com.bishoy.math;

public class Polynomial {
    private final String variableName;
    private final double[] coefficients;

    public Polynomial(String variableName, double... coefficients) {
        this.variableName = variableName;
        this.coefficients = coefficients;
    }

    public int getDegree() {
        return coefficients.length;
    }

    public double getCoefficient(int degree) {
        if (degree >= getDegree())
            return 0;
        return this.coefficients[degree];
    }

    public void setCoefficient(int degree, double value) {
        if (degree >= getDegree())
            throw new IndexOutOfBoundsException("Cannot change the degree of the polynomial");
        this.coefficients[degree] = value;
    }

    public double solveFor(double value) {
        double variable = 1;
        double solution = 0;

        for (int i = 0; i < getDegree(); i++) {
            solution += variable * this.coefficients[i];
            variable *= value;
        }

        return solution;
    }
}
