package com.aukhatov.template.domain;

public class DataFile {
    private final byte[] body;
    private final byte[] sign;

    public DataFile(byte[] body, byte[] sign) {
        this.body = body;
        this.sign = sign;
    }

    public byte[] getBody() {
        return body;
    }

    public byte[] getSign() {
        return sign;
    }
}
