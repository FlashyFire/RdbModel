package rdb.model;

public class DbColumn extends DbNamedObject {
    private DbValueType _valueType = DbValueType.VarChar;
    private int _valueLength = 50;
    private boolean _allowNulls = true;
    private Object _defaultValue = null;

    public DbColumn(String name) {
        super(name);
    }

    public DbValueType valueType() { return _valueType; }
    public void setValueType(DbValueType valueType) { _valueType = valueType; }

    public int valueLength() { return _valueLength; }
    public void setValueLength(int valueLength) {
        if (valueLength < 1)
            throw new IllegalArgumentException("Value should be greater or equal to one!");
        _valueLength = valueLength;
    }

    public boolean allowNulls() { return _allowNulls; }
    public void setAllowNulls(boolean allowNulls) { _allowNulls = allowNulls; }

    public Object defaultValue() { return _defaultValue; }
    public void setDefaultValue(Object value) { _defaultValue = value; }
}
