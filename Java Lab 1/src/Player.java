public class Player {
    private String playerName;
    private int playedMatch;
    private int internationalCaps;
    private double playerHeight;
    private int numOfGoals;
    //Create Several constructors that will allow you to construct a Player object with no arguments
    public Player(){
    }
    //Create Several constructors that will allow you to construct a Player object with 2 arguments
    public Player(String playerName, int playedMatch){
        this.playerName = playerName;
        this.playedMatch = playedMatch;
    }
    //Create Several constructors that will allow you to construct a Player object with 3 arguments
    public Player(String playerName, int playedMatch, int internationalCaps){
        this.playerName = playerName;
        this.playedMatch = playedMatch;
        this.internationalCaps = internationalCaps;
    }
    //Create Several constructors that will allow you to construct a Player object with 5 arguments
    public Player(String playerName, int playedMatch, int internationalCaps,double playerHeight, int numOfGoals ){
        this.playerName = playerName;
        this.playedMatch = playedMatch;
        this.internationalCaps = internationalCaps;
        this.playerHeight = playerHeight;
        this.numOfGoals = numOfGoals;
    }
    //A method that will print all the Player Data on the console
    public void playerData(String playerName, int playedMatch, int internationalCaps,double playerHeight, int numOfGoals){
        this.playerName = playerName;
        this.playedMatch = playedMatch;
        this.internationalCaps = internationalCaps;
        this.playerHeight = playerHeight;
        this.numOfGoals = numOfGoals;
        System.out.println("Player's name: "+playerName+"\nNumber of matches played: "+playedMatch+
                "\nNumber of international Caps: "+internationalCaps+"\nPlayer's height: "+playerHeight+
                "\nNumber of scored goals and assists given: "+numOfGoals);
    }
    //A method that will calculate and print the Player's Name and Goals&Assists per Match
    public void getCalculation(String playerName, int numOfGoals, int playedMatch) {
        this.playerName = playerName;
        double getCalculation = numOfGoals / playedMatch;
        System.out.println("Goals&Assists per Match is "+getCalculation);
    }
    //Generate variables of class Player to Setter and Getter
    public void Calculation(String playerName, int numOfGoals){
        this.playerName = playerName;
    }
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public int getPlayedMatch() {
        return playedMatch;
    }

    public void setPlayedMatch(int playedMatch) {
        this.playedMatch = playedMatch;
    }
    public int getInternationalCaps() {
        return internationalCaps;
    }
    public void setInternationalCaps(int internationalCaps) {
        this.internationalCaps = internationalCaps;
    }
    public double getPlayerHeight() {
        return playerHeight;
    }

    public void setPlayerHeight(double playerHeight) {
        this.playerHeight = playerHeight;
    }
    public int getNumOfGoals() {
        return numOfGoals;
    }
    public void setNumOfGoals(int numOfGoals) {
        this.numOfGoals = numOfGoals;
    }
    //create one setter that would allow you to set all the values of the instance variables at once
    public void setAllValues(String playerName, int playedMatch, int internationalCaps,double playerHeight, int numOfGoals){
        this.playerName = playerName;
        this.playedMatch = playedMatch;
        this.internationalCaps = internationalCaps;
        this.playerHeight = playerHeight;
        this.numOfGoals = numOfGoals;
    }
}
