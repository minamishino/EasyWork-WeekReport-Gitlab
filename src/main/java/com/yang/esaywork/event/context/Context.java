package com.yang.esaywork.event.context;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

/**
 * @author YangZ
 * @date 2022/11/30
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Context {

    UUID messageId;

    String message;

    public static Context create(String message){
        return new Context(UUID.randomUUID(),message);
    }

}
