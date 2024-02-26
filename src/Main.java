public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon(WeaponType.AXE, "MJOLNIR");
        Boss bossThor = new Boss();
        bossThor.setHealth(1000);
        bossThor.setDamage(150);
        bossThor.setWeapon(bossWeapon);
        System.out.println(bossThor.printInfo());
        Sceleton sceleton1 = new Sceleton();
        sceleton1.setHealth(500);
        sceleton1.setDamage(50);
        sceleton1.setWeapon(new Weapon(WeaponType.BOW, "SHORTBOW"));
        sceleton1.setNumberOfArrows(15);
        Sceleton sceleton2 = new Sceleton();
        sceleton2.setHealth(400);
        sceleton2.setDamage(70);
        sceleton2.setWeapon(new Weapon(WeaponType.BOW, "LONGBOW"));
        sceleton2.setNumberOfArrows(20);
        System.out.println("SCELETONS INFO:");
        System.out.println(sceleton1.printInfo());
        System.out.println(sceleton2.printInfo());
    }
}