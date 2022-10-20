package com.epam.mjc;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfaceCreator {

    public Predicate<List<String>> isValuesStartWithUpperCase() {
        return list ->  {
            for (String string: list) {
                if (!Character.isUpperCase(string.charAt(0))) {
                    return false;
                }
            }
            return true;
        };

    }

    public Consumer<List<Integer>> addEvenValuesAtTheEnd() {
        {
            return list -> {
                List<Integer> temp = new ArrayList<>();
                for (Integer num: list) {
                    if (num % 2 == 0) {
                        temp.add(num);
                    }
                }
                list.addAll(temp);
            };
        }
    }

    public Supplier<List<String>> filterCollection(List<String> values) {
        return () -> {
            List<String> result = new ArrayList<>();
            for (String value: values) {
                if (Character.isUpperCase(value.charAt(0)) && value.endsWith(".") && value.length() > 3) {
                    result.add(value);
                }
            }
            return result;
        };
    }

    public Function<List<String>, Map<String, Integer>> stringSize() {
        return list -> {
            Map<String, Integer> result = new HashMap<>();
            for (String value: list) {
                result.put(value, value.length());
            }
            return result;
        };
    }

    public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {
        return (list1, list2) -> {
            List<Integer> result = new ArrayList<>(list1);
            result.addAll(list2);
            return result;
        };
    }
}
