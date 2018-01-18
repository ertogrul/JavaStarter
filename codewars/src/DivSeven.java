class DivSeven {
    public static long[] seven(long number) {
        String s = String.valueOf(number);
        int counter = 0;
        long digit;
        while (number > 99) {
            digit =(number % 10);
            System.out.println("a "+digit);
            number /= 10;
            System.out.println("b "+number);
            number = number - 2 * digit;
            System.out.println("c "+number);
            counter += 1;
            System.out.println("d "+counter);
        }
        long [] A = {number, counter};
        System.out.println("A: " + A[0]);
        System.out.println("A: " + A[1]);
        return A;
    }


    public static void main(String[] args) {
        DivSeven pointer = new DivSeven();
        //System.out.println(pointer.seven(371));
        //System.out.println(pointer.seven(1603));
        System.out.println(pointer.seven(483));
    }
}



/*
int n = 8;
String s = "Hello, World!";
System.out.println(s.substring(0,n);

 int n = 3;
        String st = "Hello, World!";
        System.out.println(st.substring(0,n));

//System.out.println(temp1.valueOf(m).charAt(temp1.length() - 1)); //wyswietla ostatnia liczbe

 */




/*
seven(371) should return [35, 1]
seven(1603) should return [7, 2]
seven(477557101) should return [28, 7]
*/