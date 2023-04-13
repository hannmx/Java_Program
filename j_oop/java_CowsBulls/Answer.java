package j_oop.java_CowsBulls;

public class Answer {
    private String userInput;
    private Integer cow;
    private Integer bull;

    public String getUserInput() {
        return this.userInput;
    }

    public Integer getCow() {
        return this.cow;
    }

    public Integer getBull() {
        return this.bull;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public void setCow(Integer cow) {
        this.cow = cow;
    }

    public void setBull(Integer bull) {
        this.bull = bull;
    }

    public Answer(String userInput, Integer cow, Integer bull) {
        this.userInput = userInput;
        this.cow = cow;
        this.bull = bull;
    }

    public Answer(){
    }

    @Override
    public String toString(){
        return "Answer(userInput = " + this.getUserInput() + ", cow = " + this.getCow() + ", bulls = " + this.getBull() + ")";
    }
}
