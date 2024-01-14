import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countHeroes = Integer.parseInt(scanner.nextLine());
        Map<String , Integer> heroesHP = new LinkedHashMap<>();
        Map<String , Integer> heroesMP = new LinkedHashMap<>();

        for(int i = 1 ; i <= countHeroes ; i++) {
            String heroInfo = scanner.nextLine();
            String heroName = heroInfo.split(" ")[0];
            int hp = Integer.parseInt(heroInfo.split(" ")[1]);
            int mp = Integer.parseInt(heroInfo.split(" ")[2]);

            if(hp <= 100) {
                heroesHP.put(heroName , hp);
            }

            if(hp <= 200) {
                heroesMP.put(heroName , mp);
            }
        }


        String command = scanner.nextLine();
        while(!command.equals("End")) {
            if(command.contains("CastSpell")) {
                String heroName =command.split("\\s+-\\s+")[1];
                int mpNeeded = Integer.parseInt(command.split("\\s+-\\s+")[2]);
                 String spellName = command.split("\\s+-\\s+")[3];

                 int currentMP = heroesMP.get(heroName);

                 if(currentMP >= mpNeeded) {
                     System.out.printf("%s has successfully cast %s and now has %d MP!%n" , heroName , spellName , currentMP - mpNeeded);
                     heroesMP.put(heroName , currentMP - mpNeeded);
                 } else {
                     System.out.printf("%s does not have enough MP to cast %s!%n" , heroName, spellName);
                 }
            } else if (command.contains("TakeDamage")) {
                String heroName =command.split("\\s+-\\s+")[1];
                int damage = Integer.parseInt(command.split("\\s+-\\s+")[2]);
                String attacker = command.split("\\s+-\\s+")[3];

                int currentHP = heroesHP.get(heroName);
                currentHP-= damage;
                if(currentHP > 0) {
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n" , heroName , damage , attacker , currentHP);
                    heroesHP.put(heroName,currentHP);
                } else  {
                    System.out.printf("%s has been killed by %s!%n",heroName , attacker);
                    heroesMP.remove(heroName);
                    heroesHP.remove(heroName);
                }
            } else if (command.contains("Recharge")) {
                String heroName =command.split("\\s+-\\s+")[1];
                int amount = Integer.parseInt(command.split("\\s+-\\s+")[2]);

                int currentMp = heroesMP.get(heroName);
                currentMp += amount;
                if(currentMp > 200) {
                    currentMp = 200;
                }

                System.out.printf("%s recharged for %d MP!%n" ,heroName , currentMp - heroesMP.get(heroName));
                heroesMP.put(heroName ,currentMp);

            } else if (command.contains("Heal")) {
                String heroName =command.split("\\s+-\\s+")[1];
                int amount = Integer.parseInt(command.split("\\s+-\\s+")[2]);

                int currentHp = heroesHP.get(heroName);
                currentHp += amount;
                if(currentHp > 100) {
                    currentHp = 100;
                }

                System.out.printf("%s healed for %d HP!%n" ,heroName , currentHp - heroesHP.get(heroName));
                heroesHP.put(heroName ,currentHp);
            }

            command = scanner.nextLine();
        }

        heroesMP.entrySet().forEach((entry) -> {
            String heroName = entry.getKey();
            System.out.println(heroName);
            System.out.println(" HP: " + entry.getValue());
            System.out.println(" MP: " + heroesMP.get(heroName));
        });
    }
}

