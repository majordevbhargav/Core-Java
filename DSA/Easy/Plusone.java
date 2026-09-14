import java.util.Arrays;

public class Plusone {
    public int[] arrayToArray(int [] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] == 9) {
                arr[i] = 0;
                
            }

            else {
                arr[i] += 1;
                return arr;
            }
        }
        int[] newarray=new int[arr.length+1];
        newarray[0]=1;
        return newarray;

        

    }

    public static void main(String args[]) {
        Plusone Po = new Plusone();
        int arr[] = new int[] { 9, 9, 9, 9 };
        int[] result = Po.arrayToArray(arr);
        System.out.println(Arrays.toString(result));

    }
}
