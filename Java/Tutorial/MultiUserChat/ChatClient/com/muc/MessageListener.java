package com.muc;

public interface MessageListener {
    abstract public void onMessage(String fromUser, String message);
}
