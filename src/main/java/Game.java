public class Game {
    private String name;
    private int numPlayers;
    
public void getName(String name){
    this.name = name;
    
}
public int getnumPlayers(int numPlayers){
    this.numPlayers = numPlayers;
    return numPlayers;
}
public void setName(String name){
    this.name = name;
}
public void setPlayers(int players){
    this.numPlayers = players;
}
public Game(String name){
    this.name = name;
    this.numPlayers = 2;
}
public Game(String name, int numPlayers){
    this.name = name;
    this.numPlayers = numPlayers;
}
public Game(){
    
}
public void playGame(String winner, double winnerScore, boolean isAnotherMatch){
    System.out.println(winner + "won the game badminton with score " + winnerScore +".  This game had " + numPlayers + " players." );
    System.out.println();
    if(isAnotherMatch = true){
        System.out.println("There is yet another match");
    }
    else{
        System.out.println("There is no more match");
    }
}
public void playGame(String winner, double winnerScore){
    
}
public void playGame(String winner){
    
}
}
