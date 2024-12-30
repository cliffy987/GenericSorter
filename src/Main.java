import Interfaces.SortableObject;
import Interfaces.SortStrategy;
import ProgramObjects.ExampleDataObject;
import Sorters.GreatestToLeastBubbleSorter;
import Sorters.LeastToGreatestBubbleSorter;

import java.util.ArrayList;

public class Main
{
    /*
    This example program demonstrates how using the SortableObject interface along with
    the SortManager object allows a list of objects to be sorted based on a
    property specified by the object without having to create individual sort
    methods for every object. Theoretically, you could sort a list of objects that
    don't all share the same class, so long as each class implements SortableObject.

    Using the "Strategy" Programming Pattern allows for different types of sorting
    to be performed on a list of objects by the same object/method at runtime. New
    methods of sorting can be created without modifying the sort object/method's code;
    instead, a new objecting inheriting the "Sorter" interface must be created with
    the instructions for the new sort method.

    This example program shows off sorting an array of objects from least to
    greatest and then re-sorting it from greatest to least using the same
    SortManager object for both operations.
    */

    public static void main(String[] args)
    {
        //Set up the example array
        ArrayList<SortableObject> sortArray = new ArrayList<>();
        sortArray.add(new ExampleDataObject(10));
        sortArray.add(new ExampleDataObject(12));
        sortArray.add(new ExampleDataObject(24));
        sortArray.add(new ExampleDataObject(6));
        sortArray.add(new ExampleDataObject(5));
        sortArray.add(new ExampleDataObject(3));
        sortArray.add(new ExampleDataObject(27));
        sortArray.add(new ExampleDataObject(28));
        sortArray.add(new ExampleDataObject(29));
        sortArray.add(new ExampleDataObject(4));

        //Set up SorterManager
        SortStrategy bubbleSorterLG = new LeastToGreatestBubbleSorter();
        SortManager sortManager = new SortManager(bubbleSorterLG);

        //Sort from least to greates
        sortManager.sort(sortArray);

        //Debug print
        for (int i = 0; i < sortArray.size();i++) {
            System.out.println(sortArray.get(i).getSortValue());
        }

        //Change the sorting strategy at runtime
        SortStrategy bubbleSorterGL = new GreatestToLeastBubbleSorter();
        sortManager.setSortStrategy(bubbleSorterGL);

        //Sort from greatest to least
        sortManager.sort(sortArray);


    }
}