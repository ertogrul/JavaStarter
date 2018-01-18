public class ShadowApp {
    static int x = 5;

    public static void main(String[] args) {
        //x = 5;
        System.out.println("high level x = " + x);
        int x;
        x = 77;
        System.out.println("local x variable that shadows high level x = " + x);
        System.out.println("high level x accessed by ShadowApp.x = " + ShadowApp.x);
    }
}