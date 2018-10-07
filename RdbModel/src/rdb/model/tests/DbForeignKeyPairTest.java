package rdb.model.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rdb.model.DbForeignKeyPair;

import static org.junit.jupiter.api.Assertions.*;

class DbForeignKeyPairTest {
    private DbForeignKeyPair _pair;

    @BeforeEach
    void setUp() {
        _pair = new DbForeignKeyPair("Column1", "Column2");
    }

    @AfterEach
    void tearDown() {
        _pair = null;
    }

    @Test
    void sourceColumn() {
        assertEquals("Column1", _pair.sourceColumn());
        _pair.setSourceColumn("Column3");
        assertEquals("Column3", _pair.sourceColumn());
    }

    @Test
    void targetColumn() {
        assertEquals("Column2", _pair.targetColumn());
        _pair.setTargetColumn("Column4");
        assertEquals("Column4", _pair.targetColumn());
    }
}