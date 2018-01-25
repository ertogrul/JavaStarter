public class ATM {
    public static int turnToNotes (int n) {
        if (n % 10 != 0) return -1;
        int [] arr = {500,200,100,50,20,10};
        int index = 0;
        int notes = 0;
        while (n > 0) {
            if (n >= arr[index]) {
                n = n - arr[index];
                notes++;
                System.out.println("n : "+n);
                System.out.println("A. notes in use: " + arr[index]);
                System.out.println("Number of notes " + notes);
            }
            else {
                index++;
                System.out.println("Changing notes to smaller nominal: " + arr[index]);
            }
        }


        return notes;
    }




    public static void main (String[] args) {
        ATM pointer = new ATM();
        System.out.println(pointer.turnToNotes(450));
    }
}
