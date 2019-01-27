package com.muc;

public interface UserStatusListener {
    abstract public void online(String username);
    abstract public void offline(String username);
}
