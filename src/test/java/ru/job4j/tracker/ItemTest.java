package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

class ItemTest {

    @Test
    public void whenSortItemsByName() {
        List<Item> items = new ArrayList<>();
                items.add(new Item(2, "Item 2"));
                items.add(new Item(1, "Item 1"));
                items.add(new Item(3, "Item 3"));

        items.sort(new ItemAscByName());

        List<Item> expected = new ArrayList<>();
        expected.add(new Item(1, "Item 1"));
        expected.add(new Item(2, "Item 2"));
        expected.add(new Item(3, "Item 3"));
        assertEquals(items, expected);
    }

    @Test
    public void whenSortItemsByNameDesc() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(1, "Item 1"));
        items.add(new Item(3, "Item 3"));
        items.add(new Item(2, "Item 2"));

        items.sort(new ItemDescByName());

        List<Item> expected = new ArrayList<>();
        expected.add(new Item(3, "Item 3"));
        expected.add(new Item(2, "Item 2"));
        expected.add(new Item(1, "Item 1"));
        assertEquals(items, expected);
    }
}