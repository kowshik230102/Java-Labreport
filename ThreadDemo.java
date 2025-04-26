import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

class NumberGenerator implements Runnable 
{
    Thread t;
    private final AtomicInteger number = new AtomicInteger();
    
    NumberGenerator() {
        t = new Thread(this, "Generator");
        t.start();
    }
    
    @Override
    public void run() {
        Random rand = new Random();
        try {
            while(true) {
                int newNumber = rand.nextInt(100) + 1;
                number.set(newNumber);
                System.out.println("Generated: " + newNumber);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Generator interrupted");
        }
    }
    
    public int getNumber() {
        return number.get();
    }
}

class EvenProcessor implements Runnable 
{
    Thread t;
    private final NumberGenerator generator;
    
    EvenProcessor(NumberGenerator generator) {
        this.generator = generator;
        t = new Thread(this, "EvenProcessor");
        t.start();
    }
    
    @Override
    public void run() {
        while(true) {
            int current = generator.getNumber();
            if(current % 2 == 0) {
                System.out.println("Square: " + (current * current));
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Even processor interrupted");
            }
        }
    }
}

class OddProcessor implements Runnable 
{
    Thread t;
    private final NumberGenerator generator;
    
    OddProcessor(NumberGenerator generator) {
        this.generator = generator;
        t = new Thread(this, "OddProcessor");
        t.start();
    }
    
    @Override
    public void run() {
        while(true) {
            int current = generator.getNumber();
            if(current % 2 != 0) {
                System.out.println("Cube: " + (current * current * current));
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Odd processor interrupted");
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        EvenProcessor even = new EvenProcessor(generator);
        OddProcessor odd = new OddProcessor(generator);
        
        try {
            generator.t.join();
            even.t.join();
            odd.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}