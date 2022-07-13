package main;

public class GradeCalculator4Credit extends GradeCalculator{
    @Override
    public char calculateGrade(String marksString) throws MarksException {
        //Throwing base exceptions and then parsing the marks
        super.calculateGrade(marksString);
        double marks=Double.parseDouble(marksString);

        //Grade A
        if(marks>=MARKS_CREDIT_4_A_MIN && marks<=MARKS_CREDIT_4_A_MAX) return GRADE_A;
        else if(marks>=MARKS_CREDIT_4_B_MIN && marks<=MARKS_CREDIT_4_B_MAX) return GRADE_B;
        else if(marks>=MARKS_CREDIT_4_C_MIN && marks<=MARKS_CREDIT_4_C_MAX) return GRADE_C;
        else return GRADE_F;
    }
}
