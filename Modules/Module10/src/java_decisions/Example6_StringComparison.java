package java_decisions;

/**
 * Demonstrates String Comparison.
 * == and != does NOT compare the values of two Strings.
 */
class Example6_StringComparison {
    
    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        String ccp1 = "Colonials";
        String ccp2 = "colonials";
        String ccp3 = "COLONIALS";

        if(ccp1.equals(ccp2)) {                                         //Prints if ccp1 is equal to ccp2
            System.out.println(ccp1 + " is equal to " + ccp2);
        }

        if(ccp2.equals(ccp3.toLowerCase())) {                           //Prints if ccp2 is equal to ccp3 (in lowercase)
            System.out.println(ccp2 + " is equal to " + ccp3);
        }

        if(!ccp1.equals(ccp2)) {                                        //Prints if ccp1 is NOT equal to ccp2
            System.out.println(ccp1 + " is not equal to " + ccp2);
        }

        if(ccp2.equalsIgnoreCase(ccp3)) {                               //Prints if ccp2 is equal to ccp3, ignoring case
            System.out.println(ccp2 + " is equal to " + ccp3);
        }
    }
    
}
