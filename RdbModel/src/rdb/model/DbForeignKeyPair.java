package rdb.model;

public class DbForeignKeyPair {
    private String _sourceColumn;
    private String _targetColumn;

    public DbForeignKeyPair(String sourceColumn, String targetColumn) {
        _sourceColumn = sourceColumn;
        _targetColumn = targetColumn;
    }

    public String sourceColumn() { return _sourceColumn; }
    public void setSourceColumn(String value) { _sourceColumn = value; }

    public String targetColumn() { return _targetColumn; }
    public void setTargetColumn(String value) { _targetColumn = value; }
}
