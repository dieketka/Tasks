package species;

public abstract class Trees {
    public abstract double getHeight();
    public abstract int getAge();
    String leavesColor;
    String fruits;
    public Trees(String leavesColor1, String fruits1) {
        this.leavesColor = leavesColor1;
        this.fruits = fruits1;
    }
}
