package au.com.bishoy.math;

public class Function {
    private Polynomial[] polynomials;

    public Function(Polynomial... polynomials) {
        this.polynomials = polynomials;
    }

    public double solveFor(double... values) {
        if (values.length != polynomials.length)
            throw new IndexOutOfBoundsException("Number of values has to much number of polynomials");

        double solution = 0;

        for (int i = 0; i < polynomials.length; i++)
            solution += polynomials[i].solveFor(values[i]);

        return solution;
    }

    public Polynomial getPolynomial(int index) {
        return this.polynomials[index];
    }
}
