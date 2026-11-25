package labweek9;

public class Healer extends GameCharacter implements Supporter {
    private int healAmount;

    public Healer(String name, int level, int maxHealth, int healAmount) {
        super(name, level, maxHealth);
        this.healAmount = healAmount;
    }

    @Override
    public int calculatePower() {
        return getLevel() * 5 + healAmount;
    }

    @Override
    public int heal(GameCharacter target) {
        if (!this.isAlive() || target == null || !target.isAlive()) {
            return 0;
        }
        int totalHeal = healAmount + getLevel();
        return target.restoreHealth(totalHeal);
    }

    @Override
    public String getCharacterInfo() {
        return "Healer: " + getName() + ", Level: " + getLevel() + ", Health: " + getHealth() + "/" + getMaxHealth() + ", Heal Amount: " + healAmount + ", Power: " + calculatePower();
    }
}
