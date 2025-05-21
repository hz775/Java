package com.bridgelabz.inheritance;

class Thermostat extends Device {
    private int temperatureSetting;

    public Thermostat(int deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    public void displayDetails() {
        System.out.println("Device Id: " + getDeviceId());
        System.out.println("Status: " + getStatus());
        System.out.println("Temperature Setting: " + temperatureSetting);
    }
}
