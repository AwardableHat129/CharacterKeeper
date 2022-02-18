import java.io.Serializable;
import java.lang.Math;

public class Character implements Serializable{
    
    //Attributes
        //Main Attributes
    private String characterName;
    private String characterClass;
    private String characterSubclass;

        //Ability Scores
    private Integer strength = 10;
    private Integer dexterity = 10;
    private Integer constitution = 10;
    private Integer intelligence = 10;
    private Integer wisdom = 10;
    private Integer charisma = 10;

        //Proficiencies (Utilizes the Proficiency enumeration)
    private Proficiency acrobatics = Proficiency.NONE;
    private Proficiency animalHandling = Proficiency.NONE;
    private Proficiency arcana = Proficiency.NONE;
    private Proficiency athletics = Proficiency.NONE;
    private Proficiency deception = Proficiency.NONE;
    private Proficiency history = Proficiency.NONE;
    private Proficiency insight = Proficiency.NONE;
    private Proficiency intimidation = Proficiency.NONE;
    private Proficiency investigation = Proficiency.NONE;
    private Proficiency medicine = Proficiency.NONE;
    private Proficiency nature = Proficiency.NONE;
    private Proficiency perception = Proficiency.NONE;
    private Proficiency performance = Proficiency.NONE;
    private Proficiency persuasion = Proficiency.NONE;
    private Proficiency religion = Proficiency.NONE;
    private Proficiency sleightOfHand = Proficiency.NONE;
    private Proficiency stealth = Proficiency.NONE;
    private Proficiency survival = Proficiency.NONE;

    //Constructors
    public Character(String characterName, String characterClass, String characterSubclass) {

        this.characterName = characterName;
        this.characterClass = characterClass;
        this.characterSubclass = characterSubclass;
        
    }


    //Methods
        //Main Attributes
    public String getCharacterName(){
        return characterName;
    }

    public void setCharacterName(String name){
        this.characterName = name;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public String getCharacterSubclass() {
        return characterSubclass;
    }

    public void setCharacterSubclass(String characterSubclass) {
        this.characterSubclass = characterSubclass;
    }
    
        //Ability Scores
            //Strength
    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {        
        if(strength >= 0) this.strength = strength;
    }
    
    public int getStrengthModifier(){
        return (int) (Math.floor(getStrength() / 2) - 5);     
    }

            //Dexterity
    public Integer getDexterity() {
        return dexterity;
    }

    public void setDexterity(Integer dexterity) {
        if(dexterity >= 0) this.dexterity = dexterity;
    }

    public int getDexterityModifier() {
        return (int) (Math.floor(getDexterity() / 2) - 5);
    }

            //Constitution
    public Integer getConstitution() {
        return constitution;
    }

    public void setConstitution(Integer constitution) {
        if(constitution >= 0) this.constitution = constitution;
    }

    public int getConstitutionModifier() {
        return (int) (Math.floor(getConstitution() / 2) - 5);
    }

            //Intelligence
    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        if(intelligence >= 0) this.intelligence = intelligence;
    }

    public int getIntelligenceModifier() {
        return (int) (Math.floor(getIntelligence() / 2) - 5);
    }

            //Wisdom
    public Integer getWisdom() {
        return wisdom;
    }

    public void setWisdom(Integer wisdom) {
        if(wisdom >= 0) this.wisdom = wisdom;
    }

    public int getWisdomModifier() {
        return (int) (Math.floor(getWisdom() / 2) - 5);
    }

            //Charisma
    public Integer getCharisma() {
        return charisma;
    }

    public void setCharisma(Integer charisma) {
        if(charisma >= 0) this.charisma = charisma;
    }

    public int getCharismaModifier() {
        return (int) (Math.floor(getCharisma() / 2) - 5);
    }

        //Proficiencies
    public Proficiency getAcrobatics() {
        return acrobatics;
    }

    public void setAcrobatics(Proficiency acrobatics) {
        this.acrobatics = acrobatics;
    }

    public Proficiency getAnimalHandling() {
        return animalHandling;
    }

    public void setAnimalHandling(Proficiency animalHandling) {
        this.animalHandling = animalHandling;
    }
   
    public Proficiency getArcana() {
        return arcana;
    }

    public void setArcana(Proficiency arcana) {
        this.arcana = arcana;
    }

    public Proficiency getAthletics() {
        return athletics;
    }

    public void setAthletics(Proficiency athletics) {
        this.athletics = athletics;
    }

    public Proficiency getDeception() {
        return deception;
    }

    public void setDeception(Proficiency deception) {
        this.deception = deception;
    }
    
    public Proficiency getHistory() {
        return history;
    }

    public void setHistory(Proficiency history) {
        this.history = history;
    }

    public Proficiency getInsight() {
        return insight;
    }

    public void setInsight(Proficiency insight) {
        this.insight = insight;
    }

    public Proficiency getIntimidation() {
        return intimidation;
    }

    public void setIntimidation(Proficiency intimidation) {
        this.intimidation = intimidation;
    }

    public Proficiency getInvestigation() {
        return investigation;
    }

    public void setInvestigation(Proficiency investigation) {
        this.investigation = investigation;
    }

    public Proficiency getMedicine() {
        return medicine;
    }

    public void setMedicine(Proficiency medicine) {
        this.medicine = medicine;
    }

    public Proficiency getNature() {
        return nature;
    }

    public void setNature(Proficiency nature) {
        this.nature = nature;
    }

    public Proficiency getPerception() {
        return perception;
    }

    public void setPerception(Proficiency perception) {
        this.perception = perception;
    }

    public Proficiency getPerformance() {
        return performance;
    }

    public void setPerformance(Proficiency performance) {
        this.performance = performance;
    }

    public Proficiency getPersuasion() {
        return persuasion;
    }

    public void setPersuasion(Proficiency persuasion) {
        this.persuasion = persuasion;
    }

    public Proficiency getReligion() {
        return religion;
    }

    public void setReligion(Proficiency religion) {
        this.religion = religion;
    }

    public Proficiency getSleightOfHand() {
        return sleightOfHand;
    }

    public void setSleightOfHand(Proficiency sleightOfHand) {
        this.sleightOfHand = sleightOfHand;
    }

    public Proficiency getStealth() {
        return stealth;
    }

    public void setStealth(Proficiency stealth) {
        this.stealth = stealth;
    }

    public Proficiency getSurvival() {
        return survival;
    }

    public void setSurvival(Proficiency survival) {
        this.survival = survival;
    }


}
