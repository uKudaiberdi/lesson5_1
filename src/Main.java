public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(600);
        boss.setDamage(50);
        boss.setBossDefence("Physical");
        System.out.println("Boss health: " + boss.getHealth() + " Boss damage: " +
                boss.getDamage() + " Boss defence: " + boss.getBossDefence());
        Hero[] heroes = createHeroes();
        for (Hero hero : createHeroes()) {
            System.out.println("Health: " + hero.getHealth() + " Damage: " + hero.getHeroesDamage() + " attackType: " + hero.getHeroesAttackType());
        }
    }

    public static Hero[] createHeroes() {
        Hero Physical = new Hero(270, 20, "Physical");
        Hero Magical = new Hero(260, 15, "Magical");
        Hero Kinetic = new Hero(250, 10);
        return new Hero[]{Physical, Magical, Kinetic};
    }
}