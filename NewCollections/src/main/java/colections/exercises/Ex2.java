package colections.exercises;

import java.util.HashSet;
import java.util.Set;

/**
 * Is the result correct?
 *
 * @author gtrandafir
 *
 * the result was not correct , had to generate missing hashCode
 *
 */
public class Ex2 {

    public static void main(String[] args) {
        Set<Circle> circleList = new HashSet<Circle>();
        circleList.add(new Circle(10, 20, 5));
        System.out.println(circleList.contains(new Circle(10, 20, 5)));
    }
}

class Circle {

    private int xPos, yPos, radius;

    public Circle(int x, int y, int r) {
        xPos = x;
        yPos = y;
        radius = r;
    }

    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Circle other = (Circle) obj;
        if (radius != other.radius) {
            return false;
        }
        if (xPos != other.xPos) {
            return false;
        }
        if (yPos != other.yPos) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.xPos;
        hash = 83 * hash + this.yPos;
        hash = 83 * hash + this.radius;
        return hash;
    }

}
