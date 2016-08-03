package au.com.bishoy.ai;

public class LearningSet {
    double[] result;
    double[][] inputs;

    public LearningSet(double[] result, double[]... inputs) {
        for (double[] input : inputs) {
            if (input.length != result.length)
                throw new IndexOutOfBoundsException("All inputs should be the same size as the results set");

            this.result = result;
            this.inputs = inputs;
        }
    }
}
