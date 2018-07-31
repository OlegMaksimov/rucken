package com.spring.rucken.dto;

public class OutAccountTokenDto {
    private String token;
    private AccountDto user;

    public OutAccountTokenDto() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public AccountDto getUser() {
        return user;
    }

    public void setUser(AccountDto user) {
        this.user = user;
    }
}
