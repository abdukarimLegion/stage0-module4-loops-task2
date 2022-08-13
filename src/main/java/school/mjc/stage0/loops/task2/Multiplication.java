package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i = 0;
        if (multiplyByAndToInclusive != 0) {
            while (i <= Math.abs(multiplyByAndToInclusive)) {
                if (multiplyByAndToInclusive > 0)
                    System.out.println(i * 5);
                else System.out.println(-i * 5);
                i++;
            }
        }
    }
}
