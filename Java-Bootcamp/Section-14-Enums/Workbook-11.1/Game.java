/**
 * GAME
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that illustrates Java's static keyword.
 * 
 * @packages
 *    Java Time (LocalDate)
 *    Constants (Position, Regulation)
 *    Java Time Format (DateTimeFormatter)
 */

import java.time.LocalDate;
import constants.Position;
import static constants.Regulation.*;
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
     * Prints out the information for the Game.
     */
    public void begin(Team home, Team away) {
        // String formattedDate = this.date.getDayOfMonth() + "/" + this.date.getMonthValue() + "/" + this.date.getYear();
        String formattedDate = this.date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println
        (
            "\n*****************************************************************************" +
            "\n - This matchup takes place at the " + this.arena + " arena on " + formattedDate + "." + 
            "\n - Tonight's game is between the " + home.getName() + " and the " + away.getName() + ".\n" +
            "\n - The starting lineup for the home team is: at point guard, " + home.getPlayer(Position.POINT_GUARD) + "; at shooting guard, " + home.getPlayer(Position.SHOOTING_GUARD) + "; at small forward, " + home.getPlayer(Position.SMALL_FORWARD) + "; at power forward, " + home.getPlayer(Position.POWER_FORWARD) + "; and at center, " + home.getPlayer(Position.CENTER) + ".\n" +
            "\n - The starting lineup for the visiting team is: at point guard, " + away.getPlayer(Position.POINT_GUARD) + "; at shooting guard, " + away.getPlayer(Position.SHOOTING_GUARD) + "; at small forward, " + away.getPlayer(Position.SMALL_FORWARD) + "; at power forward, " + away.getPlayer(Position.POWER_FORWARD) + "; and at center, " + away.getPlayer(Position.CENTER) + ".\n" +
            "\n - Let's give a warm round of applause for both teams as they take the court!" +
            "\n*****************************************************************************"

        );
    }

    /**
     * Function Name: details
     * @return (String)
     * 
     * Returns the details of the Regulation Game.
     */
    public String details() {
        return
            "\nArena: " + this.arena + 
            "\nDate: " + this.date.toString() +
            "\nCourt length (feet): " + COURT_LENGTH + 
            "\nRim height (feet): " + RIM_HEIGHT + 
            "\nDistance from three-point arc: " + THREE_POINT_DISTANCE + 
            "\nPoints awarded beyond the three-point arc: " + BEYOND_THREE_POINT_ARC +
            "\nPoints awarded inside the three-point arc: " + INSIDE_THREE_POINT_ARC +
            "\nPoints awarded from a free throw: " + FREE_THROW + 
            "\nLength of each quarter (minutes): " + QUARTER_LENGTH +
            "\nSeconds to attempt shot after gaining possession: " + POSSESSION_TIME;
    }
}