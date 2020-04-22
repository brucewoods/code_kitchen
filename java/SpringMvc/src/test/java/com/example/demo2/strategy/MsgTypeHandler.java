package com.example.demo2.strategy;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.example.demo.strategy2.MSG_TYPE;
@Documented
@Inherited
 
public @interface MsgTypeHandler {

    MSG_TYPE value();
} 