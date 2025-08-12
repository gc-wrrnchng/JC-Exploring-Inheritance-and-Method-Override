package org.example;

class GameCharacter {
    protected int health;

    public GameCharacter(int health) {
        this.health = health;
    }

    public void takeDamage(int amount) {
        health -= amount;
    }

    public int getHealth() {
        return this.health;
    }
}

class ArmoredCharacter extends GameCharacter {
    public ArmoredCharacter(int health) {
        super(health);
    }

    public void takeDamage(int amount) {
        amount = amount / 2;
        super.takeDamage(amount);
    }
}
