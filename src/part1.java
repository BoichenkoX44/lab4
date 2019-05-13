import java.util.*;
public class part1 {
    static boolean areElementsOrderly(int arr[], int n)
    {

        Arrays.sort(arr);


        for (int i = 1; i < n; i++)
            if (arr[i] - arr[i-1] > 1)
                return false;

        return true;
    }


    public static void main(String[] args)
    {
        int arr[] = { 5, 2, 3, 6, 4, 4, 6, 6 };
        int n = arr.length;

        if (areElementsOrderly(arr, n))
            System.out.println("Yes");

        else
            System.out.println("No");

    }
}
