package benchmarks;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 2, timeUnit = TimeUnit.SECONDS)
@Fork(1)
@State(Scope.Benchmark)
public class ConditionVsFilter {
    @Benchmark
    public int standardLoop() {
        int result = 0;
        for (int i = 0; i < 10; i++) {
            result = result | standard(i);
        }
        return result;
    }

    private int standard(final Integer i) {
        if (i == 13) {
            throw new RuntimeException();
        }
        if (i == 12) {
            throw new RuntimeException();
        }
        if (i == 11) {
            throw new RuntimeException();
        }

        return i;
    }

    @Benchmark
    public int filterLoop() {
        int result = 0;
        for (int i = 0; i < 10; i++) {
            result = result | filter(i);
        }
        return result;
    }

    private int filter(final Integer i) {
        Optional.of(i)
                .filter(x -> x != 13)
                .filter(x -> x != 12)
                .filter(x -> x != 11)
                .orElseThrow(RuntimeException::new);

        return i;
    }
}
