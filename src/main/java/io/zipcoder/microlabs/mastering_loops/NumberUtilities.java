package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder answer = new StringBuilder();

        for (int i = start%2 == 1 ? start+1 : start; i < stop; i = i +2){
            answer.append(i);
        }
        return answer.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder answer = new StringBuilder();

        for (int i = start%2 == 0 ? start+1 : start; i < stop; i = i +2){
            answer.append(i);
        }
        return answer.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder answer = new StringBuilder();

        for (int i = start; i < stop; i = i +step){
            answer.append(i*i);
        }
        return answer.toString();
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder answer = new StringBuilder();

        for (int i = start; i < stop; i = i +step){
            answer.append(i);
        }
        return answer.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder answer = new StringBuilder();

        for (int i = start; i < stop; i = i +step){
            answer.append((int) Math.pow(i,exponent));
        }
        return answer.toString();
    }
}
