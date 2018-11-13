package com.youthlin.example.chat.protocol;

/**
 * 创建: youthlin.chen
 * 时间: 2018-11-12 15:13
 */
public interface Command {
    byte LOGIN_REQUEST = 1;
    byte LOGIN_RESPONSE = 2;
    byte MESSAGE_REQUEST = 3;
    byte MESSAGE_RESPONSE = 4;

}