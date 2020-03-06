package com.lambok.app;

import lombok.NonNull;
import lombok.extern.java.Log;

//Описание: добавление инницилизации логирования,
//так же позволяет выбрать вид логгера: @CommonsLog,
//@JBossLog, Log, @Log4j, @Log4j2, @Slf4j, @XSlf4j
@Log
public class LambokClass4 {

    //NonNull - Описание: обработка переменных,
    //которые не должны получать null
    public LambokClass4(@NonNull String str) {
        str.trim();
        log.info("Hello!!!!");
    }
}
