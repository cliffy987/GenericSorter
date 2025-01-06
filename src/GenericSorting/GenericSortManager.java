package GenericSorting;

import java.util.ArrayList;

public class GenericSortManager
{
    //Change the current sorting strategy object to change the way in which we sort lists at runtime.
    private SortStrategy sortStrategy;

    GenericSortManager(SortStrategy _sorter) {
        sortStrategy = _sorter;
    }

    public void setSortStrategy(SortStrategy _sorter)
    {
        if (sortStrategy != null)
            sortStrategy = _sorter;
    }

    //Call sort on the current sorting strategy object.
    public void sort(ArrayList<SortableObject> array) {
        sortStrategy.sort(array);
    }
}
