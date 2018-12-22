package useOfNestedClass;

public class TestLGA {
    public static void main(String[] args) {
        LGA lga = new LGA();
        lga.lgaAirport();
        //LGA.TerminalB tb = new LGA.TerminalC();
        //tb.terminalB();
        //lga.ta.terminalA();
        //lga.tb.terminalB();
        //LGA.TerminalC.terminalC();
        //lga.tc.terminalC();
        //LGA.TerminalC tc4 = new LGA.TerminalC(); //inner staic class and static method
        //tc4.terminalC();
        LGA.TerminalC tc3 = new LGA.TerminalC(); //inner staic class and static method
        tc3.terminalC2(); why not?

        //a = new LGA.TerminalA();

    }
}
