package rdb.model;

import java.util.ArrayList;
import java.util.List;

public class DbForeignKey extends DbNamedObject {
    private String _targetTable = "";
    private boolean _oneToMany = true;
    private final ArrayList<DbForeignKeyPair> _pairs = new ArrayList<>();
    private DbAction _onUpdate = DbAction.None;
    private DbAction _onDelete = DbAction.None;

    public DbForeignKey(String name) {
        super(name);
    }

    public String targetTable() {
        return _targetTable;
    }

    public void setTargetTable(String targetTable) {
        _targetTable = targetTable;
    }

    public boolean oneToMany() {
        return _oneToMany;
    }

    public void setOneToMany(boolean oneToMany) {
        _oneToMany = oneToMany;
    }

    public List<DbForeignKeyPair> pairs() { return _pairs; }

    public DbAction onDelete() {
        return _onDelete;
    }

    public void setOnDelete(DbAction onDelete) {
        _onDelete = onDelete;
    }

    public DbAction onUpdate() {
        return _onUpdate;
    }

    public void setOnUpdate(DbAction onUpdate) {
        _onUpdate = onUpdate;
    }
}
