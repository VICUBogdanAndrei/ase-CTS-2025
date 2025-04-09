package Builder;

public class Contract implements IContract{

    private String startDate;
    private String endDate;
    private String salary;

    //
    private boolean bonus;
    private boolean stockOption;
    private boolean confidencialClause;
    private boolean nonCompeteClause;



    private Contract ()
    {

    }

    @Override
    public void printDetails() {
        System.out.println("Contract{" +
                "startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", salary='" + salary + '\'' +
                ", bonus=" + bonus +
                ", stockOption=" + stockOption +
                ", confidencialClause=" + confidencialClause +
                ", nonCompeteClause=" + nonCompeteClause +
                '}');
    }

    public static class ContractBuilder{
        private Contract contract;

        public ContractBuilder(String startdate, String salary)
        {
            this.contract=new Contract();

            this.contract.startDate=startdate;
            this.contract.endDate="undetermined";
            this.contract.salary=salary;
        }

        public ContractBuilder endDate (String endDate)
        {
            this.contract.endDate=endDate;
            return this;
        }

        public ContractBuilder bonus(boolean bonus)
        {
            this.contract.bonus=bonus;
            return this;
        }
        public ContractBuilder stockOption(boolean stockOption)
        {
            this.contract.stockOption=stockOption;
            return this;
        }

        public ContractBuilder confidencialClause(boolean confidentialClause)
        {
            this.contract.confidencialClause=confidentialClause;

            return this;
        }
        public ContractBuilder nonCompeteClause(boolean nonCompeteClause)
        {
            this.contract.nonCompeteClause=nonCompeteClause;
            return this;
        }

        public Contract build()
        {
            return this.contract;
        }

    }
}
