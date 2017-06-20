# Test repo, please ignore

This project contains some Java performance benchmarks.
 
 
Latest data:

```
Benchmark                 (items)  Mode  Cnt       Score        Error  Units
Iteration.usingIteration    10000  avgt    5   58163,926 ±  11140,615  ns/op
Iteration.usingLambda       10000  avgt    5   60857,529 ±   8990,244  ns/op
Iteration.usingMethodRef    10000  avgt    5   61532,830 ±  12666,721  ns/op
Lists.arrayListAdd           1000  avgt    3       4,607 ±      1,200  us/op
Lists.arrayListAdd        1000000  avgt    3    5148,315 ±    804,667  us/op
Lists.linkedListAdd          1000  avgt    3       4,857 ±      4,115  us/op
Lists.linkedListAdd       1000000  avgt    3    4592,862 ±   2787,319  us/op
Maps.hashMapPut              1000  avgt    3      17,655 ±      1,457  us/op
Maps.hashMapPut           1000000  avgt    3   18213,126 ±  13198,877  us/op
Maps.treeMapPut              1000  avgt    3      53,239 ±     10,704  us/op
Maps.treeMapPut           1000000  avgt    3  215004,539 ± 231130,444  us/op
```