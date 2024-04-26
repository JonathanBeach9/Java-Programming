//20240425_BeachJonathan_Assignment5.7
public class CollegeTuition {
    public static void main(String [] args) {
        double startingTuition = 10000.0;
        double annualTuitionIncrease = 1.05;
        for (int year = 1; year <= 14; year++) {
            double tuition = startingTuition * Math.pow(annualTuitionIncrease, year);
            System.out.println("The tuition in year " + year + " is $" + tuition);
        }
            double tuitionYearOne = startingTuition * Math.pow(annualTuitionIncrease, 11);
            double tuitionYearTwo = startingTuition * Math.pow(annualTuitionIncrease, 12);
            double tuitionYearThree = startingTuition * Math.pow(annualTuitionIncrease, 13);
            double tuitionYearFour = startingTuition * Math.pow(annualTuitionIncrease, 14);

            double tuitionFourYears = tuitionYearOne + tuitionYearTwo + tuitionYearThree + tuitionYearFour;

            System.out.println("The tuition in the 4 years after the 10th year is $" + tuitionFourYears);
        
    }
}
