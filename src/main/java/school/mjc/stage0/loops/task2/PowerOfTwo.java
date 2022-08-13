package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {

            int i = 0;
            if(power >= 0) {
                int res = 1;
                while (i <= power) {
                    if(i == 0) {
                        System.out.println(1);
                    } else {
                        System.out.println(res *= 2);
                    }
                    i++;
                }
            } else {
                System.out.println("too much power");
            }
    }
}
