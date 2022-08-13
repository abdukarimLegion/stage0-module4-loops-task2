package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int tubSon;
        int n = 1;
        int bolinganlarSoni;

        while (n <= printToInclusive) {
            bolinganlarSoni = 0;
            tubSon = 2;
            while (tubSon <= n / 2) {
                if (n % tubSon == 0) {
                    bolinganlarSoni++;
                    break;
                }
                tubSon++;
            }
            if (bolinganlarSoni == 0 && n != 1) {
                System.out.println(n);
            }
            n++;
        }
    }
}
