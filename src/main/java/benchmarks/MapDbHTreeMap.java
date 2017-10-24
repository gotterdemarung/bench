package benchmarks;

import org.mapdb.DB;
import org.mapdb.DBMaker;
import org.mapdb.HTreeMap;
import org.mapdb.Serializer;
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

import java.util.Objects;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Warmup(iterations = 2, time = 5, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 2, time = 2, timeUnit = TimeUnit.SECONDS)
@Fork(1)
@State(Scope.Benchmark)
public class MapDbHTreeMap {
    @Param({"Memory", "MemoryDirect"})
    public String mode;
    @Param({"1000", "1000000"})
    public int items;

    private DB getDb() {
        if (mode.equals("Memory")) {
            return DBMaker.memoryDB().make();
        } else if (mode.equals("MemoryDirect")) {
            return DBMaker.memoryDirectDB().make();
        }

        return null;
    }

    @Benchmark
    public int Open() {
        try (DB db = getDb()) {
            HTreeMap<Integer, String> data = db.hashMap("foo")
                    .keySerializer(Serializer.INTEGER)
                    .valueSerializer(Serializer.STRING)
                    .counterEnable()
                    .create();

            return data.size();
        }
    }

    @Benchmark
    public int Put() {
        try (DB db = getDb()) {
            HTreeMap<Integer, String> data = db.hashMap("foo")
                    .keySerializer(Serializer.INTEGER)
                    .valueSerializer(Serializer.STRING)
                    .counterEnable()
                    .create();

            for (int i = 0; i < items; i++) {
                data.put(i, "foo" + i);
            }
            return data.size();
        }
    }

    @Benchmark
    public int PutGet() {
        try (DB db = getDb()) {
            HTreeMap<Integer, String> data = db.hashMap("foo")
                    .keySerializer(Serializer.INTEGER)
                    .valueSerializer(Serializer.STRING)
                    .counterEnable()
                    .create();

            for (int i = 0; i < items; i++) {
                data.put(i, "foo" + i);
            }
            for (int i = 0; i < items; i++) {
                String value = data.get(i);
                if (!Objects.equals(value, "foo" + i)) {
                    throw new RuntimeException("Unexpected value " + value);
                }
            }
            return data.size();
        }
    }
}
