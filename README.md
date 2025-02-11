Generic Sorter:

- Greatly increases programming efficiency regarding object sorting.

- Individual classes can specify what value they should be sorted by.

- Objects of differing classes can be sorted in the same list so long as they all implement the SortableObject interface.

- Utilizes the Strategy programming pattern to allow new methods of array sorting to be implemented without modifying the GenericSortManager’s code. 

- Sorting strategy of the GenericSortManager’s sort method can be changed at runtime.


How it works:

- Instead of writing sort methods for every individual class, any class that needs to be sorted can implement the SortableObject interface. A list of SortableObjects can then be passed into the GenericSortManager’s “sort” method, which will organize the list based on the SortStrategy object currently stored by the GenericSortManager.

- New sort strategies can be created by having a class implement the SortStrategy interface. The GenericSortManager contains a setter function that allows the SortStrategy it is currently using to be changed at runtime.


Project Navigation and How to Use:

- InteliJ IDE is recommended for using this project.

- All the core project files listed below can be found in the GenericSorter\src\ directory:

    - ExampleDataObject demonstrates how the SortableObject interface should be implemented; any number value can be returned by the getSortValue method.
	
    - ExampleMain: an example program to demonstrate using GenericSortManager to sort a list of SortableObjects, changing the SortStrategy of GenericSortManager at runtime, and then sorting the list again with the new SortStrategy.
  
    - GenericSortManager: an intermediate class that stores the current SortingStrategy and the sort method where the list of SortableObjects should be passed; modifying this class is not recommended.

    - GreatestToLeastBubbleSorter and LeastToGreatestBubbleSorter: example SortStrategies that demonstrate how the SortStrategy interface should be implemented; new sorting strategies can be created by creating a new class that implements SortStrategy and changing the content of the "sort" method (EX: you could implement quick sort or heap sort this way).

    - SortableObject: interface used to denote by what property an object should be sorted by; modifying this interface is not recommended.
  
    - SortStrategy: used to denote classes that contain a method of sorting SortableObjects; modifying this interface is not recommended.
