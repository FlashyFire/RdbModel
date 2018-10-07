package rdb.model;

public class DbViewColumn {
    private static final String EMPTY_TABLE_NAME = "An empty table name does not allowed!";
    private static final String EMPTY_COLUMN_NAME = "An empty column name does not allowed!";
    private String _table;
    private String _column;
    private String _alias;

    public DbViewColumn(String table, String column) {
        this(table, column, "");
    }

    public DbViewColumn(String table, String column, String alias) {
        checkArg(table, EMPTY_TABLE_NAME);
        checkArg(column, EMPTY_COLUMN_NAME);
        _table = table;
        _column = column;
        _alias = alias;
    }

    public String table() { return _table; }
    public void setTable(String table) {
        checkArg(table, EMPTY_TABLE_NAME);
        _table = table;
    }

    public String column() { return _column; }
    public void setColumn(String column) {
        checkArg(column, EMPTY_COLUMN_NAME);
        _column = column;
    }

    public String alias() { return _alias; }
    public void setAlias(String alias) { _alias = alias; }

    public String name() {
        if (_alias == null || _alias.isEmpty())
            return _table + "." + _column;
        return _alias;
    }

    private void checkArg(String s, String message) {
        if (s == null || s.isEmpty())
            throw new IllegalArgumentException(message);
    }
}
