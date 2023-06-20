public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

     void setAltitude(int altitude) {
        this.altitude = altitude;
    }
    void setFlight(boolean flying) {
        this.flying = flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        if ( !this.flying && this.altitude == 0 ) {
            this.flying = true;
            System.out.printf("%s takes off in the sky.%n", this.getName());

        }
    }

    @Override
    public void ascend(int meters) {
         System.out.printf("%s flies upward, altitude : %d%n", this.getName(), this.altitude);
         this.altitude +=meters;
    }

    @Override
    public void descend(int meters) {
            System.out.printf("%s flies downward, altitude : %d%n", this.getName(), this.altitude);
            this.altitude -=meters;
    }

    @Override
    public void land() {
        System.out.printf("%s lands on the ground.%n",this.getName());
        this.altitude = 0;

    }
}
