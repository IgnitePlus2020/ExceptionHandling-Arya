package com.tgt.igniteplus;
import java.lang.String;
class InvalidCodeException extends Exception{
    InvalidCodeException(String s) {
        super(s);
    }
}