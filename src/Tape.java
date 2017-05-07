
import java.util.ArrayList;

/**
 * @author Liam Rahav
 */
public class Tape<T> {
    private ArrayList<T> tape;
    private int currentPosition;

    public Tape() {
        tape = new ArrayList<T>();
        currentPosition = 0;
    }

    public void write(T w) {
        try {
            tape.set(currentPosition, w);
        } catch (IndexOutOfBoundsException e) {
            tape.add(w);
        }
    }

    public T read() {
        try {
            return tape.get(currentPosition);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    public void moveLeft() {
        if (currentPosition == 0) {
            tape.add(0, null);
        } else {
            currentPosition -= 1;
        }
    }

    public void moveRight() {
        currentPosition += 1;
    }

    public int countOnes() {
        int count = 0;
        for (T t : tape) {
            if (t instanceof Integer) {
                if ((Integer) t == 1) count++;
            }
        }

        return count;
    }

    @Override
    public String toString() {
        return tape.toString();
    }
}
