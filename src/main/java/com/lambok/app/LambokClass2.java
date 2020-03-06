package com.lambok.app;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


//Описание: создания пустого конструктора,
//конструктора включающего все final поля,
//либо конструктора включающего все возможные поля

//@NoArgsConstructor
@RequiredArgsConstructor
//@AllArgsConstructor
public class LambokClass2 {

    @Getter
    private final int count;
}