import java.io.Serializable;

//This enumeration keeps track of the three possible states of a skill
//proficiency: None, proficient and expert.

public enum Proficiency implements Serializable{
    
    NONE("No proficiency"), PROFICIENCY("Proficiency"), EXPERTISE("Expertise");

    private final String proficiencyStatus;

    private Proficiency(String proficiencyStatus)
    {
        this.proficiencyStatus = proficiencyStatus;
    }

    public String toString()
    {
        return this.proficiencyStatus;
    }
}
