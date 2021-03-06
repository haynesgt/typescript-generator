
package cz.habarta.typescript.generator.emitter;

import cz.habarta.typescript.generator.TsProperty;
import cz.habarta.typescript.generator.TsType;
import java.util.List;


public class TsPropertyModel extends TsProperty implements Comparable<TsProperty> {

    public final boolean readonly;
    public final List<String> comments;

    public TsPropertyModel(String name, TsType tsType, boolean readonly, List<String> comments) {
        super(name, tsType);
        this.readonly = readonly;
        this.comments = comments;
    }

    public List<String> getComments() {
        return comments;
    }

    public TsPropertyModel setTsType(TsType type) {
        return new TsPropertyModel(getName(), type, readonly, getComments());
    }

    @Override
    public int compareTo(TsProperty o) {
        return name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "TsPropertyModel{" + "name=" + name + ", tsType=" + tsType + '}';
    }

}
