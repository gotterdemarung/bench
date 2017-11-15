# Test repo, please ignore

This project contains some Java performance benchmarks.
 
 
Latest data:

```
Benchmark                         (items)  Mode  Cnt       Score        Error  Units
ConditionVsFilter.filterLoop          N/A  avgt    5      30.247 ±      1.425  ns/op
ConditionVsFilter.standardLoop        N/A  avgt    5       2.723 ±      0.175  ns/op
Iteration.usingIteration            10000  avgt    5   55557.162 ±   4228.473  ns/op
Iteration.usingLambda               10000  avgt    5   59895.763 ±  10920.319  ns/op
Iteration.usingMethodRef            10000  avgt    5   60771.359 ±   9897.476  ns/op
Lists.arrayListAdd                     10  avgt    2       0.052               us/op
Lists.arrayListAdd                   1000  avgt    2       4.619               us/op
Lists.arrayListAdd                1000000  avgt    2    5198.943               us/op
Lists.arrayListPredefAdd               10  avgt    2       0.050               us/op
Lists.arrayListPredefAdd             1000  avgt    2       2.733               us/op
Lists.arrayListPredefAdd          1000000  avgt    2    2797.790               us/op
Lists.linkedListAdd                    10  avgt    2       0.056               us/op
Lists.linkedListAdd                  1000  avgt    2       5.565               us/op
Lists.linkedListAdd               1000000  avgt    2    4850.792               us/op
ListsIteration.iterateArrayList        10  avgt    2       0.057               us/op
ListsIteration.iterateArrayList      1000  avgt    2       5.567               us/op
ListsIteration.iterateArrayList   1000000  avgt    2    5683.584               us/op
ListsIteration.iterateLinkedList       10  avgt    2       0.055               us/op
ListsIteration.iterateLinkedList     1000  avgt    2       6.313               us/op
ListsIteration.iterateLinkedList  1000000  avgt    2    8093.774               us/op
Maps.hashMapPut                      1000  avgt    3      19.131 ±      1.609  us/op
Maps.hashMapPut                   1000000  avgt    3   24219.845 ±  46318.184  us/op
Maps.treeMapPut                      1000  avgt    3      50.474 ±     27.273  us/op
Maps.treeMapPut                   1000000  avgt    3  204383.258 ± 170681.705  us/op
```