/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Objects;

/**
 *
 * @author malinda
 */
public class Card
{
  private String suite;
  private String value;

    /**
     * @return the suite
     */
    public String getSuite() {
        return suite;
    }

    /**
     * @param suite the suite to set
     */
    public void setSuite(String suite) {
        this.suite = suite;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }
  
}
