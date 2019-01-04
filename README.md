# Test repo, please ignore

This project contains some Java performance benchmarks.
 
 
## Java 8

```
Benchmark                                        (data)  (items)                                                          (target)  Mode  Cnt       Score        Error  Units
ConditionVsFilter.filterLoop                        N/A      N/A                                                               N/A  avgt    5      28.306 ±      6.603  ns/op
ConditionVsFilter.standardLoop                      N/A      N/A                                                               N/A  avgt    5       2.456 ±      0.075  ns/op
Iteration.usingIteration                            N/A    10000                                                               N/A  avgt    5   52687.072 ±   4214.040  ns/op
Iteration.usingLambda                               N/A    10000                                                               N/A  avgt    5   57556.228 ±   6318.060  ns/op
Iteration.usingMethodRef                            N/A    10000                                                               N/A  avgt    5   55362.585 ±   1380.716  ns/op
Lists.arrayListAdd                                  N/A       10                                                               N/A  avgt    2       0.064               us/op
Lists.arrayListAdd                                  N/A     1000                                                               N/A  avgt    2       5.880               us/op
Lists.arrayListAdd                                  N/A  1000000                                                               N/A  avgt    2   16325.085               us/op
Lists.arrayListPredefAdd                            N/A       10                                                               N/A  avgt    2       0.060               us/op
Lists.arrayListPredefAdd                            N/A     1000                                                               N/A  avgt    2       3.251               us/op
Lists.arrayListPredefAdd                            N/A  1000000                                                               N/A  avgt    2   21757.081               us/op
Lists.linkedListAdd                                 N/A       10                                                               N/A  avgt    2       0.064               us/op
Lists.linkedListAdd                                 N/A     1000                                                               N/A  avgt    2       6.911               us/op
Lists.linkedListAdd                                 N/A  1000000                                                               N/A  avgt    2    5711.245               us/op
ListsIteration.iterateArrayList                     N/A       10                                                               N/A  avgt    2       0.053               us/op
ListsIteration.iterateArrayList                     N/A     1000                                                               N/A  avgt    2       5.443               us/op
ListsIteration.iterateArrayList                     N/A  1000000                                                               N/A  avgt    2    7003.831               us/op
ListsIteration.iterateLinkedList                    N/A       10                                                               N/A  avgt    2       0.053               us/op
ListsIteration.iterateLinkedList                    N/A     1000                                                               N/A  avgt    2       5.902               us/op
ListsIteration.iterateLinkedList                    N/A  1000000                                                               N/A  avgt    2    8614.423               us/op
Maps.hashMapPut                                     N/A     1000                                                               N/A  avgt    3      34.513 ±     21.181  us/op
Maps.hashMapPut                                     N/A  1000000                                                               N/A  avgt    3  160992.304 ±  50080.147  us/op
Maps.treeMapPut                                     N/A     1000                                                               N/A  avgt    3      98.457 ±     85.472  us/op
Maps.treeMapPut                                     N/A  1000000                                                               N/A  avgt    3  228413.721 ± 496613.497  us/op
PatternVsStringReplaceAll.usingPattern                       N/A                                                               N/A  avgt    2      58.646               ns/op
PatternVsStringReplaceAll.usingPattern  Spaces and dot.      N/A                                                               N/A  avgt    2     375.291               ns/op
PatternVsStringReplaceAll.usingString                        N/A                                                               N/A  avgt    2     260.906               ns/op
PatternVsStringReplaceAll.usingString   Spaces and dot.      N/A                                                               N/A  avgt    2     530.530               ns/op
Whitespace.forBiLoop                                N/A      N/A  a                                                                 avgt    2       0.003               us/op
Whitespace.forBiLoop                                N/A      N/A                                                                 a  avgt    2       0.006               us/op
Whitespace.forBiLoop                                N/A      N/A                                                                    avgt    2       0.125               us/op
Whitespace.forLoop                                  N/A      N/A  a                                                                 avgt    2       0.003               us/op
Whitespace.forLoop                                  N/A      N/A                                                                 a  avgt    2       0.023               us/op
Whitespace.forLoop                                  N/A      N/A                                                                    avgt    2       0.026               us/op
Whitespace.regex                                    N/A      N/A  a                                                                 avgt    2       0.055               us/op
Whitespace.regex                                    N/A      N/A                                                                 a  avgt    2       0.236               us/op
Whitespace.regex                                    N/A      N/A                                                                    avgt    2       0.202               us/op
Whitespace.trimEmpty                                N/A      N/A  a                                                                 avgt    2       0.034               us/op
Whitespace.trimEmpty                                N/A      N/A                                                                 a  avgt    2       0.034               us/op
Whitespace.trimEmpty                                N/A      N/A                                                                    avgt    2       0.026               us/op
```

## Java 10

```
Benchmark                                        (data)  (items)                                                          (target)  Mode  Cnt       Score        Error  Units
ConditionVsFilter.filterLoop                        N/A      N/A                                                               N/A  avgt    5       2.609 ±      0.038  ns/op
ConditionVsFilter.standardLoop                      N/A      N/A                                                               N/A  avgt    5       2.620 ±      0.039  ns/op
Iteration.usingIteration                            N/A    10000                                                               N/A  avgt    5   54648.790 ±  11322.407  ns/op
Iteration.usingLambda                               N/A    10000                                                               N/A  avgt    5   57742.970 ±   7368.234  ns/op
Iteration.usingMethodRef                            N/A    10000                                                               N/A  avgt    5   55138.981 ±   4039.304  ns/op
Lists.arrayListAdd                                  N/A       10                                                               N/A  avgt    2       0.049               us/op
Lists.arrayListAdd                                  N/A     1000                                                               N/A  avgt    2       6.006               us/op
Lists.arrayListAdd                                  N/A  1000000                                                               N/A  avgt    2   12117.551               us/op
Lists.arrayListPredefAdd                            N/A       10                                                               N/A  avgt    2       0.048               us/op
Lists.arrayListPredefAdd                            N/A     1000                                                               N/A  avgt    2       3.911               us/op
Lists.arrayListPredefAdd                            N/A  1000000                                                               N/A  avgt    2    8959.090               us/op
Lists.linkedListAdd                                 N/A       10                                                               N/A  avgt    2       0.065               us/op
Lists.linkedListAdd                                 N/A     1000                                                               N/A  avgt    2       6.107               us/op
Lists.linkedListAdd                                 N/A  1000000                                                               N/A  avgt    2    6012.744               us/op
ListsIteration.iterateArrayList                     N/A       10                                                               N/A  avgt    2       0.055               us/op
ListsIteration.iterateArrayList                     N/A     1000                                                               N/A  avgt    2       5.632               us/op
ListsIteration.iterateArrayList                     N/A  1000000                                                               N/A  avgt    2    7723.967               us/op
ListsIteration.iterateLinkedList                    N/A       10                                                               N/A  avgt    2       0.054               us/op
ListsIteration.iterateLinkedList                    N/A     1000                                                               N/A  avgt    2       6.194               us/op
ListsIteration.iterateLinkedList                    N/A  1000000                                                               N/A  avgt    2    8625.751               us/op
Maps.hashMapPut                                     N/A     1000                                                               N/A  avgt    3      31.758 ±     29.764  us/op
Maps.hashMapPut                                     N/A  1000000                                                               N/A  avgt    3  108349.662 ± 356443.380  us/op
Maps.treeMapPut                                     N/A     1000                                                               N/A  avgt    3      90.263 ±      5.236  us/op
Maps.treeMapPut                                     N/A  1000000                                                               N/A  avgt    3  142968.864 ± 126175.228  us/op
PatternVsStringReplaceAll.usingPattern                       N/A                                                               N/A  avgt    2      74.432               ns/op
PatternVsStringReplaceAll.usingPattern  Spaces and dot.      N/A                                                               N/A  avgt    2     301.862               ns/op
PatternVsStringReplaceAll.usingString                        N/A                                                               N/A  avgt    2     256.141               ns/op
PatternVsStringReplaceAll.usingString   Spaces and dot.      N/A                                                               N/A  avgt    2     504.669               ns/op
Whitespace.forBiLoop                                N/A      N/A  a                                                                 avgt    2       0.004               us/op
Whitespace.forBiLoop                                N/A      N/A                                                                 a  avgt    2       0.005               us/op
Whitespace.forBiLoop                                N/A      N/A                                                                    avgt    2       0.076               us/op
Whitespace.forLoop                                  N/A      N/A  a                                                                 avgt    2       0.004               us/op
Whitespace.forLoop                                  N/A      N/A                                                                 a  avgt    2       0.024               us/op
Whitespace.forLoop                                  N/A      N/A                                                                    avgt    2       0.023               us/op
Whitespace.regex                                    N/A      N/A  a                                                                 avgt    2       0.087               us/op
Whitespace.regex                                    N/A      N/A                                                                 a  avgt    2       0.172               us/op
Whitespace.regex                                    N/A      N/A                                                                    avgt    2       0.144               us/op
Whitespace.trimEmpty                                N/A      N/A  a                                                                 avgt    2       0.036               us/op
Whitespace.trimEmpty                                N/A      N/A                                                                 a  avgt    2       0.034               us/op
Whitespace.trimEmpty                                N/A      N/A                                                                    avgt    2       0.027               us/op
```

## Java 11

```
Benchmark                                        (data)  (items)                                                          (target)  Mode  Cnt       Score        Error  Units
ConditionVsFilter.filterLoop                        N/A      N/A                                                               N/A  avgt    5       2.573 ±      0.039  ns/op
ConditionVsFilter.standardLoop                      N/A      N/A                                                               N/A  avgt    5       2.628 ±      0.100  ns/op
Iteration.usingIteration                            N/A    10000                                                               N/A  avgt    5   56293.127 ±   5794.156  ns/op
Iteration.usingLambda                               N/A    10000                                                               N/A  avgt    5   53944.294 ±  18975.915  ns/op
Iteration.usingMethodRef                            N/A    10000                                                               N/A  avgt    5   53777.859 ±  20615.095  ns/op
Lists.arrayListAdd                                  N/A       10                                                               N/A  avgt    2       0.046               us/op
Lists.arrayListAdd                                  N/A     1000                                                               N/A  avgt    2       5.150               us/op
Lists.arrayListAdd                                  N/A  1000000                                                               N/A  avgt    2   12891.990               us/op
Lists.arrayListPredefAdd                            N/A       10                                                               N/A  avgt    2       0.051               us/op
Lists.arrayListPredefAdd                            N/A     1000                                                               N/A  avgt    2       3.989               us/op
Lists.arrayListPredefAdd                            N/A  1000000                                                               N/A  avgt    2    9370.105               us/op
Lists.linkedListAdd                                 N/A       10                                                               N/A  avgt    2       0.067               us/op
Lists.linkedListAdd                                 N/A     1000                                                               N/A  avgt    2       6.234               us/op
Lists.linkedListAdd                                 N/A  1000000                                                               N/A  avgt    2    5566.672               us/op
ListsIteration.iterateArrayList                     N/A       10                                                               N/A  avgt    2       0.057               us/op
ListsIteration.iterateArrayList                     N/A     1000                                                               N/A  avgt    2       5.968               us/op
ListsIteration.iterateArrayList                     N/A  1000000                                                               N/A  avgt    2    6686.546               us/op
ListsIteration.iterateLinkedList                    N/A       10                                                               N/A  avgt    2       0.054               us/op
ListsIteration.iterateLinkedList                    N/A     1000                                                               N/A  avgt    2       5.847               us/op
ListsIteration.iterateLinkedList                    N/A  1000000                                                               N/A  avgt    2    8858.273               us/op
Maps.hashMapPut                                     N/A     1000                                                               N/A  avgt    3      30.915 ±      2.509  us/op
Maps.hashMapPut                                     N/A  1000000                                                               N/A  avgt    3   84037.499 ±  37846.086  us/op
Maps.treeMapPut                                     N/A     1000                                                               N/A  avgt    3      93.640 ±     41.191  us/op
Maps.treeMapPut                                     N/A  1000000                                                               N/A  avgt    3  173049.590 ± 428953.188  us/op
PatternVsStringReplaceAll.usingPattern                       N/A                                                               N/A  avgt    2      79.324               ns/op
PatternVsStringReplaceAll.usingPattern  Spaces and dot.      N/A                                                               N/A  avgt    2     300.964               ns/op
PatternVsStringReplaceAll.usingString                        N/A                                                               N/A  avgt    2     271.305               ns/op
PatternVsStringReplaceAll.usingString   Spaces and dot.      N/A                                                               N/A  avgt    2     557.463               ns/op
Whitespace.forBiLoop                                N/A      N/A  a                                                                 avgt    2       0.004               us/op
Whitespace.forBiLoop                                N/A      N/A                                                                 a  avgt    2       0.005               us/op
Whitespace.forBiLoop                                N/A      N/A                                                                    avgt    2       0.073               us/op
Whitespace.forLoop                                  N/A      N/A  a                                                                 avgt    2       0.004               us/op
Whitespace.forLoop                                  N/A      N/A                                                                 a  avgt    2       0.021               us/op
Whitespace.forLoop                                  N/A      N/A                                                                    avgt    2       0.022               us/op
Whitespace.regex                                    N/A      N/A  a                                                                 avgt    2       0.072               us/op
Whitespace.regex                                    N/A      N/A                                                                 a  avgt    2       0.160               us/op
Whitespace.regex                                    N/A      N/A                                                                    avgt    2       0.157               us/op
Whitespace.trimEmpty                                N/A      N/A  a                                                                 avgt    2       0.033               us/op
Whitespace.trimEmpty                                N/A      N/A                                                                 a  avgt    2       0.037               us/op
Whitespace.trimEmpty                                N/A      N/A                                                                    avgt    2       0.025               us/op
```
