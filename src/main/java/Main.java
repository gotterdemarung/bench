import benchmarks.ConditionVsFilter;
import benchmarks.Iteration;
import benchmarks.Lists;
import benchmarks.ListsIteration;
import benchmarks.Maps;
import benchmarks.PatternVsStringReplaceAll;
import benchmarks.TrimVsStrip;
import benchmarks.Whitespace;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class Main {
    public static void main(String[] args) throws Exception {
        Options opt = new OptionsBuilder()
                .include(TrimVsStrip.class.getSimpleName())
                .include(Whitespace.class.getSimpleName())
                .include(Lists.class.getSimpleName())
                .include(Maps.class.getSimpleName())
                .include(Iteration.class.getSimpleName())
                .include(ListsIteration.class.getSimpleName())
                .include(ConditionVsFilter.class.getSimpleName())
                .include(PatternVsStringReplaceAll.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(opt).run();
    }
}
