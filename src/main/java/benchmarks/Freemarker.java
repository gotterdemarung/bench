package benchmarks;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(1)
@State(Scope.Benchmark)
public class Freemarker {
    private Template templateRaw;
    private Template templateWithMacro;
    private Payload data;

    @Param({"10", "100", "10000"})
    public int items;

    @Setup
    public void setUp() throws IOException {
        // Reading templates
        Configuration config = new Configuration(Configuration.VERSION_2_3_20);
        config.setClassForTemplateLoading(this.getClass(), "/freemarker/");
        templateRaw = config.getTemplate("table-raw.ftl");
        templateWithMacro = config.getTemplate("table-with-macro.ftl");

        // Filling rows
        ArrayList<ArrayList<Cell>> x = new ArrayList<>();
        for (int i = 0; i < items; i++) {
            ArrayList<Cell> row = new ArrayList<>();
            row.add(new Cell("id", i));
            row.add(new Cell("name", "foo" + i));
            row.add(new Cell("amount", 15.99));
            x.add(row);
        }
        this.data = new Payload(x);
    }

    @Benchmark
    public void renderRaw() throws IOException, TemplateException {
        templateRaw.process(data, Writer.nullWriter());
    }

    @Benchmark
    public void renderWithMacro() throws IOException, TemplateException {
        templateWithMacro.process(data, Writer.nullWriter());
    }

    public static class Payload {
        public ArrayList<ArrayList<Cell>> Rows;

        public Payload(ArrayList<ArrayList<Cell>> data) {
            this.Rows = data;
        }

        public ArrayList<ArrayList<Cell>> getRows() {
            return Rows;
        }
    }

    public static class Cell {
        public final String type;
        public final Object value;

        public Cell(final String type, final Object value) {
            this.type = type;
            this.value = value;
        }

        public String getType() {
            return type;
        }
    }
}
