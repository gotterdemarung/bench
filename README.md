# Test repo, please ignore

This project contains some Java performance benchmarks.
 
 
Latest data:

```
Benchmark                         (items)  Mode  Cnt       Score       Error  Units
Iteration.usingIteration            10000  avgt    5   59692,718 ± 11331,510  ns/op
Iteration.usingLambda               10000  avgt    5   62015,371 ±  3961,909  ns/op
Iteration.usingMethodRef            10000  avgt    5   61583,869 ±  6562,897  ns/op
Lists.arrayListAdd                   1000  avgt    5       4,584 ±     0,249  us/op
Lists.arrayListAdd                1000000  avgt    5    5342,049 ±   435,192  us/op
Lists.arrayListPredefAdd             1000  avgt    5       3,208 ±     0,138  us/op
Lists.arrayListPredefAdd          1000000  avgt    5    3732,511 ±   337,223  us/op
Lists.linkedListAdd                  1000  avgt    5       4,937 ±     0,095  us/op
Lists.linkedListAdd               1000000  avgt    5    4703,084 ±   970,462  us/op
ListsIteration.iterateArrayList      1000  avgt    5       6,353 ±     0,445  us/op
ListsIteration.iterateArrayList   1000000  avgt    5    5610,451 ±   472,620  us/op
ListsIteration.iterateLinkedList     1000  avgt    5       6,398 ±     0,226  us/op
ListsIteration.iterateLinkedList  1000000  avgt    5    7949,831 ±   778,027  us/op
Maps.hashMapPut                      1000  avgt    3      17,988 ±     5,831  us/op
Maps.hashMapPut                   1000000  avgt    3   18503,207 ±  9725,881  us/op
Maps.treeMapPut                      1000  avgt    3      54,011 ±    12,896  us/op
Maps.treeMapPut                   1000000  avgt    3  217377,849 ± 60130,895  us/op
```