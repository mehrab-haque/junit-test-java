package main;

import org.junit.jupiter.api.Test;

public class GradeCalculator3Credit extends GradeCalculator{
    @Override
    public char calculateGrade(String marksString) throws MarksException {
        //Throwing base exceptions and then parsing the marks
        super.calculateGrade(marksString);
        double nonRoundedMarks=Double.parseDouble(marksString);
        double marks=(int)nonRoundedMarks;
        if(nonRoundedMarks-marks>0)
            marks++;

        //Grade A
        if(marks>=GradeCalculator.MARKS_CREDIT_3_A_MIN && marks<=GradeCalculator.MARKS_CREDIT_3_A_MAX) return GradeCalculator.GRADE_A;
        else if(marks>=GradeCalculator.MARKS_CREDIT_3_B_MIN && marks<=GradeCalculator.MARKS_CREDIT_3_B_MAX) return GradeCalculator.GRADE_B;
        else if(marks>=GradeCalculator.MARKS_CREDIT_3_C_MIN && marks<=GradeCalculator.MARKS_CREDIT_3_C_MAX) return GradeCalculator.GRADE_C;
        else return GradeCalculator.GRADE_F;
    }

}
