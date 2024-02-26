public class Boss extends GameEntity {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String printInfo(){
        return ("BOSS\nHEALTH: " + this.getHealth() + " DAMAGE " + this.getDamage() +
                " WEAPON " + this.weapon.getWeaponName());
    }
}
