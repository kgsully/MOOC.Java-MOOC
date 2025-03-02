public class PaymentCard {
    private double balance;

    public PaymentCard(double initBalance) {
        this.balance = initBalance;
    }

    public void eatAffordably() {
        if (this.balance - 2.60 < 0) {
            return;
        }

        this.balance -= 2.60;
    }

    public void eatHeartily() {
        if (this.balance - 4.60 < 0) {
            return;
        }

        this.balance -= 4.60;
    }

    public void addMoney(double amount) {
        if (amount < 0) {
            return;
        }

        if (this.balance + amount <= 150.0) {
            this.balance += amount;
        } else {
            this.balance = 150.0;
        }
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    // FROM SOLUTION:

    // private double balance;

    // // let's store the prices of affordable and hearty meals as variables,
    // // which makes the code clearer to read
    // // the keyword final means that the value of the variable cannot be modified
    // // after it has been set for the first time

    // private final double affordable;
    // private final double hearty;

    // public PaymentCard(double initialBalance) {

    //     this.balance = initialBalance;
    //     this.affordable = 2.6;
    //     this.hearty = 4.6;
    // }



    // public void eatAffordably() {
    //     if (this.balance >= affordable) {
    //         this.balance -= affordable;
    //     }
    // }

    // public void eatHeartily() {
    //     if (this.balance >= hearty) {
    //         this.balance -= hearty;
    //     }
    // }

    // public void addMoney(double amount) {
    //     if (amount < 0) {
    //         return;
    //     }

    //     this.balance += amount;

    //     if (this.balance > 150) {
    //         this.balance = 150;
    //     }
    // }

    // @Override
    // public String toString() {
    //     return "The card has a balance of " + this.balance + " euros";
    // }
}
