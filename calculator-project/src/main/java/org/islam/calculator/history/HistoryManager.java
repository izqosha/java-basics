package org.islam.calculator.history;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HistoryManager {
    private static final int MAX_SIZE = 10;

    private final List<String> history = new ArrayList<>();

    public void addRecord(String operation) {
        if (history.size() >= MAX_SIZE) {
            history.remove(0);
        } history.add(operation);
    }

    public List<String> getHistory() {
        return Collections.unmodifiableList(history);
    }

    public void clear() {
        history.clear();
    }

    public int size() {
        return history.size();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }

    public String getLastRecord() {
        if (history.isEmpty()) {
            return null;
        }
        return history.get(history.size() -1);
    }
}
