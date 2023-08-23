public class Medic extends Hero {

    @Override
    public void applySuperAbility() {
        super.applySuperAbility();
        System.out.println("травматология");
    }

    public int healPoints = 50;


    public void increaseExperience() {
        System.out.println("giga chat = " +
                (this.healPoints + (this.healPoints * 10) / 100) + " amount ");
    }


}