package com.company;

public class Device extends Controller {

    private String protocol;
    private String name;
    private String description;
    private int address;
    private String type;

    public Device() {

    };

    public Device(String protocol, String name, String description, int address, String type) {
        this.protocol = protocol;
        this.name = name;
        this.description = description;
        this.address = address;
        this.type = type;
    }

    public String toString() {
        return protocol + ", " + name + ", " + description;
    }

    public String getProtocol() {
        return protocol;
    }
}
