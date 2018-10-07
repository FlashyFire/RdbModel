package rdb.model.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rdb.model.DbColumn;
import rdb.model.DbValueType;

import static org.junit.jupiter.api.Assertions.*;

class DbColumnTest {
    private DbColumn _column;

    @BeforeEach
    void setUp() {
        _column = new DbColumn("Column1");
    }

    @AfterEach
    void tearDown() {
        _column = null;
    }

    @Test
    void name() {
        assertEquals("Column1", _column.name());
        _column.setName("Column2");
        assertEquals("Column2", _column.name());
    }

    @Test
    void valueType() {
        assertEquals(DbValueType.VarChar, _column.valueType());
        _column.setValueType(DbValueType.Blob);
        assertEquals(DbValueType.Blob, _column.valueType());
    }

    @Test
    void valueLength() {
        assertEquals(50, _column.valueLength());

        _column.setValueLength(100);
        assertEquals(100, _column.valueLength());

        _column.setValueLength(1);
        assertEquals(1, _column.valueLength());

        assertThrows(IllegalArgumentException.class, () -> _column.setValueLength(0));
    }

    @Test
    void allowNulls() {
        assertTrue(_column.allowNulls());
        _column.setAllowNulls(false);
        assertFalse(_column.allowNulls());
    }

    @Test
    void defaultValue() {
        assertNull(_column.defaultValue());
        _column.setDefaultValue("Text");
        assertNotNull(_column.defaultValue());
    }
}