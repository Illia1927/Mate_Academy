package HomeWork1.HomeEx6;

import java.util.Arrays;

public class SortVstavkoy
{
    static int co = 0;
    static int ch = 0;

    public static void sort(int[] array)
    {
        int i, j, newValue;
        for (i = 1; i < array.length; i++)
        {
            newValue = array[i];
            j = i;
            while (j > 0 && array[j - 1] > newValue)
            {
                co++;
                array[j] = array[j - 1];
                j--;
            }

            ch++;
            array[j] = newValue;
        }

        System.out.println(Arrays.toString(array));

    }
    public static void kolvozamen(){
        System.out.println("Сравнений в сортировке вставкой " + co);
    }
}

