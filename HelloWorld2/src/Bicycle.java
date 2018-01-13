class Bicycle {
    // class-level variables
    private int gear;
    private int cadence;
    private int speed;

    // constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    // another method (not a constructor)
    public void ShiftUp() {
        gear = gear + 1; // notice the 'gear' variable is available here too.
        System.out.println("Next gear.");
    }

    public void majPrint() {
        System.out.println("gear: " + gear);
        System.out.println("cadence: " + cadence);
        System.out.println("speed: " + speed);
    }

    public static void main(String[] args) {
        Bicycle majBajk = new Bicycle(2, 1, 1);
        majBajk.majPrint();
        majBajk.ShiftUp();
        majBajk.majPrint();
    }
}