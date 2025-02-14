public class HealthRecord {
    private static int counter = 0;
    private static double totalHeight = 0.0;
    private static double averageHeight = 0.0;

    private String name;
    private int age;
    private double height; // in meters
    private double weight; // in kilograms

    public HealthRecord(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        setHeight(height); // Use the setter to ensure average height is updated
        this.weight = weight;
        counter++;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    // Setter method for height with validation and average height calculation
    public void setHeight(double height) {
        if (height > 0) {
            // Update total height and calculate new average height
            totalHeight += height;
            averageHeight = totalHeight / counter;
            this.height = height;
        } else {
            System.out.println("Invalid height. Height must be greater than 0.");
        }
    }

    // Static getter for average height
    public static double getAverageHeight() {
        return averageHeight;
    }

    // Method to display class details
    public static void displayClassDetails() {
        System.out.println("Number of HealthRecord objects created: " + counter);
        System.out.println("Average height: " + averageHeight);
    }

    public static void main(String[] args) {
        HealthRecord record1 = new HealthRecord("Alice", 25, 1.65, 55);
        HealthRecord record2 = new HealthRecord("Bob", 30, 1.75, 70);
        HealthRecord record3 = new HealthRecord("Charlie", 35, 1.80, 80);

        // Display class details
        HealthRecord.displayClassDetails();
    }
}