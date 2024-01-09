
public class GameMaster {

    public class Character{
        private String charClass;
        private int charLevel;
        private int charPoints;

        public String getCharacterClass() {
            return charClass;
        }

        public void setCharClass(String charClass) {
            this.charClass = charClass;
        }

        public int getLevel() {
            return charLevel;
        }

        public void setCharLevel(int charLevel) {
            this.charLevel = charLevel;
        }

        public int getHitPoints() {
            return charPoints;
        }

        public void setCharPoints(int charPoints) {
            this.charPoints = charPoints;
        }
    }

    public class Destination {
        private String name;
        private int inhabitants;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getInhabitants() {
            return inhabitants;
        }

        public void setInhabitants(int inhabitants) {
            this.inhabitants = inhabitants;
        }
    }

    public enum TravelMethod{
        WALKING("by walking"),
        HORSEBACK("on horseback");

        private String abrev;

        private TravelMethod(String abrev){
            this.abrev = abrev;
        }

        public String getAbrev() {
            return abrev;
        }
    }


    public String describe(Character character){
        return String.format("You're a level %d %s with %d hit points.", character.getLevel(), character.getCharacterClass(), character.getHitPoints());
    }

    public String describe(Destination dest){
        return String.format("You've arrived at %s, which has %d inhabitants.", dest.getName(), dest.getInhabitants());
    }

    public String describe(TravelMethod tm){
        return String.format("You're traveling to your destination %s.", tm.getAbrev());
    }

    public String describe(Character character, Destination dest, TravelMethod tm){
        return String.format("%s You're traveling to your destination %s. You've arrived at %s, which has %d inhabitants.",
                describe(character),
                tm.getAbrev(),
                dest.getName(), dest.getInhabitants()
        );
    }

    public String describe(Character character, Destination dest){
        return String.format("%s You're traveling to your destination by walking. You've arrived at %s, which has %d inhabitants.",
                describe(character),
                dest.getName(), dest.getInhabitants()
        );
    }

    public static void main(String[] args) {
        //TASK 1
        Character character = new GameMaster().new Character();
        character.setCharClass("Wizard");
        character.setCharLevel(4);
        character.setCharPoints(28);
        System.out.println(new GameMaster().describe(character));

        //TASK2
        Destination destination = new GameMaster().new Destination();
        destination.setName("Muros");
        destination.setInhabitants(732);
        System.out.println(new GameMaster().describe(destination));

        //TASK3
        System.out.println(new GameMaster().describe(TravelMethod.HORSEBACK));

        //TASK4
        System.out.println(new GameMaster().describe(character, destination, TravelMethod.WALKING));

        //TASK5
        System.out.println(new GameMaster().describe(character, destination));
    }

}