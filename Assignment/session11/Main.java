package assignment.session11;

public class Main {
    public static void main(String[] args) {
        GameCharacter yasur = new Warrior("yasua", 100, 100, 10);
        yasur.displayInfo();

        GameCharacter goblin = new GameCharacter("Goblin", 500, 10) {

            @Override
            void attack(GameCharacter target) {
                // TODO Auto-generated method stub
                target.takeDame(this.getAttackPower());
            }
        };
        goblin.displayInfo();

        GameCharacter mage = new Mage("Krixi", 400, 100, 300);
        mage.displayInfo();

        System.out.println("1. Yasoa -> Goblin");

    }
}

interface ISkill {
    void useUltimate(GameCharacter target);
}

abstract class GameCharacter {
    static int count = 1;
    private String name;
    private int hp;
    private int attackPower;

    public GameCharacter(String name, int hp, int attackPower) {
        super();
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        this.count++;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    abstract void attack (GameCharacter target);
    void takeDame(int amount){
        // giam hp khi bi danh
        this.hp-= amount;
    }
    void displayInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Name: %s | Hp: %d | AttackPower: %d", this.name, this.hp, this.attackPower);
    }

}


// cac nhan vat
class Warrior extends GameCharacter implements ISkill {
    int armor; // giasp
    public Warrior(String name, int hp, int attackPower, int armor) {
        super(name, hp, attackPower);
        this.armor = armor;
    }

    @Override
    void attack(GameCharacter target) {
        // TODO Auto-generated method stub
        target.takeDame(this.getAttackPower());
    }

    @Override
    public void useUltimate(GameCharacter target) {
        // TODO Auto-generated method stub
        System.out.println("ky nang dam ngan can: "+ this.getAttackPower() * 2);
        // cap nhap hp
        this.setHp(this.getHp() * 3 / 10);
        // takedame
        target.takeDame(this.getAttackPower() * 2);
    }

    @Override
    void takeDame(int amount) {
        // TODO Auto-generated method stub
        if(amount - this.armor > 0){
            super.setHp(amount - this.armor);
        }
    }

    @Override
    void displayInfo() {
        // TODO Auto-generated method stub
        super.displayInfo();
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Name: %s | Hp: %d | Attack: %d | Amor: %d", 
            this.getName(), this.getHp(), this.getAttackPower(), this.armor
        );
    }
}

class Mage extends GameCharacter implements ISkill{
    int mana;
    public Mage(String name, int hp, int attackPower, int mana) {
        super(name, hp, attackPower);
        this.mana = mana;
    }

    @Override
    void attack(GameCharacter target) {
        // TODO Auto-generated method stub
        if(mana >= 5){
            target.takeDame(this.getAttackPower());
            this.mana -= 5;
        }
        else{
            target.takeDame(Math.round(this.getAttackPower() * 1/2));
        }
    }
    @Override
    public void useUltimate(GameCharacter target) {
        // TODO Auto-generated method stub
        System.out.println("Hoa cau: " + target.getHp() * 0.3);
        this.mana -=50;
        target.takeDame(target.getHp()*3/10);
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Name: %s | Hp: %d | Attack: %d | Mana: %d",
                this.getName(), this.getHp(), this.getAttackPower(), this.mana);
    }   
}