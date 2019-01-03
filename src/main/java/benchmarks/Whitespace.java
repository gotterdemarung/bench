package benchmarks;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@Warmup(iterations = 3, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 2, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(1)
@State(Scope.Benchmark)
public class Whitespace {
    private static final Pattern rx = Pattern.compile("\\s+");

    @Param({
            "a                                                               ",
            "                                                               a",
            "                                                                "
    })
    public String target;

    @Benchmark
    public boolean trimEmpty() {
        return target.trim().isEmpty();
    }

    @Benchmark
    public boolean regex() {
        return rx.matcher(target).matches();
    }

    @Benchmark
    public boolean forLoop() {
        int len = target.length();
        for (int i = 0; i < len; i++) {
            if (target.charAt(i) != ' ') {
                return false;
            }
        }
        return true;
    }

    @Benchmark
    public boolean forBiLoop() {
        int len = target.length();
        for (int i = 0; i < len; i++) {
            if (i % 2 == 0) {
                if (target.charAt(i / 2) != ' ') {
                    return false;
                }
            } else {
                if (target.charAt(len - i / 2 - 1) != ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
