/**
 * @author Liam Rahav
 */
public class Main {
    public static void main(String[] args) {
        TuringMachine turingMachine = new TuringMachine();

        turingMachine.setInitState("qinit");
        turingMachine.setAcceptState("qfin");

        // region copy0
        turingMachine.addTransition("qinit", 1, "qinit", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit", -1, "qinit", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit", null, "copy_from_right_to_left", null, Direction.LEFT);

        turingMachine.addTransition("copy_from_right_to_left", 1, "copying_1_to_the_right", -1, Direction.RIGHT);
        turingMachine.addTransition("copy_from_right_to_left", -1, "copy_from_right_to_left", -1, Direction.LEFT);
        turingMachine.addTransition("copy_from_right_to_left", null, "replace_with_1s", null, Direction.RIGHT);

        turingMachine.addTransition("copying_1_to_the_right", 1, "copying_1_to_the_right", 1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right", -1, "copying_1_to_the_right", -1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right", null, "copy_from_right_to_left", -1, Direction.LEFT);

        turingMachine.addTransition("replace_with_1s", -1, "replace_with_1s", 1, Direction.RIGHT);
        turingMachine.addTransition("replace_with_1s", 1, "replace_with_1s", 1, Direction.LEFT);
        turingMachine.addTransition("replace_with_1s", null, "qrestart", 1, null);

        turingMachine.addTransition("qrestart", 1, "qrestart", 1, Direction.LEFT);
        turingMachine.addTransition("qrestart", null, "qinit1", 1, null);
        // endregion

        // region copy1
        turingMachine.addTransition("qinit1", 1, "qinit1", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit1", -1, "qinit1", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit1", null, "copy_from_right_to_left1", null, Direction.LEFT);

        turingMachine.addTransition("copy_from_right_to_left1", 1, "copying_1_to_the_right1", -1, Direction.RIGHT);
        turingMachine.addTransition("copy_from_right_to_left1", -1, "copy_from_right_to_left1", -1, Direction.LEFT);
        turingMachine.addTransition("copy_from_right_to_left1", null, "replace_with_1s1", null, Direction.RIGHT);

        turingMachine.addTransition("copying_1_to_the_right1", 1, "copying_1_to_the_right1", 1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right1", -1, "copying_1_to_the_right1", -1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right1", null, "copy_from_right_to_left1", -1, Direction.LEFT);

        turingMachine.addTransition("replace_with_1s1", -1, "replace_with_1s1", 1, Direction.RIGHT);
        turingMachine.addTransition("replace_with_1s1", 1, "replace_with_1s1", 1, Direction.LEFT);
        turingMachine.addTransition("replace_with_1s1", null, "qrestart1", 1, null);

        turingMachine.addTransition("qrestart1", 1, "qrestart1", 1, Direction.LEFT);
        turingMachine.addTransition("qrestart1", null, "qinit2", 1, null);
        // endregion

        // region copy2
        turingMachine.addTransition("qinit2", 1, "qinit2", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit2", -1, "qinit2", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit2", null, "copy_from_right_to_left2", null, Direction.LEFT);

        turingMachine.addTransition("copy_from_right_to_left2", 1, "copying_1_to_the_right2", -1, Direction.RIGHT);
        turingMachine.addTransition("copy_from_right_to_left2", -1, "copy_from_right_to_left2", -1, Direction.LEFT);
        turingMachine.addTransition("copy_from_right_to_left2", null, "replace_with_1s2", null, Direction.RIGHT);

        turingMachine.addTransition("copying_1_to_the_right2", 1, "copying_1_to_the_right2", 1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right2", -1, "copying_1_to_the_right2", -1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right2", null, "copy_from_right_to_left2", -1, Direction.LEFT);

        turingMachine.addTransition("replace_with_1s2", -1, "replace_with_1s2", 1, Direction.RIGHT);
        turingMachine.addTransition("replace_with_1s2", 1, "replace_with_1s2", 1, Direction.LEFT);
        turingMachine.addTransition("replace_with_1s2", null, "qrestart2", 1, null);

        turingMachine.addTransition("qrestart2", 1, "qrestart2", 1, Direction.LEFT);
        turingMachine.addTransition("qrestart2", null, "qinit3", 1, null);
        // endregion

        // region copy3
        turingMachine.addTransition("qinit3", 1, "qinit3", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit3", -1, "qinit3", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit3", null, "copy_from_right_to_left3", null, Direction.LEFT);

        turingMachine.addTransition("copy_from_right_to_left3", 1, "copying_1_to_the_right3", -1, Direction.RIGHT);
        turingMachine.addTransition("copy_from_right_to_left3", -1, "copy_from_right_to_left3", -1, Direction.LEFT);
        turingMachine.addTransition("copy_from_right_to_left3", null, "replace_with_1s3", null, Direction.RIGHT);

        turingMachine.addTransition("copying_1_to_the_right3", 1, "copying_1_to_the_right3", 1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right3", -1, "copying_1_to_the_right3", -1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right3", null, "copy_from_right_to_left3", -1, Direction.LEFT);

        turingMachine.addTransition("replace_with_1s3", -1, "replace_with_1s3", 1, Direction.RIGHT);
        turingMachine.addTransition("replace_with_1s3", 1, "replace_with_1s3", 1, Direction.LEFT);
        turingMachine.addTransition("replace_with_1s3", null, "qrestart3", 1, null);

        turingMachine.addTransition("qrestart3", 1, "qrestart3", 1, Direction.LEFT);
        turingMachine.addTransition("qrestart3", null, "qinit4", 1, null);
        // endregion

        // region copy4
        turingMachine.addTransition("qinit4", 1, "qinit4", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit4", -1, "qinit4", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit4", null, "copy_from_right_to_left4", null, Direction.LEFT);

        turingMachine.addTransition("copy_from_right_to_left4", 1, "copying_1_to_the_right4", -1, Direction.RIGHT);
        turingMachine.addTransition("copy_from_right_to_left4", -1, "copy_from_right_to_left4", -1, Direction.LEFT);
        turingMachine.addTransition("copy_from_right_to_left4", null, "replace_with_1s4", null, Direction.RIGHT);

        turingMachine.addTransition("copying_1_to_the_right4", 1, "copying_1_to_the_right4", 1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right4", -1, "copying_1_to_the_right4", -1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right4", null, "copy_from_right_to_left4", -1, Direction.LEFT);

        turingMachine.addTransition("replace_with_1s4", -1, "replace_with_1s4", 1, Direction.RIGHT);
        turingMachine.addTransition("replace_with_1s4", 1, "replace_with_1s4", 1, Direction.LEFT);
        turingMachine.addTransition("replace_with_1s4", null, "qrestart4", 1, null);

        turingMachine.addTransition("qrestart4", 1, "qrestart4", 1, Direction.LEFT);
        turingMachine.addTransition("qrestart4", null, "qinit5", 1, null);
        // endregion

        // region copy5
        turingMachine.addTransition("qinit5", 1, "qinit5", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit5", -1, "qinit5", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit5", null, "copy_from_right_to_left5", null, Direction.LEFT);

        turingMachine.addTransition("copy_from_right_to_left5", 1, "copying_1_to_the_right5", -1, Direction.RIGHT);
        turingMachine.addTransition("copy_from_right_to_left5", -1, "copy_from_right_to_left5", -1, Direction.LEFT);
        turingMachine.addTransition("copy_from_right_to_left5", null, "replace_with_1s5", null, Direction.RIGHT);

        turingMachine.addTransition("copying_1_to_the_right5", 1, "copying_1_to_the_right5", 1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right5", -1, "copying_1_to_the_right5", -1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right5", null, "copy_from_right_to_left5", -1, Direction.LEFT);

        turingMachine.addTransition("replace_with_1s5", -1, "replace_with_1s5", 1, Direction.RIGHT);
        turingMachine.addTransition("replace_with_1s5", 1, "replace_with_1s5", 1, Direction.LEFT);
        turingMachine.addTransition("replace_with_1s5", null, "qrestart5", 1, null);

        turingMachine.addTransition("qrestart5", 1, "qrestart5", 1, Direction.LEFT);
        turingMachine.addTransition("qrestart5", null, "qinit6", 1, null);
        //endregion

        // region copy6
        turingMachine.addTransition("qinit6", 1, "qinit6", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit6", -1, "qinit6", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit6", null, "copy_from_right_to_left6", null, Direction.LEFT);

        turingMachine.addTransition("copy_from_right_to_left6", 1, "copying_1_to_the_right6", -1, Direction.RIGHT);
        turingMachine.addTransition("copy_from_right_to_left6", -1, "copy_from_right_to_left6", -1, Direction.LEFT);
        turingMachine.addTransition("copy_from_right_to_left6", null, "replace_with_1s6", null, Direction.RIGHT);

        turingMachine.addTransition("copying_1_to_the_right6", 1, "copying_1_to_the_right6", 1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right6", -1, "copying_1_to_the_right6", -1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right6", null, "copy_from_right_to_left6", -1, Direction.LEFT);

        turingMachine.addTransition("replace_with_1s6", -1, "replace_with_1s6", 1, Direction.RIGHT);
        turingMachine.addTransition("replace_with_1s6", 1, "replace_with_1s6", 1, Direction.LEFT);
        turingMachine.addTransition("replace_with_1s6", null, "qrestart6", 1, null);

        turingMachine.addTransition("qrestart6", 1, "qrestart6", 1, Direction.LEFT);
        turingMachine.addTransition("qrestart6", null, "qinit7", 1, null);
        // endregion

        // region copy7
        turingMachine.addTransition("qinit7", 1, "qinit7", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit7", -1, "qinit7", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit7", null, "copy_from_right_to_left7", null, Direction.LEFT);

        turingMachine.addTransition("copy_from_right_to_left7", 1, "copying_1_to_the_right7", -1, Direction.RIGHT);
        turingMachine.addTransition("copy_from_right_to_left7", -1, "copy_from_right_to_left7", -1, Direction.LEFT);
        turingMachine.addTransition("copy_from_right_to_left7", null, "replace_with_1s7", null, Direction.RIGHT);

        turingMachine.addTransition("copying_1_to_the_right7", 1, "copying_1_to_the_right7", 1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right7", -1, "copying_1_to_the_right7", -1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right7", null, "copy_from_right_to_left7", -1, Direction.LEFT);

        turingMachine.addTransition("replace_with_1s7", -1, "replace_with_1s7", 1, Direction.RIGHT);
        turingMachine.addTransition("replace_with_1s7", 1, "replace_with_1s7", 1, Direction.LEFT);
        turingMachine.addTransition("replace_with_1s7", null, "qrestart7", 1, null);

        turingMachine.addTransition("qrestart7", 1, "qrestart7", 1, Direction.LEFT);
        turingMachine.addTransition("qrestart7", null, "qinit8", 1, null);
        // endregion

        // region copy8
        turingMachine.addTransition("qinit8", 1, "qinit8", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit8", -1, "qinit8", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit8", null, "copy_from_right_to_left8", null, Direction.LEFT);

        turingMachine.addTransition("copy_from_right_to_left8", 1, "copying_1_to_the_right8", -1, Direction.RIGHT);
        turingMachine.addTransition("copy_from_right_to_left8", -1, "copy_from_right_to_left8", -1, Direction.LEFT);
        turingMachine.addTransition("copy_from_right_to_left8", null, "replace_with_1s8", null, Direction.RIGHT);

        turingMachine.addTransition("copying_1_to_the_right8", 1, "copying_1_to_the_right8", 1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right8", -1, "copying_1_to_the_right8", -1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right8", null, "copy_from_right_to_left8", -1, Direction.LEFT);

        turingMachine.addTransition("replace_with_1s8", -1, "replace_with_1s8", 1, Direction.RIGHT);
        turingMachine.addTransition("replace_with_1s8", 1, "replace_with_1s8", 1, Direction.LEFT);
        turingMachine.addTransition("replace_with_1s8", null, "qrestart8", 1, null);

        turingMachine.addTransition("qrestart8", 1, "qrestart8", 1, Direction.LEFT);
        turingMachine.addTransition("qrestart8", null, "qinit9", 1, null);
        // endregion

        // region copy9
        turingMachine.addTransition("qinit9", 1, "qinit9", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit9", -1, "qinit9", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit9", null, "copy_from_right_to_left9", null, Direction.LEFT);

        turingMachine.addTransition("copy_from_right_to_left9", 1, "copying_1_to_the_right9", -1, Direction.RIGHT);
        turingMachine.addTransition("copy_from_right_to_left9", -1, "copy_from_right_to_left9", -1, Direction.LEFT);
        turingMachine.addTransition("copy_from_right_to_left9", null, "replace_with_1s9", null, Direction.RIGHT);

        turingMachine.addTransition("copying_1_to_the_right9", 1, "copying_1_to_the_right9", 1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right9", -1, "copying_1_to_the_right9", -1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right9", null, "copy_from_right_to_left9", -1, Direction.LEFT);

        turingMachine.addTransition("replace_with_1s9", -1, "replace_with_1s9", 1, Direction.RIGHT);
        turingMachine.addTransition("replace_with_1s9", 1, "replace_with_1s9", 1, Direction.LEFT);
        turingMachine.addTransition("replace_with_1s9", null, "qrestart9", 1, null);

        turingMachine.addTransition("qrestart9", 1, "qrestart9", 1, Direction.LEFT);
        turingMachine.addTransition("qrestart9", null, "qinit10", 1, null);
        // endregion

        // region copy10
        turingMachine.addTransition("qinit10", 1, "qinit10", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit10", -1, "qinit10", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit10", null, "copy_from_right_to_left10", null, Direction.LEFT);

        turingMachine.addTransition("copy_from_right_to_left10", 1, "copying_1_to_the_right10", -1, Direction.RIGHT);
        turingMachine.addTransition("copy_from_right_to_left10", -1, "copy_from_right_to_left10", -1, Direction.LEFT);
        turingMachine.addTransition("copy_from_right_to_left10", null, "replace_with_1s10", null, Direction.RIGHT);

        turingMachine.addTransition("copying_1_to_the_right10", 1, "copying_1_to_the_right10", 1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right10", -1, "copying_1_to_the_right10", -1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right10", null, "copy_from_right_to_left10", -1, Direction.LEFT);

        turingMachine.addTransition("replace_with_1s10", -1, "replace_with_1s10", 1, Direction.RIGHT);
        turingMachine.addTransition("replace_with_1s10", 1, "replace_with_1s10", 1, Direction.LEFT);
        turingMachine.addTransition("replace_with_1s10", null, "qrestart10", 1, null);

        turingMachine.addTransition("qrestart10", 1, "qrestart10", 1, Direction.LEFT);
        turingMachine.addTransition("qrestart10", null, "qinit11", 1, null);
        // endregion

        // region copy11
        turingMachine.addTransition("qinit11", 1, "qinit11", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit11", -1, "qinit11", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit11", null, "copy_from_right_to_left11", null, Direction.LEFT);

        turingMachine.addTransition("copy_from_right_to_left11", 1, "copying_1_to_the_right11", -1, Direction.RIGHT);
        turingMachine.addTransition("copy_from_right_to_left11", -1, "copy_from_right_to_left11", -1, Direction.LEFT);
        turingMachine.addTransition("copy_from_right_to_left11", null, "replace_with_1s11", null, Direction.RIGHT);

        turingMachine.addTransition("copying_1_to_the_right11", 1, "copying_1_to_the_right11", 1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right11", -1, "copying_1_to_the_right11", -1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right11", null, "copy_from_right_to_left11", -1, Direction.LEFT);

        turingMachine.addTransition("replace_with_1s11", -1, "replace_with_1s11", 1, Direction.RIGHT);
        turingMachine.addTransition("replace_with_1s11", 1, "replace_with_1s11", 1, Direction.LEFT);
        turingMachine.addTransition("replace_with_1s11", null, "qrestart11", 1, null);

        turingMachine.addTransition("qrestart11", 1, "qrestart11", 1, Direction.LEFT);
        turingMachine.addTransition("qrestart11", null, "qinit12", 1, null);
        // endregion

        // region copy12
        turingMachine.addTransition("qinit12", 1, "qinit12", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit12", -1, "qinit12", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit12", null, "copy_from_right_to_left12", null, Direction.LEFT);

        turingMachine.addTransition("copy_from_right_to_left12", 1, "copying_1_to_the_right12", -1, Direction.RIGHT);
        turingMachine.addTransition("copy_from_right_to_left12", -1, "copy_from_right_to_left12", -1, Direction.LEFT);
        turingMachine.addTransition("copy_from_right_to_left12", null, "replace_with_1s12", null, Direction.RIGHT);

        turingMachine.addTransition("copying_1_to_the_right12", 1, "copying_1_to_the_right12", 1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right12", -1, "copying_1_to_the_right12", -1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right12", null, "copy_from_right_to_left12", -1, Direction.LEFT);

        turingMachine.addTransition("replace_with_1s12", -1, "replace_with_1s12", 1, Direction.RIGHT);
        turingMachine.addTransition("replace_with_1s12", 1, "replace_with_1s12", 1, Direction.LEFT);
        turingMachine.addTransition("replace_with_1s12", null, "qrestart12", 1, null);

        turingMachine.addTransition("qrestart12", 1, "qrestart12", 1, Direction.LEFT);
        turingMachine.addTransition("qrestart12", null, "qinit13", 1, null);
        // endregion

        // region copy13
        turingMachine.addTransition("qinit13", 1, "qinit13", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit13", -1, "qinit13", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit13", null, "copy_from_right_to_left13", null, Direction.LEFT);

        turingMachine.addTransition("copy_from_right_to_left13", 1, "copying_1_to_the_right13", -1, Direction.RIGHT);
        turingMachine.addTransition("copy_from_right_to_left13", -1, "copy_from_right_to_left13", -1, Direction.LEFT);
        turingMachine.addTransition("copy_from_right_to_left13", null, "replace_with_1s13", null, Direction.RIGHT);

        turingMachine.addTransition("copying_1_to_the_right13", 1, "copying_1_to_the_right13", 1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right13", -1, "copying_1_to_the_right13", -1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right13", null, "copy_from_right_to_left13", -1, Direction.LEFT);

        turingMachine.addTransition("replace_with_1s13", -1, "replace_with_1s13", 1, Direction.RIGHT);
        turingMachine.addTransition("replace_with_1s13", 1, "replace_with_1s13", 1, Direction.LEFT);
        turingMachine.addTransition("replace_with_1s13", null, "qrestart13", 1, null);

        turingMachine.addTransition("qrestart13", 1, "qrestart13", 1, Direction.LEFT);
        turingMachine.addTransition("qrestart13", null, "qinit14", 1, null);
        // endregion

        // region copy14
        turingMachine.addTransition("qinit14", 1, "qinit14", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit14", -1, "qinit14", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit14", null, "copy_from_right_to_left14", null, Direction.LEFT);

        turingMachine.addTransition("copy_from_right_to_left14", 1, "copying_1_to_the_right14", -1, Direction.RIGHT);
        turingMachine.addTransition("copy_from_right_to_left14", -1, "copy_from_right_to_left14", -1, Direction.LEFT);
        turingMachine.addTransition("copy_from_right_to_left14", null, "replace_with_1s14", null, Direction.RIGHT);

        turingMachine.addTransition("copying_1_to_the_right14", 1, "copying_1_to_the_right14", 1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right14", -1, "copying_1_to_the_right14", -1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right14", null, "copy_from_right_to_left14", -1, Direction.LEFT);

        turingMachine.addTransition("replace_with_1s14", -1, "replace_with_1s14", 1, Direction.RIGHT);
        turingMachine.addTransition("replace_with_1s14", 1, "replace_with_1s14", 1, Direction.LEFT);
        turingMachine.addTransition("replace_with_1s14", null, "qrestart14", 1, null);

        turingMachine.addTransition("qrestart14", 1, "qrestart14", 1, Direction.LEFT);
        turingMachine.addTransition("qrestart14", null, "qinit15", 1, null);
        // endregion

        // region copy15
        turingMachine.addTransition("qinit15", 1, "qinit15", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit15", -1, "qinit15", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit15", null, "copy_from_right_to_left15", null, Direction.LEFT);

        turingMachine.addTransition("copy_from_right_to_left15", 1, "copying_1_to_the_right15", -1, Direction.RIGHT);
        turingMachine.addTransition("copy_from_right_to_left15", -1, "copy_from_right_to_left15", -1, Direction.LEFT);
        turingMachine.addTransition("copy_from_right_to_left15", null, "replace_with_1s15", null, Direction.RIGHT);

        turingMachine.addTransition("copying_1_to_the_right15", 1, "copying_1_to_the_right15", 1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right15", -1, "copying_1_to_the_right15", -1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right15", null, "copy_from_right_to_left15", -1, Direction.LEFT);

        turingMachine.addTransition("replace_with_1s15", -1, "replace_with_1s15", 1, Direction.RIGHT);
        turingMachine.addTransition("replace_with_1s15", 1, "replace_with_1s15", 1, Direction.LEFT);
        turingMachine.addTransition("replace_with_1s15", null, "qrestart15", 1, null);

        turingMachine.addTransition("qrestart15", 1, "qrestart15", 1, Direction.LEFT);
        turingMachine.addTransition("qrestart15", null, "qinit16", 1, null);
        // endregion

        // region copy16
        turingMachine.addTransition("qinit16", 1, "qinit16", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit16", -1, "qinit16", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit16", null, "copy_from_right_to_left16", null, Direction.LEFT);

        turingMachine.addTransition("copy_from_right_to_left16", 1, "copying_1_to_the_right16", -1, Direction.RIGHT);
        turingMachine.addTransition("copy_from_right_to_left16", -1, "copy_from_right_to_left16", -1, Direction.LEFT);
        turingMachine.addTransition("copy_from_right_to_left16", null, "replace_with_1s16", null, Direction.RIGHT);

        turingMachine.addTransition("copying_1_to_the_right16", 1, "copying_1_to_the_right16", 1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right16", -1, "copying_1_to_the_right16", -1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right16", null, "copy_from_right_to_left16", -1, Direction.LEFT);

        turingMachine.addTransition("replace_with_1s16", -1, "replace_with_1s16", 1, Direction.RIGHT);
        turingMachine.addTransition("replace_with_1s16", 1, "replace_with_1s16", 1, Direction.LEFT);
        turingMachine.addTransition("replace_with_1s16", null, "qrestart16", 1, null);

        turingMachine.addTransition("qrestart16", 1, "qrestart16", 1, Direction.LEFT);
        turingMachine.addTransition("qrestart16", null, "qinit17", 1, null);
        // endregion

        // region copy17
        turingMachine.addTransition("qinit17", 1, "qinit17", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit17", -1, "qinit17", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit17", null, "copy_from_right_to_left17", null, Direction.LEFT);

        turingMachine.addTransition("copy_from_right_to_left17", 1, "copying_1_to_the_right17", -1, Direction.RIGHT);
        turingMachine.addTransition("copy_from_right_to_left17", -1, "copy_from_right_to_left17", -1, Direction.LEFT);
        turingMachine.addTransition("copy_from_right_to_left17", null, "replace_with_1s17", null, Direction.RIGHT);

        turingMachine.addTransition("copying_1_to_the_right17", 1, "copying_1_to_the_right17", 1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right17", -1, "copying_1_to_the_right17", -1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right17", null, "copy_from_right_to_left17", -1, Direction.LEFT);

        turingMachine.addTransition("replace_with_1s17", -1, "replace_with_1s17", 1, Direction.RIGHT);
        turingMachine.addTransition("replace_with_1s17", 1, "replace_with_1s17", 1, Direction.LEFT);
        turingMachine.addTransition("replace_with_1s17", null, "qrestart17", 1, null);

        turingMachine.addTransition("qrestart17", 1, "qrestart17", 1, Direction.LEFT);
        turingMachine.addTransition("qrestart17", null, "qinit18", 1, null);
        // endregion

        // region copy18
        turingMachine.addTransition("qinit18", 1, "qinit18", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit18", -1, "qinit18", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit18", null, "copy_from_right_to_left18", null, Direction.LEFT);

        turingMachine.addTransition("copy_from_right_to_left18", 1, "copying_1_to_the_right18", -1, Direction.RIGHT);
        turingMachine.addTransition("copy_from_right_to_left18", -1, "copy_from_right_to_left18", -1, Direction.LEFT);
        turingMachine.addTransition("copy_from_right_to_left18", null, "replace_with_1s18", null, Direction.RIGHT);

        turingMachine.addTransition("copying_1_to_the_right18", 1, "copying_1_to_the_right18", 1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right18", -1, "copying_1_to_the_right18", -1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right18", null, "copy_from_right_to_left18", -1, Direction.LEFT);

        turingMachine.addTransition("replace_with_1s18", -1, "replace_with_1s18", 1, Direction.RIGHT);
        turingMachine.addTransition("replace_with_1s18", 1, "replace_with_1s18", 1, Direction.LEFT);
        turingMachine.addTransition("replace_with_1s18", null, "qrestart18", 1, null);

        turingMachine.addTransition("qrestart18", 1, "qrestart18", 1, Direction.LEFT);
        turingMachine.addTransition("qrestart18", null, "qinit19", 1, null);
        // endregion

        // region copy19
        turingMachine.addTransition("qinit19", 1, "qinit19", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit19", -1, "qinit19", 1, Direction.RIGHT);
        turingMachine.addTransition("qinit19", null, "copy_from_right_to_left19", null, Direction.LEFT);

        turingMachine.addTransition("copy_from_right_to_left19", 1, "copying_1_to_the_right19", -1, Direction.RIGHT);
        turingMachine.addTransition("copy_from_right_to_left19", -1, "copy_from_right_to_left19", -1, Direction.LEFT);
        turingMachine.addTransition("copy_from_right_to_left19", null, "replace_with_1s19", null, Direction.RIGHT);

        turingMachine.addTransition("copying_1_to_the_right19", 1, "copying_1_to_the_right19", 1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right19", -1, "copying_1_to_the_right19", -1, Direction.RIGHT);
        turingMachine.addTransition("copying_1_to_the_right19", null, "copy_from_right_to_left19", -1, Direction.LEFT);

        turingMachine.addTransition("replace_with_1s19", -1, "replace_with_1s19", 1, Direction.RIGHT);
        turingMachine.addTransition("replace_with_1s19", 1, "replace_with_1s19", 1, Direction.LEFT);
        turingMachine.addTransition("replace_with_1s19", null, "qrestart19", 1, null);

        turingMachine.addTransition("qrestart19", 1, "qrestart19", 1, Direction.LEFT);
        turingMachine.addTransition("qrestart19", null, "qfin", 1, null);
        // endregion

        Tape<Integer> tape = new Tape<>();
        for (int i = 0; i < 10; i++) {
            tape.write(1);
            tape.moveRight();
        }

        long startTime = System.currentTimeMillis();
        System.out.println(turingMachine.run(tape));
        long endTime = System.currentTimeMillis();
        System.out.println("Number of ones: " + tape.countOnes());
        System.out.println("Took " + ((endTime - startTime) / 1000) + " seconds");
    }
}
