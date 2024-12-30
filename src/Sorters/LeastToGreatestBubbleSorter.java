package Sorters;

import Interfaces.SortableObject;
import Interfaces.SortStrategy;

import java.util.ArrayList;
public class LeastToGreatestBubbleSorter implements SortStrategy
{
    @Override
    public void sort(ArrayList<SortableObject> array)
    {
        //Least-To-Greatest Bubble Sort Algorithm; runs in O(n^2) time complexity.
        for (int i = 0; i < array.size(); i++) {
            //In every iteration, we end up moving the largest value to the end of the list.
            //Only values that haven't been sorted yet are checked; 0 to (array.size() - i)
            for (int k = 0; k < (array.size() - i - 1); k++) {
                SortableObject ObjectA = array.get(k);
                SortableObject ObjectB = array.get(k+1);
                if (ObjectA.getSortValue() > ObjectB.getSortValue()) {
                    //Switch positions
                    array.set(k+1, ObjectA);
                    array.set(k, ObjectB);
                }
            }
        }
    }
}