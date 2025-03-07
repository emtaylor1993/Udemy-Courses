/**
 * GAME
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents a Game object.
 * 
 * @packages
 *    Java Time (LocalDate)
 *    Java Time Format (DateTimeFormatter)
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Game {
    private String arena;
    private LocalDate date;

    /**
     * Function Name: Game
     * @param arena (String)
     * 
     * Constructor for the Game object.
     */
    public Game(String arena) {
        this.arena = arena;
        this.date = LocalDate.now();
    }

    /**
     * Function Name: begin
     * @param home (Team)
     * @param away (Team)
     * 
     * Initializes the Game.
     */
    public void begin(Team home, Team away) {
        System.out.println
        (
            "\n - This matchup takes place at the " + this.arena + " arena on " + this.date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "." + 
            "\n - Tonight's game is between the " + home.getName() + " and the " + away.getName() + ".\n" +
            "\n - The starting lineup for the home team is: at point guard, " + home.getPlayer("POINT_GUARD") + "; at shooting guard, " + home.getPlayer("SHOOTING_GUARD") + "; at small forward, " + home.getPlayer("SMALL_FORWARD") + "; at power forward, " + home.getPlayer("POWER_FORWARD") + "; and at center, " + home.getPlayer("CENTER") + ".\n" +
            "\n - The starting lineup for the visiting team is: at point guard, " + away.getPlayer("POINT_GUARD") + "; at shooting guard, " + away.getPlayer("SHOOTING_GUARD") + "; at small forward, " + away.getPlayer("SMALL_FORWARD") + "; at power forward, " + away.getPlayer("POWER_FORWARD") + "; and at center, " + away.getPlayer("CENTER") +".\n" +
            "\n - Let's give a warm round of applause for both teams as they take the court!"
        );
    }
}