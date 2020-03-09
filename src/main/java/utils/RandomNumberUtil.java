package utils;

import java.util.Random;

/**
 * Implementation of a utility for generating random numbers.
 */
public class RandomNumberUtil {

    /**
     * Generates a random number within specified bonds.
     *
     * @param lowerBound - Specifies the lower bound of the range the number should be in (inclusive)
     * @param upperBound - Specifies the upper bound of the range the number should be in (inclusive)
     * @return {@code int}
     */
    public static int getRandomNumber(int lowerBound, int upperBound) {

        if (upperBound > lowerBound) {
            return new Random().nextInt((upperBound - lowerBound) + 1) + lowerBound;
        } else {
            throw new IllegalArgumentException(String.format("The lower bound has to be less than the upper bound." +
                    "\n > Lower bound: %s, Upper bound: %s)", lowerBound, upperBound));
        }
    }
}