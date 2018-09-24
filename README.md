# Test repo, please ignore

This project contains some Java performance benchmarks.
 
 
Latest data:

```
Benchmark                                        (data)  (items)  Mode  Cnt       Score       Error  Units
ConditionVsFilter.filterLoop                        N/A      N/A  avgt    5      26.532 ±     0.549  ns/op
ConditionVsFilter.standardLoop                      N/A      N/A  avgt    5       2.376 ±     0.052  ns/op
Iteration.usingIteration                            N/A    10000  avgt    5   49610.170 ±   881.025  ns/op
Iteration.usingLambda                               N/A    10000  avgt    5   53521.327 ±  4518.602  ns/op
Iteration.usingMethodRef                            N/A    10000  avgt    5   54994.996 ±  2761.481  ns/op
Lists.arrayListAdd                                  N/A       10  avgt    2       0.048              us/op
Lists.arrayListAdd                                  N/A     1000  avgt    2       4.257              us/op
Lists.arrayListAdd                                  N/A  1000000  avgt    2    4700.433              us/op
Lists.arrayListPredefAdd                            N/A       10  avgt    2       0.046              us/op
Lists.arrayListPredefAdd                            N/A     1000  avgt    2       2.524              us/op
Lists.arrayListPredefAdd                            N/A  1000000  avgt    2    2573.172              us/op
Lists.linkedListAdd                                 N/A       10  avgt    2       0.051              us/op
Lists.linkedListAdd                                 N/A     1000  avgt    2       5.016              us/op
Lists.linkedListAdd                                 N/A  1000000  avgt    2    4495.421              us/op
ListsIteration.iterateArrayList                     N/A       10  avgt    2       0.050              us/op
ListsIteration.iterateArrayList                     N/A     1000  avgt    2       5.128              us/op
ListsIteration.iterateArrayList                     N/A  1000000  avgt    2    5115.845              us/op
ListsIteration.iterateLinkedList                    N/A       10  avgt    2       0.050              us/op
ListsIteration.iterateLinkedList                    N/A     1000  avgt    2       5.649              us/op
ListsIteration.iterateLinkedList                    N/A  1000000  avgt    2    7233.876              us/op
Maps.hashMapPut                                     N/A     1000  avgt    3      17.341 ±     3.376  us/op
Maps.hashMapPut                                     N/A  1000000  avgt    3   20280.066 ± 20517.345  us/op
Maps.treeMapPut                                     N/A     1000  avgt    3      43.698 ±     2.481  us/op
Maps.treeMapPut                                     N/A  1000000  avgt    3  184170.544 ± 54070.259  us/op
PatternVsStringReplaceAll.usingPattern                       N/A  avgt    2      49.996              ns/op
PatternVsStringReplaceAll.usingPattern  Spaces and dot.      N/A  avgt    2     233.423              ns/op
PatternVsStringReplaceAll.usingString                        N/A  avgt    2     199.892              ns/op
PatternVsStringReplaceAll.usingString   Spaces and dot.      N/A  avgt    2     414.108              ns/op
```