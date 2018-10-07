package rdb.model.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rdb.model.DbTable;

import static org.junit.jupiter.api.Assertions.*;

class DbTableTest {
    private DbTable _table;

    @BeforeEach
    void setUp() {
        _table = new DbTable("Table1");
    }

    @AfterEach
    void tearDown() {
        _table = null;
    }

    @Test
    void name() {
        assertEquals("Table1", _table.name());
        _table.setName("Table2");
        assertEquals("Table2", _table.name());
    }

    @Test
    void columns() {
        assertNotNull(_table.columns());
        assertTrue(_table.columns().isEmpty());
    }

    @Test
    void indexes() {
        assertNotNull(_table.indexes());
        assertTrue(_table.indexes().isEmpty());
    }

    @Test
    void foreignKeys() {
        assertNotNull(_table.foreignKeys());
        assertTrue(_table.foreignKeys().isEmpty());
    }
}