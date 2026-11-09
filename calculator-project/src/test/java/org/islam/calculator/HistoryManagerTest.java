package org.islam.calculator;

import org.islam.calculator.calculator.HistoryManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HistoryManagerTest {
    @Test
    void historyStoresOperations() {
        HistoryManager history = new HistoryManager();
        history.addRecord("5.0 + 3.0 = 8.0");
        assertEquals(1, history.size());
    }

    @Test
    void testAddAndGet() {
        HistoryManager hm = new HistoryManager();
        hm.addRecord("2 + 2 = 4.0");

        assertEquals(1, hm.size());
        assertEquals("2 + 2 = 4.0", hm.getLastRecord());
        assertFalse(hm.isEmpty());
    }

    @Test
    void testMaxSizeLimit() {
        HistoryManager hm = new HistoryManager();
        for (int i = 0; i < 11; i++) {
            hm.addRecord("op " + i);
        }

        assertEquals(10, hm.size());
        assertEquals("op 1", hm.getHistory().get(0)); // Первая удалилась
    }

    @Test
    void testClear() {
        HistoryManager hm = new HistoryManager();
        hm.addRecord("1 + 1 = 2.0");
        hm.clear();

        assertTrue(hm.isEmpty());
        assertNull(hm.getLastRecord());
    }
}