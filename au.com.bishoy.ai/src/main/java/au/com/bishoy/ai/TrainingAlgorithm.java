package au.com.bishoy.ai;

import au.com.bishoy.math.Function;

public interface TrainingAlgorithm {
    Function Train(LearningSet learningSet);
}
