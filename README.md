# Test repo, please ignore

This project contains some Java performance benchmarks.
 
 
Latest data:

```
Benchmark                         (items)  Mode  Cnt       Score       Error  Units
Iteration.usingIteration            10000  avgt    5   59145,852 ±  7173,159  ns/op
Iteration.usingLambda               10000  avgt    5   60952,615 ±  3128,942  ns/op
Iteration.usingMethodRef            10000  avgt    5   61107,079 ±  6911,102  ns/op
Lists.arrayListAdd                     10  avgt    2       0,052              us/op
Lists.arrayListAdd                   1000  avgt    2       4,553              us/op
Lists.arrayListAdd                1000000  avgt    2    5053,942              us/op
Lists.arrayListPredefAdd               10  avgt    2       0,054              us/op
Lists.arrayListPredefAdd             1000  avgt    2       3,205              us/op
Lists.arrayListPredefAdd          1000000  avgt    2    3625,858              us/op
Lists.linkedListAdd                    10  avgt    2       0,054              us/op
Lists.linkedListAdd                  1000  avgt    2       5,070              us/op
Lists.linkedListAdd               1000000  avgt    2    5043,086              us/op
ListsIteration.iterateArrayList        10  avgt    2       0,061              us/op
ListsIteration.iterateArrayList      1000  avgt    2       6,354              us/op
ListsIteration.iterateArrayList   1000000  avgt    2    5676,849              us/op
ListsIteration.iterateLinkedList       10  avgt    2       0,059              us/op
ListsIteration.iterateLinkedList     1000  avgt    2       6,478              us/op
ListsIteration.iterateLinkedList  1000000  avgt    2    7837,982              us/op
Maps.hashMapPut                      1000  avgt    3      17,875 ±     1,497  us/op
Maps.hashMapPut                   1000000  avgt    3   18028,540 ± 10896,920  us/op
Maps.treeMapPut                      1000  avgt    3      53,314 ±     7,462  us/op
Maps.treeMapPut                   1000000  avgt    3  212320,108 ± 79147,593  us/op
```