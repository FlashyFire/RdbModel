package rdb.model;

import java.util.ArrayList;
import java.util.List;

public class DbIndex extends DbNamedObject {
    private ArrayList<String> _columns = new ArrayList<>();
    private DbIndexType _type = DbIndexType.Index;

    public DbIndex(String name) {
        super(name);
    }

    public List<String> columns() { return _columns; }

    public DbIndexType type() { return _type; }
    public void setType(DbIndexType type) { _type = type; }
}
