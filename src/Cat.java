import java.util.Random;

public class Cat extends Animal implements Pet{

    public Cat (String name){
        super(name);
    }

    @Override
    public void feed() {
       System.out.println("chomp chomp");
    }

    @Override
    public void play() {
       System.out.println("meow");
    }

    @Override
    public boolean pet() {
        Random random = new Random();
        boolean agrees = random.nextBoolean();
        if (agrees) {
            System.out.println("purr purr");
        } else {
            System.out.println("...");
        }
        return agrees;
    }

    @Override
    public String sing() {
        return null;
    }
}
