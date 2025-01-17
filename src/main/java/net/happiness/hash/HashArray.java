package net.happiness.hash;

import java.util.Objects;

public class HashArray {

    private final String[] storage;

    public HashArray(int size) {
        storage = new String[size];
    }

    public String[] getStorage() {
        return storage;
    }

    public String findByKey(String key) {
        Integer hash = hash(key);
        Integer position = position(hash);
        if (Objects.nonNull(position)) {
            return storage[position];
        }
        return null;
    }

    public void addAll(String[] values) {
        for (String value : values) {
            Integer hash = hash(value);
            Integer position = position(hash);
            if (Objects.nonNull(position)) {
                storage[position] = value;
            }
        }
    }

    private Integer hash(String value) {
        try {
            return Integer.parseInt(value);
        } catch (RuntimeException ignore) {}
        return null;
    }

    // May cause collision
    private Integer position(Integer hash) {
        Integer position = null;
        if (Objects.nonNull(hash)) {
            position = hash % storage.length;
            if (position > storage.length - 1) {
                position = storage.length - 1;
            }
            if (position < 0) {
                position = 0;
            }
        }
        return position;
    }

}
