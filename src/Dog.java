public class Dog extends Animal implements Pet{
    public Dog(String name){
        super(name);
    }

    @Override
    public void feed() {
        System.out.println("Munch Munch");
    }

    @Override
    public void play() {
        System.out.println("woof");
    }

    @Override
    public boolean pet() {
        System.out.println("yapi");
        return true;
    }

    @Override
    public String sing() {
        return null;
    }
}
