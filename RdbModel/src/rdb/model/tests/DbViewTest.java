package rdb.model.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rdb.model.DbView;

import static org.junit.jupiter.api.Assertions.*;

class DbViewTest {
    private DbView _view;

    @BeforeEach
    void setUp() {
        _view = new DbView("View1");
    }

    @AfterEach
    void tearDown() {
        _view = null;
    }

    @Test
    void columns() {
        assertNotNull(_view.columns());
        assertTrue(_view.columns().isEmpty());
    }

    @Test
    void name() {
        assertEquals("View1", _view.name());
        _view.setName("View2");
        assertEquals("View2", _view.name());
    }
}