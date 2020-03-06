package com.lambok.app;

import lombok.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

//Описание: определение аннотации перед классом,
//для реализации стандартного  toString метода
@ToString
//Описание: легкое создание методов Equals и HashCode
@EqualsAndHashCode
public class LambokClass {

    //Описание: легкое создание getter’ов и setter’ов
    @Getter
    @Setter
    private int count = 35;

    public LambokClass() {
    }

    public String utf8ToString1(byte[] bytes) {
        try {
            return new String(bytes, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            //Описание: обертка проверяемых исключений
            throw Lombok.sneakyThrow(e);
        }
    }

    //Описание: обертка проверяемых исключений
    @SneakyThrows
    public String utf8ToString2(byte[] bytes) {
        try {
            return new String(bytes, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new Exception();
        }
    }

    @SneakyThrows
    public void createFile() {
        //писание: простое определение ресурсов,
        //так чтобы они автоматически закрывались после окончания работы кода.
        //(не так актуально при использовании try with resources )
        @Cleanup InputStream in = new FileInputStream("asd");
    }


}