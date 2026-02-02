package org.example;

import java.util.ArrayList;
import java.util.List;

public class Repository<T> {
    private List<T> items;

    public Repository() {
        this.items = new ArrayList<>();
    }

    public List<T> getItems() {
        return items;
    }

    public void addItem(T item) {
        if (item != null) {
            items.add(item);
        }
    }

    public int count(){
        return items.size();
    }
}
