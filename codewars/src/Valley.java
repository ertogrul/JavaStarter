import java.util.Arrays;

public class Valley {

    public static int[] makeValley(int[] arr) {
        Arrays.sort(arr);
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            System.out.println("iteracja: "+ i);
            if(i%2==0) {
                ans[i/2]=arr[arr.length-1-i];
                //System.out.println("ans "+i/2+" arr.length-1-i " + (arr.length-1-i));
            }
            else {
                ans[arr.length-1-i/2]=arr[arr.length-1-i];
                //System.out.println("arr.length-1-i/2 " + (arr.length-1-i/2) + " arr.length-1-i " + (arr.length-1-i));
            }
        }


        for (int x = 0; x < ans.length; x++) {
            System.out.println(ans[x]);
        }
        return ans;
    }


/*public class Valley {

    public static int[] makeValley(int[] arr) {
        Arrays.sort(arr);

        for (int x = 0; x < arr.length; x++) {
            //arr2[index] = arr[x];
            System.out.println(arr[x]);
        }
        int[] arr2 = new int[arr.length];
        arr2[arr2.length/2] = arr[0];
        System.out.println("arr2[l]: " + arr2[arr2.length/2]);
        if (arr.length % 2 == 0) {
            for (int y = 0; y < arr.length; y++) {
                System.out.println("element: "+arr[y]);
                if (y % 2 == 0) {
                    arr2[arr2.length / 2 + y] = arr[y];
                } else {
                    arr2[arr2.length / 2 - y] = arr[y];
                }
                //(x % 2 == 0) ? arr2[arr2.length/2 + x] = arr[x] : arr2[arr2.length/2 - x] = arr[x];
                //System.out.println("arr2: "+arr2[y]);
            }
            for (int a = 1; a < arr2.length; a++) {
                //arr2[index] = arr[x];
                System.out.println("arr2: "+arr2[a]);
            }



            } else {
                //index = arr.length/2 + 1;
            }



        for (int x = 1; x < arr.length; x++) {
            //arr2[index] = arr[x];
            System.out.println(arr2[x]);
        }



        return new int[] {1,2,3};
    }*/

    public static void main (String[] args) {
        Valley pointer = new Valley();
        pointer.makeValley(new int [] {79, 35, 54, 19, 35, 25});
    }
}












//int index = (arr.length % 2 == 0) ? arr.length / 2 : arr.length/2 + 1;
//System.out.println("index: " + index);
        /*
        int[] arr3 = {1, 2, 3};
        int[] arr4 = {1, 2, 3, 4};
        System.out.println("3: " + arr3.length/2);
        System.out.println("4: " + arr4.length/2);
    */