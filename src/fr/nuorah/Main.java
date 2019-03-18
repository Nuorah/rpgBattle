package fr.nuorah;

import fr.nuorah.model.MonsterCharacter;
import fr.nuorah.model.PlayerCharacter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System. in);
        PlayerCharacter playerCharacter = new PlayerCharacter();
        MonsterCharacter monsterCharacter = new MonsterCharacter();
        System.out.println("Vous rencontrez un monstre!");
        int choice = 0;
        while(true) {
            System.out.println("Vous avez l'initiative");
            System.out.println("Vous avez " + playerCharacter.getHp() + " / " + playerCharacter.getMaxHp() + " HP");
            System.out.println("Il a " + monsterCharacter.getHp() + " / " + monsterCharacter.getMaxHp() + " HP");
            System.out.println("Faites votre choix : ");
            System.out.println("1.Attaque physique");
            System.out.println("2.TODO");
            System.out.println("3.TODO");
            String input = scanner.nextLine();
            choice = Integer.parseInt(input);
            if (choice == 1){
                playerCharacter.hit(monsterCharacter);
            }
            monsterCharacter.hit(playerCharacter);
        }
            }
}
