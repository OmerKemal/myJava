package practice04;

public class Budget {

    public static double familyBudget;
    public double pocketMoney;

    public void getPocketMoney (double moneyToTake){
        if(moneyToTake<familyBudget){
            pocketMoney+=moneyToTake;
            familyBudget-=moneyToTake;
        }

    }

    public void addSalary(double salary){
        familyBudget+=salary;
    }

    public void spendPocketMoney(double moneyToSpend){
        if (moneyToSpend<=pocketMoney){
            pocketMoney-=moneyToSpend;
        }
    }

    public static void spendFamilyBudget (double moneyToSpend){
        if(moneyToSpend<familyBudget){
            familyBudget-=moneyToSpend;
        }
    }
}
