package main;

public class GradeCalculator4Credit extends GradeCalculator{
    @Override
    public char calculateGrade(String marksString) throws MarksException {
        //Throwing base exceptions and then parsing the marks
        super.calculateGrade(marksString);
        double nonRoundedMarks=Double.parseDouble(marksString);
        double marks=(int)nonRoundedMarks;
        if(nonRoundedMarks-marks>0)
            marks++;

        //Grade A
        if(marks>=GradeCalculator.MARKS_CREDIT_4_A_MIN && marks<=GradeCalculator.MARKS_CREDIT_4_A_MAX) return GradeCalculator.GRADE_A;
        else if(marks>=GradeCalculator.MARKS_CREDIT_4_B_MIN && marks<=GradeCalculator.MARKS_CREDIT_4_B_MAX) return GradeCalculator.GRADE_B;
        else if(marks>=GradeCalculator.MARKS_CREDIT_4_C_MIN && marks<=GradeCalculator.MARKS_CREDIT_4_C_MAX) return GradeCalculator.GRADE_C;
        else return GradeCalculator.GRADE_F;
    }
}
