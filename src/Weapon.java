public class Weapon {
    private WeaponType weaponType;
    private String weaponName;

    public Weapon(WeaponType weaponType, String weaponName) {
        this.weaponType = weaponType;
        this.weaponName = weaponName;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public String getWeaponName() {
        return weaponName;
    }
}
