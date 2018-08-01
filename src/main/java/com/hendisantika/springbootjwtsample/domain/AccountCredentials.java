package com.hendisantika.springbootjwtsample.domain;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jwt-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/08/18
 * Time: 07.41
 * To change this template use File | Settings | File Templates.
 */
public class AccountCredentials {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
