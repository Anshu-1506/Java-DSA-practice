//3. Ask the user to enter cost price and selling price and write a program to calculate profit or loss

import java.util.Scanner;
class Profitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cp, sp;
        System.out.println("Enter cost price and selling price: ");
        cp = sc.nextDouble();
        sp = sc.nextDouble();

        if(sp > cp)
            System.out.println("Profit = " + (sp - cp));
        else if(cp > sp)
            System.out.println("Loss = " + (cp - sp));
        else
            System.out.println("No profit no loss");
    }
}
