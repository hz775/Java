package com.bridgelabz.inheritance;

class Device {
    private int deviceId;
    private String status;

    public Device(int deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public String getStatus() {
        return status;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
