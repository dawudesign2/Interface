public class Main {
    public static void main(String[] args) {
        Eagle hawker = new Eagle("Cherry");

        hawker.takeOff();
        hawker.ascend(120);
        hawker.ascend(30);
        hawker.glide();
        hawker.descend(140);
        hawker.land();
        hawker.descend(9);
        hawker.land();
    }
}