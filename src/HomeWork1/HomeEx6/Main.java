package HomeWork1.HomeEx6;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        QuickSortExample.initArray();
        QuickSortExample.printArray();
        QuickSortExample.quickSort();
        QuickSortExample.printArray();
        QuickSortExample.kolichestvoSmen();

        System.out.println();

        BubbleSort bubleeSort = new BubbleSort(5);

        bubleeSort.into(9);
        bubleeSort.into(5);
        bubleeSort.into(8);
        bubleeSort.into(6);
        bubleeSort.into(1);
        bubleeSort.printer();
        bubleeSort.bubbleSorter();
        bubleeSort.printer();
        bubleeSort.showCoSwap();

        System.out.println();

        int mas[] = {9, 5, 8, 6, 1};
        System.out.print(Arrays.toString(mas));

        System.out.println();

        SortVstavkoy.sort(mas);
        SortVstavkoy.kolvozamen();
    }
}

