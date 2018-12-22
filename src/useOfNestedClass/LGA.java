package useOfNestedClass;



public class LGA { //OPENING OF OUTER CLASS

    TerminalA ta = new TerminalA();
    TerminalB tb = new TerminalB();
    TerminalC tc = new TerminalC();

        public void lgaAirport() { //opening of outer method
            System.out.println("We are talking about LaGuardia airport");
            TerminalA ta = new TerminalA();
            ta.terminalA();
            LGA.TerminalC.terminalC();
            LGA.TerminalC.terminalC2();
    }    //closing of outer method

    public class TerminalA{//opening of inner class 1
        public void terminalA(){//opening of inner method 1
            System.out.println("Terminal A is for Delta shuttle");
        }//closing of inner method 1
    }//closing of inner class 1
    public class TerminalB{//opening of inner class 2
        public void terminalB(){//opening of inner method 2
            System.out.println("Terminal B is for American airlines");
        }//closing of inner method 2
    }//closing of inner class 2
    public static class TerminalC{//opening of inner class 2
        public static void terminalC(){//opening of inner method 2
            System.out.println("Terminal C is for Delta local");
        }//closing of inner method 2
        private static void terminalC2(){//opening of inner method 2
            System.out.println("Terminal C2 is for Delta INTER");
        }//closing of inner method 2
    }//closing of inner class 2

}//CLOSING OF OUTER CLASS
