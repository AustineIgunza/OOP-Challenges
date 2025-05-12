
    // File: Challenge7.java

    abstract class BankMember {

        protected int memberId;
        protected String fullName;
        private BankService service;

        public void doService(BankService service) {
            this.service = service;
            service.process();
        }
    }

    class Manager extends BankMember {

        private String department;

        public Manager(int id, String name, String dept) {
            memberId = id;
            fullName = name;
            department = dept;
        }
    }

    class Customer extends BankMember {

        private String accountNumber;

        public Customer(int id, String name, String accNo) {
            memberId = id;
            fullName = name;
            accountNumber = accNo;
        }
    }

    interface BankService {
        void process();
    }

    class ApproveLoan implements BankService {

        @Override
        public void process() {
            System.out.println("Loan has been approved by the manager.");
        }
    }

    class DepositMoney implements BankService {

        @Override
        public void process() {
            System.out.println("Money has been successfully deposited.");
        }
    }

    class CheckBalance implements BankService {

        @Override
        public void process() {
            System.out.println("Your current balance is $1,200.");
        }
    }

    // ✅ Only one public class, name must match file name
    public class Challenge7 {

        public static void main(String[] args) {

            Manager bankManager = new Manager(101, "Alice Johnson", "Loans");
            Customer bankCustomer = new Customer(202, "Bob Smith", "ACC23455");

            bankManager.doService(new ApproveLoan());     // Manager approves a loan
            bankCustomer.doService(new DepositMoney());   // Customer deposits money
            bankCustomer.doService(new CheckBalance());   // Customer checks balance
        }
    }


