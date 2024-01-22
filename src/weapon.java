 public class Weapon{
    protected String type;
    protected String name;


    Weapon(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class GameEntity {
    private String name;
    private int health;
    private int damage;

    public GameEntity(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}

class Boss extends GameEntity {
    private weapon weapon;

    public Boss(String name, int health, int damage, Weapon weapon) {
        super(name, health, damage);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}




class main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon("Sword", "Dark Blade");
        Boss boss = new Boss("Evil Boss", 1000, 50, bossWeapon);

        System.out.println("Boss Name: " + boss.getName());
        System.out.println("Boss Health: " + boss.getHealth());
        System.out.println("Boss Damage: " + boss.getDamage());
        System.out.println("Boss Weapon Type: " + boss.getWeapon().getType());
        System.out.println("Boss Weapon Name: " + boss.getWeapon().getName());
    }
}

