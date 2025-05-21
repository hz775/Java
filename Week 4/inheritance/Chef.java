package com.bridgelabz.inheritance;

class Chef extends PersonDetails implements Worker {
    private String cuisine;

    public Chef(String name, int id, String cuisine) {
        super(name, id);
        this.cuisine = cuisine;
    }

    public void performDuties() {
        System.out.println("Speciality " + cuisine + " dishes.");
    }
}
