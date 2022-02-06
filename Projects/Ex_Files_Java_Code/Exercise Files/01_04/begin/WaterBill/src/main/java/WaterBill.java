import java.util.Scanner;

public class WaterBill {

    public static double calculateWaterBill(double gallonsUsage) {
        int minUsage = 1496;
        double totalCost = 18.84;

        if(gallonsUsage > minUsage){
            int oneCCF = 748;
            double extraUsage = gallonsUsage - minUsage;
            double numOfCCFs = Math.ceil(extraUsage / oneCCF);
            double costPerExtraCCF = 3.90;
            totalCost = totalCost + (costPerExtraCCF * numOfCCFs);
        }
        return totalCost;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gallons of water " +
                "did you use this month?");
        double usage = scanner.nextDouble();
        double bill = calculateWaterBill(usage);
        System.out.println("Your water bill is $" +
                String.format("%.2f", bill));
    }
}
