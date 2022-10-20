package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        List<String> first = new ArrayList<>(List.of("his is a good way to learn Java Functional Interfaces.",
                "Hello world Java.",
                "MJC is a great school"));

        InterfaceCreator creator = new InterfaceCreator();

        Supplier<List<String>> supplier = creator.filterCollection(first);

        System.out.println(supplier.get());
    }
}
