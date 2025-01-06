package GenericSorterProgramObjects;

import GenericSorterInterfaces.SortableObject;

public class ExampleDataObject implements SortableObject
{
    /*
    Various variables, functions, etc
     */
    private int valueToSort;

    public ExampleDataObject(int _valueToSort) {
        valueToSort = _valueToSort;
    }

    /*
    Various getters and setters
     */
    @Override
    public double getSortValue()
    {
        return valueToSort;
    }
}
