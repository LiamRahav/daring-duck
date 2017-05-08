import java.util.HashMap;
import java.util.Objects;

/**
 * @author Liam Rahav
 */
public class TuringMachine {
    private class Transition {
        String goToState;
        Integer write;
        Direction direction;

        public Transition(String goToState, Integer write, Direction direction) {
            this.goToState = goToState;
            this.write = write;
            this.direction = direction;
        }
    }

    private HashMap<String, HashMap<Integer, Transition>> states;
    private String initState;
    private String acceptState;

    public TuringMachine() {
        states = new HashMap<>();
        initState = null;
        acceptState = null;
    }

    public void addTransition(String state, Integer input, String goToSate, Integer write, Direction direction) {
        if (states.get(state) == null) {
            HashMap<Integer, Transition> card = new HashMap<>();
            card.put(input, new Transition(goToSate, write, direction));
            states.put(state, card);
        } else {
            states.get(state).put(input, new Transition(goToSate, write, direction));
        }
    }

    public void setInitState(String initState) {
        this.initState = initState;
    }

    public void setAcceptState(String acceptState) {
        this.acceptState = acceptState;
    }

    public Tape run(Tape<Integer> tape) {
        String currentState = initState;

        int count = 0;
        while(!Objects.equals(currentState, acceptState)) {
            if (++count % 1000 == 0) { System.out.println(currentState); count = 0; }
            HashMap<Integer, Transition> cards = states.get(currentState);
            Transition card = cards.get(tape.read());
            tape.write(card.write);

            if (card.direction == Direction.RIGHT) tape.moveRight();
            else if (card.direction == Direction.LEFT) tape.moveLeft();

            currentState = card.goToState;
        }

        return tape;
    }
}