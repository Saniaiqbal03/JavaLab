import java.util.Scanner;

class ElectricityBill {
    private int consumerNo;
    private String consumerName;
    private int previousMonthReading;
    private int currentMonthReading;
    private String connectionType;

    public ElectricityBill(int consumerNo, String consumerName, int previousMonthReading, int currentMonthReading, String connectionType) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.previousMonthReading = previousMonthReading;
        this.currentMonthReading = currentMonthReading;
        this.connectionType = connectionType;
    }

    public double calculateBillAmount() {
        double unitsConsumed = currentMonthReading - previousMonthReading;
        double billAmount = 0.0;

        // Implement your tariff structure here based on connection type and units consumed
        if (connectionType.equalsIgnoreCase("domestic")) {
            if (unitsConsumed <= 100) {
                billAmount = unitsConsumed * 1.5;
            } else if (unitsConsumed <= 200) {
                billAmount = 100 * 1.5 + (unitsConsumed - 100) * 2.0;
            } else {
                billAmount = 100 * 1.5 + 100 * 2.0 + (unitsConsumed - 200) * 3.0;
            }
        } else if (connectionType.equalsIgnoreCase("commercial")) {
            // Implement commercial tariff structure
            // ...
        }

        return billAmount;
    }

    public void displayBill() {
        System.out.println("Consumer No: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Previous Month Reading: " + previousMonthReading);
        System.out.println("Current Month Reading: " + currentMonthReading);
        System.out.println("Connection Type: " + connectionType);
        System.out.println("Bill Amount: " + calculateBillAmount());
    }
}

public class ElectricityBillMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Consumer No: ");
        int consumerNo = scanner.nextInt();

        System.out.print("Enter Consumer Name: ");
        String consumerName = scanner.next();

        System.out.print("Enter Previous Month Reading: ");
        int previousMonthReading = scanner.nextInt();

        System.out.print("Enter Current Month Reading: ");
        int currentMonthReading = scanner.nextInt();

        System.out.print("Enter Connection Type (domestic/commercial): ");
        String connectionType = scanner.next();

        ElectricityBill bill = new ElectricityBill(consumerNo, consumerName, previousMonthReading, currentMonthReading, connectionType);
        bill.displayBill();
    }
}