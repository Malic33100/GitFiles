import java.util.*;

/*
Create a class named BaseballGame that contains data fields 
for two team names and scores for each team in each of nine
 innings. Create get and set methods for each field; the get 
 and set methods for the scores should require a parameter 
 that indicates which inning’s score is being assigned or
  retrieved. Do not allow an inning score to be set if all
   the previous innings have not already been set. If a user 
   attempts to set an inning that is not yet available, issue
    an error message. Also include a method that determines
     the winner of the game after scores for the last inning
      have been entered. (For this exercise, assume that a
       game might end in a tie.) Create two subclasses from
        BaseballGame: HighSchoolBaseballGame and LittleLeagueBaseballGame.
         High school baseball games have seven innings, and
          Little League games have six innings. Ensure that 
          scores for later innings cannot be accessed for objects 
          of these subtypes. Write three applications that
           each instantiate one of the object types and 
           demonstrate their methods. Save the files as 
           BaseballGame.java, HighSchoolBaseballGame.java,
            LittleLeagueBaseballGame.java, DemoBaseballGame.java, 
            DemoHSBaseballGame.java, and DemoLLBaseballGame.java.
*/

public class BaseballGame {

    public static void main(String[] args){
        String teamA = "Tony tigers";
        String teamB = "Mighty mice";
        int min = 1;
        int max = 10;

        int Ascores[] = new int[9];
        int Bscores[] = new int[9];

        for(var i = 0; i < Ascores.length; i++){
            Ascores[i] = Math.random() *((max-min)+min);
            Bscores[i] = Math.random() *((max-min)+min);

        }

    }
}

public String GetTeam1Name() {
    return teamA;
}

public String GetTeam2Name() {
    return teamB;
}

public void SetName(String newName){
    this.name = newName;
}

public void SetName2(String newName){
    this.name = newName;
}

public int getAscores() {
    return Ascores[];
    Ascore = Ascores[i];
}

public int getBscores() {
    return Bscores[];
    Bscore = Bscores[i];
}

public void SetA(int Ascore){
    this.Ascores[i] = Ascore;
}

public void SetB(int Bscore){
    this.Bscores[i] = Bscore;
}

BaseballGame HighSchoolBaseballGame = new BaseballGame();
HighSchoolBaseballGame.getAscores();
HighSchoolBaseballGame.getBscores();
HighSchoolBaseballGame.GetTeam1Name();
HighSchoolBaseballGame.GetTeam2Name();

HighSchoolBaseballGame.setA(7);
HighSchoolBaseballGame.setB(7);
HighSchoolBaseballGame.SetName(String sharks);
HighSchoolBaseballGame.SetName2(String lion);


BaseballGame LittleLeagueBaseballGame = new BaseballGame();
HighSchoolBaseballGame.getAscores();
HighSchoolBaseballGame.getBscores();
HighSchoolBaseballGame.GetTeam1Name();
HighSchoolBaseballGame.GetTeam2Name();

LittleLeagueBaseballGame.setA(5);
LittleLeagueBaseballGame.setB(5);
LittleLeagueBaseballGame.setName(String cheetahs);
LittleLeagueBaseballGame.SetName2(String eagles);
