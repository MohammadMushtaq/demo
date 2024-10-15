package org.example;

import java.util.ArrayList;

public class GenericRunnerCustom<T> {

    ArrayList<T> arrayList = new ArrayList<>();

    public void addElements(T element) {
        arrayList.add(element);
    }

    public void removeElements(T element) {
        arrayList.remove(element);
    }

    @Override
    public String toString() {
        return arrayList.toString();
    }

    public T get(int i) {
        return arrayList.get(i);
    }
}
