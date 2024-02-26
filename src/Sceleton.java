public class Sceleton extends Boss{
    private int numberOfArrows;
    static int counter = 0;

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
        counter++;
    }

    public int getNumberOfArrows() {
        return numberOfArrows;
    }
    public String printInfo(){
        return ("SCELETON\nHEALTH: " + this.getHealth() + " DAMAGE: " + this.getDamage() +
                " WEAPON: " + this.getWeapon().getWeaponName() + " NUMBER OF ARROWS: " + this.getNumberOfArrows());
    }
}


