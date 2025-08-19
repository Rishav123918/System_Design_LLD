package factory_pattern_example;
import java.util.Scanner;
import java.util.*;
// Declare the EnemyFactory class and Enemy-related methods
// (User will implement these classes and methods)
interface Enemy{
    int getHealth();
    int getSpeed();
    int getAttackPower();
    String getType();
}
class Zombie implements Enemy{
    private int health = 50;
    private int speed = 2;
    private int attackPower = 10;

    public int getHealth(){
        return health;
    }
    public int getSpeed(){
        return speed;
    }
    public int getAttackPower(){
        return attackPower;
    }
    public String getType(){
        return "Zombie";
    }
}
class Vampire implements Enemy{
    private int health = 30;
    private int speed = 4;
    private int attackPower = 15;

    public int getHealth(){
        return health;
    }
    public int getSpeed(){
        return speed;
    }
    public int getAttackPower(){
        return attackPower;
    }
    public String getType(){
        return "Vampire";
    }
}
class Werewolf implements Enemy{
    private int health = 80;
    private int speed = 6;
    private int attackPower = 25;

    public int getHealth(){
        return health;
    }
    public int getSpeed(){
        return speed;
    }
    public int getAttackPower(){
        return attackPower;
    }
    public String getType(){
        return "Werewolf";
    }
}

class EnemyFactory{
    public static Enemy createEnemy(String type)
    {
        switch(type){
            case "Easy":
                return new Zombie();
            case "Medium":
                return new Vampire();
            case "Hard":
                return new Werewolf();
            default:
                return null;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Difficulty level
        String difficulty = sc.next();

        // Call the user's factory method to create the enemy
        Enemy enemy = EnemyFactory.createEnemy(difficulty);


        if (enemy != null) {
            System.out.println("Enemy Type: " + enemy.getType());
            System.out.println("Health: " + enemy.getHealth());
            System.out.println("Speed: " + enemy.getSpeed() + ", Attack Power: " + enemy.getAttackPower());
        }
    }
}
