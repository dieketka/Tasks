package species;
import java.util.Objects;


public class Oak extends species.Trees implements Resizable {
    private int a;
    private int b;
    private double c;

    public Oak(String leavesColor1, String fruits1) {
        super(leavesColor1, fruits1);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if (a > b) {
            this.a = a;
        }
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        if (c > 0) {
            this.c = c;
        }
    }

    public Oak() {
        super("Light-green", "ACORN");
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public Oak(String leavesColor2, String fruits, int a, int b, double c) {
        super(leavesColor2, fruits);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getAge() {
        return a - b;
    }

    public double getHeight() {
        return c;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oak oak = (Oak) o;
        return a == oak.a && b == oak.b;
    }

    public int hashCode() {
        return 29 * a + 29 * b;
    }

    public String toString() {
        return "Oak´s" + " Age: " + (a-b) + "|" +" Height: " + c + "m" + "|" + " Fruits: " + fruits + "|" + " Leaves´ color: " + leavesColor;
    }


    public void resize(boolean increase, int multiplier) {
        if (increase) {
            a = a * multiplier;
            b = b * multiplier;

        } else {
            a = a / multiplier;
            b = b / multiplier;
        }
    }
}