package labweek9;

public class LabWeek9 {

    public static void main(String[] args) {
       
        Warrior invalidChar = new Warrior("Rook", -5, 0, 10);

        Team team = new Team();
        Warrior warrior = new Warrior("Arthur", 10, 200, 30);
        Mage mage = new Mage("Merlin", 12, 120, 50);
        Healer healer = new Healer("Elena", 8, 130, 25);

        team.addCharacter(warrior);
        team.addCharacter(mage);
        team.addCharacter(healer);
        team.addCharacter(invalidChar);
        team.addCharacter(new Mage("Arthur", 5, 100, 40));

        team.displayTeam();
        System.out.println("Total Team Power: " + team.getTotalPower());

        Warrior golem = new Warrior("Golem", 20, 400, 40);
        System.out.println("Enemy: " + golem.getCharacterInfo());

        for (int round = 1; round <= 2; round++) {
            System.out.println("Round " + round);
            team.attackAll(golem);

            if (golem.isAlive()) {
                int dmg1 = golem.attack(warrior);
                System.out.println("Golem attacked " + warrior.getName() + " for " + dmg1 + " damage.");
                int dmg2 = golem.attack(mage);
                System.out.println("Golem attacked " + mage.getName() + " for " + dmg2 + " damage.");
            }

            team.healTeam();
        }

        team.displayTeam();

        GameCharacter found = team.findByName("Merlin");
        if (found != null) {
            System.out.println("Found: " + found.getCharacterInfo());
        }

        team.removeCharacter("Rook");
        team.displayTeam();
    }
}
    
    

