package practice04;

public class Q03_Static_Budget {

    // Type a basic home budget:

    public static void main(String[] args) {
        Budget father = new Budget ();

        father.addSalary(3000);
        father.getPocketMoney(500);
        System.out.println(father.pocketMoney); // 0. 0 --> "Normally you must use budget.familyBudget - with the class name
        System.out.println(Budget.familyBudget);

        Budget mother = new Budget();
        mother.getPocketMoney(1000);
        mother.addSalary(5000);
        System.out.println(mother.familyBudget);
        mother.spendPocketMoney(2000); // this will not work bcs she does not have that much pocket money
        System.out.println(mother.pocketMoney);

        Budget kid = new Budget();
        kid.getPocketMoney(500);
        kid.spendPocketMoney(500);
        System.out.println(Budget.familyBudget);
        System.out.println(kid.pocketMoney);
    }


}
