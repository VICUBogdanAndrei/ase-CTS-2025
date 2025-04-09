import Builder.Contract;
import Prototype.OccupationalSafety;

public class Main {
    public static void main(String[] args) {
        //Builder
        System.out.println("BUILDER DP:\n\n");

        Contract contract1 = new Contract.ContractBuilder("09/04/2025","4000").build();

        contract1.printDetails();

        Contract contract2 = new Contract.ContractBuilder("09/04/2025","4000").endDate("Today").build();
        contract2.printDetails();

        //Prototype
        System.out.println("\n\nPROTOTYPE DP:\n\n");

        OccupationalSafety occupationalSafety1 = new OccupationalSafety("TTJ","Job Event");
        OccupationalSafety occupationalSafety2=null;
        occupationalSafety2 = occupationalSafety1.clone();

        occupationalSafety1.print();
        System.out.println("Obj1: " + System.identityHashCode(occupationalSafety1));
        occupationalSafety2.print();
        System.out.println("Obj2: " + System.identityHashCode(occupationalSafety2));

    }
}