package net.happiness.hash;

public class SimpleHashArray {

    private final String[] storage;

    public SimpleHashArray(int size) {
        storage = new String[size];
    }

    public String[] getStorage() {
        return storage;
    }

    public void addAll(String[] values) {
        for (String value : values) {
            int hash = hash(value);
            int position = position(hash);
            if (position > -1) {
                storage[position] = value;
            }
        }
    }

    private int hash(String value) {
        try {
            return Integer.parseInt(value);
        } catch (RuntimeException ignore) {}
        return -1;
    }

    private int position(int hash) {
        if (hash > -1 && hash < storage.length) {
            return hash;
        }
        return -1;
    }

}
