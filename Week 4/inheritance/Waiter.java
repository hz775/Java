package com.bridgelabz.inheritance;

class Waiter extends PersonDetails implements Worker {
    private int experience;

    public Waiter(String name, int id, int experience) {
        super(name, id);
        this.experience = experience;
    }

    public void performDuties() {
        System.out.println("Waiter: " + experience + " years experience.");
    }

}
