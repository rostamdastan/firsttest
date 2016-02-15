import java.util.Scanner;
public class FirstIntermediate {
	private double diameter;
	public static void main(String[] args)
	{
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a circle's diameter: ");
        double value = input.nextDouble();
        CircleInfo c = new CircleInfo(value);
        System.out.println(c.calculateStats());
    }  
    public  CircleInfo(double inputValue)
    {
        diameter = inputValue;
    }

    public String calculateStats()
    {
        double radius = diameter / 2;
        double area = Math.PI * radius * radius;
        double circumference = Math.PI * diameter;
        return "\nYou entered a diameter of " + diameter +
                "\nThe circle's raduis is " + radius +
                "\nThe circle's area is " + area +
                "\nThe circle's circumference is " + circumference;
    }
}