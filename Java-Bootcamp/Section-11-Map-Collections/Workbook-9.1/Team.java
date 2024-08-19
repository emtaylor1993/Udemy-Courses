/**
 * TEAM
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents a Team object.
 * 
 * @packages
 *    Java Utilities (HashMap, Map)
 */

import java.util.HashMap;
import java.util.Map;

public class Team {
    private String name;
    private Map<String, String> players;

    /**
     * Function Name: Team
     * @param name
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
        this.name = name;
    }

    /**
     * Function Name: getPlayer
     * @param position (String)
     * @return         (String)
     * 
     * Getter for the player attribute.
     */
    public String getPlayer(String position) {
        return this.players.get(position);
    }

    /**
     * Function Name: setPlayer
     * @param position (String)
     * @param player   (String)
     * 
     * Setter for the player attribute.
     */
    public void setPlayer(String position, String player) {
        this.players.put(position, player);
    }        
}
