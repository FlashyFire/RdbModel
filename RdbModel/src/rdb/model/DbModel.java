package rdb.model;

import java.util.ArrayList;
import java.util.List;

public class DbModel {
    private final ArrayList<DbTable> _tables = new ArrayList<>();
    private final ArrayList<DbView> _views = new ArrayList<>();

    public List<DbTable> tables() { return _tables; }
    public List<DbView> views() { return _views; }
}
