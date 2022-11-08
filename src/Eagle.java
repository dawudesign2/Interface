public class Eagle extends Animal implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude(){
        return this.altitude;
    }

    public boolean isFlying(){ return this.flying; }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public void setIsFlying(boolean fly) {this.flying = fly; }

    @Override
    public String sing() {
        return null;
    }

    @Override
    public void takeOff() {
        setIsFlying(true);
        System.out.println(getName() + " takes off in the sky.");
    }

    @Override
    public void ascend(int altitude) {
        setAltitude(altitude);
        System.out.println(this.getName() + " flies upward, altitude :" + getAltitude());
    }

    @Override
    public void descend(int altitude) {
        setAltitude(altitude);
        System.out.println(this.getName() + " flies downward, altitude :" + getAltitude());
    }

    @Override
    public void glide() {
        System.out.println("It glides into the air");
    }

    @Override
    public void land() {
        if(getAltitude() > 10){
            System.out.println(this.getName() + " is too high and can't land.");
        } else {
            System.out.println(this.getName() + " lands on the ground");
        }
    }
}
