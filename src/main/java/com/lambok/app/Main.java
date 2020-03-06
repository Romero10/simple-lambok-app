package com.lambok.app;

import lombok.var;

public class Main {

    public static void main(String[] args) {

        //@ToString, @EqualsAndHashCode, @Getter, @Setter, @SneakyThrows, @Cleanup
        LambokClass lambokClass = new LambokClass();
        System.out.println("Hash Code: " + lambokClass.hashCode());
        System.out.println("Count before changing: " + lambokClass.getCount());
        lambokClass.setCount(25);
        System.out.println("Count after changing to 25: " + lambokClass.getCount());

        //@NoArgsConstructor, @RequiredArgsConstructor, @AllArgsConstructor
        LambokClass2 lambokClass2 = new LambokClass2(4);
        System.out.println("Count : " + lambokClass2.getCount());

        //@Data (@Value), var and val
        var lambokClass3 = new LambokClass3();
        System.out.println("Hash Code: " + lambokClass3.hashCode());
        System.out.println("Count before changing: " + lambokClass3.getCount());
        lambokClass.setCount(25);
        System.out.println("Count after changing to 25: " + lambokClass3.getCount());

        //@Log, @NonNull
        LambokClass4 lambokClass4 = new LambokClass4(null);

        //@UtilityClass
        LambokClass5.convertToString();

        //Other annotation:
        //@Builder - Описание: реализация паттерна bulder,
        //Singular – используется для объектов в
        //единственном экземпляре (добавления элемента
        //в коллекции и т.п.)
    }
}
