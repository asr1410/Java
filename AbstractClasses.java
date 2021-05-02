abstract class Root1 {
    private int paremeters;

    public Root1(int paremeters) {
        this.setParemeters(paremeters);
    }

    public int getParemeters() {
        return paremeters;
    }

    public void setParemeters(int paremeters) {
        this.paremeters = paremeters;
    }

    abstract public void greet1();

    abstract public void greet2();
}

abstract class Subroot1 extends Root1 {
    private int range;

    public Subroot1(int paremeters, int range) {
        super(paremeters);
        this.setRange(range);
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    abstract public void greet3();
}

class Leave2 extends Subroot1 {
    private int leaveNode;

    public Leave2(int paremeters, int range, int leaveNode) {
        super(paremeters, range);
        this.setLeaveNode(leaveNode);
    }

    public int getLeaveNode() {
        return leaveNode;
    }

    public void setLeaveNode(int leaveNode) {
        this.leaveNode = leaveNode;
    }

    public void greet1() {
        System.out.println("this is the abstract class of root");
    }

    public void greet2() {
        System.out.println("this is abstract class of root");
    }

    public void greet3() {
        System.out.println("this is the abstract class of subroot");
    }
}

public class AbstractClasses {

    public static void main(String[] args) {
        Leave2 node = new Leave2(20, 30, 40);
        node.greet1();
        node.greet2();
        node.greet3();
    }
}