class DivSeven {
    public static long[] seven(long m) {
        String temp1 = String.valueOf(m);
        //System.out.println(String.valueOf(m).charAt(length() - 1));
        //System.out.println(temp1.valueOf(m).charAt(temp1.length() - 1));


        for (int i = 0; i < temp1.length(); i++) {
            System.out.println(temp1.charAt(i));
        }

        return new long [] {123123, 12312312, 123123};

    }


    public static void main(String[] args) {
        DivSeven pointer = new DivSeven();
        pointer.seven(371);
        // pointer.seven(1603);
        // pointer.seven(477557101);
    }
}






/*
seven(371) should return [35, 1]
seven(1603) should return [7, 2]
seven(477557101) should return [28, 7]
*/