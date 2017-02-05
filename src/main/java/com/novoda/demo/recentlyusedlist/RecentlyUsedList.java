package com.novoda.demo.recentlyusedlist;


import java.util.ArrayList;
import java.util.List;

public class RecentlyUsedList {

    private final List<String> items;

    public RecentlyUsedList() {
        this.items = new ArrayList<String>();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        if (hasItemsToAdd()) {
            addItems(stringBuilder);
        }
        stringBuilder.append("]");

        return stringBuilder.toString();
    }

    private boolean hasItemsToAdd() {
        return !items.isEmpty();
    }

    private void addItems(StringBuilder stringBuilder) {
        stringBuilder.append(items.get(0));
        for (int i = 1; i < items.size(); i++) {
            stringBuilder.append(", ");
            stringBuilder.append(items.get(i));
        }
    }

    public void add(String item) {
        items.remove(item);
        items.add(0, item);
    }

    public String get(int index) {
        return items.get(index);
    }
}
