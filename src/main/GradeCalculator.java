package main;

public class GradeCalculator {

    //Error messages
    public static final String ERROR_MSG_NEGATIVE_MARKS="marks cannot be negative.";
    public static final String ERROR_MSG_INVALID_MARKS="Invalid marks";
    public static final String ERROR_MSG_NON_NUMBER_MARKS="Marks is not a valid number.";

    //Marks ranges
    protected static final double MARKS_LOWEST_POSSIBLE=0;
    protected static final double MARKS_HIGHEST_POSSIBLE=400;
    //3 Credit marks ranges
    protected static final double MARKS_CREDIT_3_A_MIN=240;
    protected static final double MARKS_CREDIT_3_A_MAX=400;
    protected static final double MARKS_CREDIT_3_B_MIN=210;
    protected static final double MARKS_CREDIT_3_B_MAX=239;
    protected static final double MARKS_CREDIT_3_C_MIN=180;
    protected static final double MARKS_CREDIT_3_C_MAX=209;

    //4 Credit marks ranges
    protected static final double MARKS_CREDIT_4_A_MIN=320;
    protected static final double MARKS_CREDIT_4_A_MAX=400;
    protected static final double MARKS_CREDIT_4_B_MIN=280;
    protected static final double MARKS_CREDIT_4_B_MAX=319;
    protected static final double MARKS_CREDIT_4_C_MIN=240;
    protected static final double MARKS_CREDIT_4_C_MAX=279;

    //Grade constants
    public static final char GRADE_A='A';
    public static final char GRADE_B='B';
    public static final char GRADE_C='C';
    public static final char GRADE_F='D';
    //Vanilla grade for base function
    protected static final char GRADE_X='X';


    public char calculateGrade(String marks) throws MarksException{
        double parsedMarks;
        try{
            parsedMarks=Double.parseDouble(marks);
        }catch(Exception e){
            throw new MarksException(ERROR_MSG_NON_NUMBER_MARKS);
        }
        if(parsedMarks<MARKS_LOWEST_POSSIBLE)
            throw new MarksException(ERROR_MSG_NEGATIVE_MARKS);
        else if(parsedMarks>MARKS_HIGHEST_POSSIBLE)
            throw new MarksException(ERROR_MSG_INVALID_MARKS);
        return GRADE_X;
    }
}
