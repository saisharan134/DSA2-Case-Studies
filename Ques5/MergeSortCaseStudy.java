import java.util.Arrays;

public class MergeSortCaseStudy {

    static int[] mergeSort(int[] arr) {

        if(arr.length <= 1)
            return arr;

        int mid = arr.length / 2;

        int[] left =
            mergeSort(Arrays.copyOfRange(arr,0,mid));

        int[] right =
            mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    static int[] merge(int[] left,
                       int[] right) {

        int[] out =
            new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left.length &&
              j < right.length) {

            if(left[i] <= right[j])
                out[k++] = left[i++];
            else
                out[k++] = right[j++];
        }

        while(i < left.length)
            out[k++] = left[i++];

        while(j < right.length)
            out[k++] = right[j++];

        return out;
    }

    public static void main(String[] args) {

        int[] arr = {
            7,3,11,5,14,2,
            9,6,12,1,8,4
        };

        int[] sorted = mergeSort(arr);

        System.out.println(
            Arrays.toString(sorted));
    }
}