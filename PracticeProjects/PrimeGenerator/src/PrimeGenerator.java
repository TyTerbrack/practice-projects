import java.util.Scanner;

public class PrimeGenerator implements Runnable {

    volatile boolean running = true;

    public void run() {
        System.out.println("Beginning to find primes...");

        int p = 2;
        while (running) {
            boolean isPrime = true;

            for (int i = 2; i < p; i++) {
                if (p % i == 0) {
                    isPrime = false;
                }
            }

            if (isPrime) {
                System.out.println(p);
            }
            p++;

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                break;
            }
        }

        System.out.println("Finished finding primes.");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Type q, then ENTER to quit at any time.");
        System.out.println("Press ENTER to begin");
        in.nextLine();

        PrimeGenerator pg = new PrimeGenerator();
        Thread t = new Thread(pg);
        t.start();

        while(!in.next().equals("q"));

        pg.running = false;
        t.interrupt();
    }
}
