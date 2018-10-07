package rdb.model.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rdb.model.DbModel;

import static org.junit.jupiter.api.Assertions.*;

class DbModelTest {
    private DbModel _model;

    @BeforeEach
    void setUp() {
        _model = new DbModel();
    }

    @AfterEach
    void tearDown() {
        _model = null;
    }

    @Test
    void tables() {
        assertNotNull(_model.tables());
        assertTrue(_model.tables().isEmpty());
    }

    @Test
    void views() {
        assertNotNull(_model.views());
        assertTrue(_model.views().isEmpty());
    }
}