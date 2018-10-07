package rdb.model.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rdb.model.DbIndex;
import rdb.model.DbIndexType;

import static org.junit.jupiter.api.Assertions.*;

class DbIndexTest {
    private DbIndex _index;

    @BeforeEach
    void setUp() {
        _index = new DbIndex("Index1");
    }

    @AfterEach
    void tearDown() {
        _index = null;
    }

    @Test
    void name() {
        assertEquals("Index1", _index.name());
        _index.setName("Index2");
        assertEquals("Index2", _index.name());
    }

    @Test
    void columns() {
        assertNotNull(_index.columns());
        assertTrue(_index.columns().isEmpty());
    }

    @Test
    void type() {
        assertEquals(DbIndexType.Index, _index.type());
        _index.setType(DbIndexType.PrimaryKey);
        assertEquals(DbIndexType.PrimaryKey, _index.type());
    }
}