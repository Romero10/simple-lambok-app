package com.lambok.app;

import lombok.*;

// @Data: Описание: генерация всех служебных методов,
//заменяет сразу команды @ToString, @EqualsAndHashCode,
//Getter, Setter, @RequiredArgsConstructor
@Data
//Описание: создание неизменяемых классов,
//аналог Data, но для неизменяемых классов
//@Value
public class LambokClass3 {

    private int count = 35;

    public LambokClass3() {
    }
}