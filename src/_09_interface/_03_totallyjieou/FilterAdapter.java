package _09_interface._03_totallyjieou;

/**
 * @Author wx-li
 * @Date 2019/8/27 11:07
 **/
public class FilterAdapter implements Processor {
    Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public WaveForm process(Object input) {
        return filter.process((WaveForm) input);
    }
}
