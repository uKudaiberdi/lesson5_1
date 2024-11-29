public class Hero {

    private int health;
    private int heroesDamage;
    private String heroesAttackType;

    public Hero(int health, int heroesDamage, String heroesAttackType) {
        this.health = health;
        this.heroesDamage = heroesDamage;
        this.heroesAttackType = heroesAttackType;
    }

    public Hero(int health, int heroesDamage) {
        this.health = health;
        this.heroesDamage = heroesDamage;
    }

    public int getHealth() {
        return health;
    }

    public int getHeroesDamage() {
        return heroesDamage;
    }

    public String getHeroesAttackType() {
        return heroesAttackType;
    }
}
