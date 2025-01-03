Generic Sorter:

- Greatly increases programming efficiency regarding object sorting.

- Individual classes can specify what value they should be sorted by.

- Objects of differing classes can be sorted in the same list so long as they all implement the SortableObject interface.

- Utilizes the Strategy programming pattern to allow new methods of array sorting to be implemented without modifying the SortManager’s code. 

- Sorting strategy of the SortManager’s sort method can be changed at runtime.


How it works:

- Instead of writing sort methods for every individual class, any class that needs to be sorted can implement the SortableObject interface. A list of SortableObjects can then be passed into the SortManager’s “sort” method, which will organize the list based on the SortStrategy object currently stored by the SortManager.

- New sort strategies can be created by having a class implement the SortStrategy interface. The SortManager contains a setter function that allows the SortStrategy it is currently using to be changed at runtime.


Project Navigation and How to Use:

- InteliJ IDE is recommended for opening this project.

- All of the core project files/folders listed below can be found in the GenericSorter\src directory:
	
    - Main: an example program to demonstrates using SortManager to sort a list of SortableObjects, changing the SortingStrategy of SortManager at runtime, and then sorting the list again with the new SortingStrategy.

    - ProgramObjects: contains the ExampleDataObject that demonstrates how the SortableObject interface should be implemented; any number value can be returned by the getSortValue method.

    - Sorters: contains two example SortStrategies; GreatestToLeastBubbleSorter and LeastToGreatestBubbleSorter that demonstrate how the SortStrategy interface should be implemented; new sorting strategies can be created by creating a new class that implements SortStrategy and changing the content of the sort method (EX: you could implement quick sort or heap sort this way).

    - SortManager: an intermediate class that stores the current SortingStrategy and the sort method where the list of SortableObjects should be passed; modifying this class is not recommended.

    - Interfaces: contains the SortableObject and SortStrategy interfaces; modifying these interfaces is not recommended.
