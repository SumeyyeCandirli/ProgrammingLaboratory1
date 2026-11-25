package labweek9;

import java.util.ArrayList;

public class Team {
    private ArrayList<GameCharacter> members;

    public Team() {
        this.members = new ArrayList<>();
    }

    public boolean addCharacter(GameCharacter character) {
        if (character == null) return false;
        if (findByName(character.getName()) != null) {
            System.out.println("Error: Character with name " + character.getName() + " already exists.");
            return false;
        }
        members.add(character);
        return true;
    }

    public boolean removeCharacter(String name) {
        GameCharacter target = findByName(name);
        if (target != null) {
            members.remove(target);
            System.out.println(name + " removed from the team.");
            return true;
        }
        System.out.println(name + " not found in the team.");
        return false;
    }

    public GameCharacter findByName(String name) {
        for (GameCharacter c : members) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }

    public void attackAll(GameCharacter target) {
        for (GameCharacter member : members) {
            if (member.isAlive() && member instanceof Attacker) {
                int dealt = ((Attacker) member).attack(target);
                System.out.println(member.getName() + " attacked " + target.getName() + " for " + dealt + " damage.");
            }
        }
    }

    public void healTeam() {
        for (GameCharacter member : members) {
            if (member.isAlive() && member instanceof Supporter) {
                GameCharacter lowest = null;
                double minRatio = Double.MAX_VALUE;

                for (GameCharacter c : members) {
                    if (c.isAlive()) {
                        double ratio = (double) c.getHealth() / c.getMaxHealth();
                        if (ratio < minRatio) {
                            minRatio = ratio;
                            lowest = c;
                        }
                    }
                }

                if (lowest != null) {
                    int healed = ((Supporter) member).heal(lowest);
                    System.out.println(member.getName() + " healed " + lowest.getName() + " for " + healed + " health.");
                }
            }
        }
    }

    public int getTotalPower() {
        int total = 0;
        for (GameCharacter c : members) {
            if (c.isAlive()) {
                total += c.calculatePower();
            }
        }
        return total;
    }

    public void displayTeam() {
        for (GameCharacter c : members) {
            System.out.println(c.getCharacterInfo());
        }
    }
}