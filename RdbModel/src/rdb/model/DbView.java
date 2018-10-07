package rdb.model;

import java.util.ArrayList;
import java.util.List;

public class DbView extends DbNamedObject {
    private final ArrayList<DbViewColumn> _columns = new ArrayList<>();

    public DbView(String name) {
        super(name);
    }

    public List<DbViewColumn> columns() { return _columns; }
}
