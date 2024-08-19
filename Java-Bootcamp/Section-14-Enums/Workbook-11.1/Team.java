/**
 * TEAM
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents the Team object.
 * 
 * @packages
 *    Java Utilities (HashMap, Map)
 *    Constants (Position)
 */

import java.util.HashMap;
import java.util.Map;
import constants.Position;

public class Team {
    private String name;
    private Map<Position, String> players;

    /**
     * Function Name: Team
     * @param name (String)
     * 
     * Constructor for the Team object.
     */
    public Team(String name) {
        this.name = name;
        this.players = new HashMap<>();
    }
    
    /**
     * Function Name: getName
     * @return (String)
     * 
     * Getter for the name attribute.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Function Name: setName
     * @param name (String)
     * 
     * Setter for the name attribute.
     */
    public void setName(String name) {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Name cannot be null/blank");
        this.name = name;
    }

    /**
     * Function Name: getPlayer
     * @param position (Position)
     * @return         (String)
     * 
     * Getter for the players attribute.
     */
    public String getPlayer(Position position) {
        return this.players.get(position);
    }

    /**
     * Function Name: setPlayer
     * @param position (Position)
     * @param player   (String)
     * 
     * Setter for the players attribute.
     */
    public void setPlayer(Position position, String player) {
        if (position == null)
            throw new IllegalArgumentException("Position cannot be null");
        this.players.put(position, player);
    }
}