package rdb.model;

import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class DbTable extends DbNamedObject {
    private ArrayList<DbColumn> _columns = new ArrayList<>();
    private ArrayList<DbIndex> _indexes = new ArrayList<>();
    private ArrayList<DbForeignKey> _foreignKeys = new ArrayList<>();

    public DbTable(String name) {
        super(name);
    }

    public List<DbColumn> columns() { return _columns; }
    public List<DbIndex> indexes() { return _indexes; }
    public List<DbForeignKey> foreignKeys() { return _foreignKeys; }
}
