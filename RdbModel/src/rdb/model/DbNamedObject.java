package rdb.model;

abstract class DbNamedObject {
    private String _name;

    DbNamedObject(String name) {
        _name = name;
    }

    public String name() {
        return _name;
    }
    public void setName(String name) {
        _name = name;
    }
}
