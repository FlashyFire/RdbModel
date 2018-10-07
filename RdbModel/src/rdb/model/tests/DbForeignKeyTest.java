package rdb.model.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rdb.model.DbAction;
import rdb.model.DbForeignKey;

import static org.junit.jupiter.api.Assertions.*;

class DbForeignKeyTest {
    private DbForeignKey _key;

    @BeforeEach
    void setUp() {
        _key = new DbForeignKey("Key1");
    }

    @AfterEach
    void tearDown() {
        _key = null;
    }

    @Test
    void name() {
        assertEquals("Key1", _key.name());
        _key.setName("Key2");
        assertEquals("Key2", _key.name());
    }

    @Test
    void targetTable() {
        assertEquals("", _key.targetTable());
        _key.setTargetTable("Table2");
        assertEquals("Table2", _key.targetTable());
    }

    @Test
    void oneToMany() {
        assertTrue(_key.oneToMany());
        _key.setOneToMany(false);
        assertFalse(_key.oneToMany());
    }

    @Test
    void pairs() {
        assertNotNull(_key.pairs());
        assertTrue(_key.pairs().isEmpty());
    }

    @Test
    void onDelete() {
        assertEquals(DbAction.None, _key.onDelete());
        _key.setOnDelete(DbAction.Cascade);
        assertEquals(DbAction.Cascade, _key.onDelete());
    }

    @Test
    void onUpdate() {
        assertEquals(DbAction.None, _key.onUpdate());
        _key.setOnUpdate(DbAction.Cascade);
        assertEquals(DbAction.Cascade, _key.onUpdate());
    }
}