package rdb.model.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rdb.model.DbViewColumn;

import static org.junit.jupiter.api.Assertions.*;

class DbViewColumnTest {
    private DbViewColumn _column;

    @BeforeEach
    void setUp() {
        _column = new DbViewColumn("Table1", "Column1");
    }

    @AfterEach
    void tearDown() {
        _column = null;
    }

    @Test
    void table() {
        assertEquals("Table1", _column.table());
        _column.setTable("Table2");
        assertEquals("Table2", _column.table());
        assertThrows(IllegalArgumentException.class, () -> _column.setTable(""));
    }

    @Test
    void column() {
        assertEquals("Column1", _column.column());
        _column.setColumn("Column2");
        assertEquals("Column2", _column.column());
        assertThrows(IllegalArgumentException.class, () -> _column.setColumn(""));
    }

    @Test
    void alias() {
        assertEquals("", _column.alias());
        _column.setAlias("Alias1");
        assertEquals("Alias1", _column.alias());
    }

    @Test
    void name() {
        assertEquals("Table1.Column1", _column.name());
        _column = new DbViewColumn("Products", "Id", "Product_Id");
        assertEquals("Product_Id", _column.name());
    }
}