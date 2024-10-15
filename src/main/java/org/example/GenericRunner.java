package org.example;

public class GenericRunner {

    public static void main(String[] args) {

        GenericRunnerCustom<String> myCustom = new GenericRunnerCustom<>();
        myCustom.addElements("Element 1");
        myCustom.addElements("Element 2");
        System.out.println(myCustom);
        String value = myCustom.get(0);
        System.out.println(value);

        GenericRunnerCustom<Integer> myCustom2 = new GenericRunnerCustom<>();
        myCustom2.addElements(33);
        myCustom2.addElements(44);
        System.out.println(myCustom2);
        Integer intValue = myCustom2.get(0);
        System.out.println(intValue);
    }

}
