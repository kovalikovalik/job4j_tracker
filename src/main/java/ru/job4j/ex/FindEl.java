package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                throw new ElementNotFoundException("Element not found");
            } else {
                rsl = i;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] value =  {"One", "Two", "Three"};
        String key = "Four";
        try {
            FindEl.indexOf(value, key);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}