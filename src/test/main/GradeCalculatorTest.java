package main;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Grade Calculator Test")
public class GradeCalculatorTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("Grade Calculator Test Started");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Grade Calculator Test Finished");
    }

    @org.junit.jupiter.api.Nested
    @DisplayName("3 Credit Tests")
    class GradeCalculator3CreditTest {

        @BeforeAll
        static void beforeAll() {
            System.out.println("3 Credit Marks Test Started");
        }

        @AfterAll
        static void afterAll() {
            System.out.println("3 Credit Marks Test Finished");
        }
        private static GradeCalculator3Credit gradeCalculator3Credit;
        private static final String MARKS_NAN="hello world";
        private static final String MARKS_NEGATIVE="-10";
        private static final String MARKS_INVALID="500";

        private static final String MARKS_GRADE_A_EDGE_LB="239.4";
        private static final String MARKS_GRADE_A="300";
        private static final String MARKS_GRADE_A_EDGE_UB="399.4";

        private static final String MARKS_GRADE_B_EDGE_LB="209.4";
        private static final String MARKS_GRADE_B="220";
        private static final String MARKS_GRADE_B_EDGE_UB="238.4";

        private static final String MARKS_GRADE_C_EDGE_LB="179.4";
        private static final String MARKS_GRADE_C="200";
        private static final String MARKS_GRADE_C_EDGE_UB="208.4";

        private static final String MARKS_GRADE_F_EDGE_LB="0.4";
        private static final String MARKS_GRADE_F="100";
        private static final String MARKS_GRADE_F_EDGE_UB="178.4";
        private static final String MARKS_ZERO="0";
        private static final String MARKS_NEGATIVE_EDGE="-0.1";
        private static final String MARKS_INVALID_EDGE="400.1";

        @BeforeAll
        static void initialize(){
            gradeCalculator3Credit=new GradeCalculator3Credit();
        }

        @Test
        @DisplayName("Non Number Input Test")
        void nonNumberMarksExceptionTest() {
            MarksException marksException=assertThrows(MarksException.class,()->{
                gradeCalculator3Credit.calculateGrade(MARKS_NAN);
            });
            if(marksException==null)
                fail();
            else{
                String expectedMessage=GradeCalculator.ERROR_MSG_NON_NUMBER_MARKS;
                String actualMessage=marksException.getMessage();
                assertEquals(expectedMessage,actualMessage);
            }
        }

        @Test
        @DisplayName("Negative Marks Test")
        void negativeMarksExceptionTest() {
            MarksException marksException=assertThrows(MarksException.class,()->{
                gradeCalculator3Credit.calculateGrade(MARKS_NEGATIVE);
            });
            if(marksException==null)
                fail();
            else{
                String expectedMessage=GradeCalculator.ERROR_MSG_NEGATIVE_MARKS;
                String actualMessage=marksException.getMessage();
                assertEquals(expectedMessage,actualMessage);
            }
        }

        @Test
        @DisplayName("Invalid Marks Test")
        void invalidMarksExceptionTest() {
            MarksException marksException=assertThrows(MarksException.class,()->{
                gradeCalculator3Credit.calculateGrade(MARKS_INVALID);
            });
            if(marksException==null)
                fail();
            else{
                String expectedMessage=GradeCalculator.ERROR_MSG_INVALID_MARKS;
                String actualMessage=marksException.getMessage();
                assertEquals(expectedMessage,actualMessage);
            }
        }

        @Test
        @DisplayName("Grade A Marks Lower Boundary Test")
        void gradeAMarksLowerBoundTest() {
            try{
                char actual= gradeCalculator3Credit.calculateGrade(MARKS_GRADE_A_EDGE_LB);
                char expected=GradeCalculator.GRADE_A;
                assertEquals(expected,actual);
            }catch(MarksException e){
                fail();
            }
        }

        @Test
        @DisplayName("Grade A Marks Safe Value Test")
        void gradeAMarksTest() {
            try{
                char actual= gradeCalculator3Credit.calculateGrade(MARKS_GRADE_A);
                char expected=GradeCalculator.GRADE_A;
                assertEquals(expected,actual);
            }catch(MarksException e){
                fail();
            }
        }

        @Test
        @DisplayName("Grade A Marks Upper Boundary Test")
        void gradeAMarksUpperBoundTest() {
            try{
                char actual= gradeCalculator3Credit.calculateGrade(MARKS_GRADE_A_EDGE_UB);
                char expected=GradeCalculator.GRADE_A;
                assertEquals(expected,actual);
            }catch(MarksException e){
                fail();
            }
        }

        @Test
        @DisplayName("Grade B Marks Lower Boundary Test")
        void gradeBMarksLowerBoundTest() {
            try{
                char actual= gradeCalculator3Credit.calculateGrade(MARKS_GRADE_B_EDGE_LB);
                char expected=GradeCalculator.GRADE_B;
                assertEquals(expected,actual);
            }catch(MarksException e){
                fail();
            }
        }

        @Test
        @DisplayName("Grade B Marks Safe Value Test")
        void gradeBMarksTest() {
            try{
                char actual= gradeCalculator3Credit.calculateGrade(MARKS_GRADE_B);
                char expected=GradeCalculator.GRADE_B;
                assertEquals(expected,actual);
            }catch(MarksException e){
                fail();
            }
        }

        @Test
        @DisplayName("Grade B Marks Upper Boundary Test")
        void gradeBMarksUpperBoundTest() {
            try{
                char actual= gradeCalculator3Credit.calculateGrade(MARKS_GRADE_B_EDGE_UB);
                char expected=GradeCalculator.GRADE_B;
                assertEquals(expected,actual);
            }catch(MarksException e){
                fail();
            }
        }

        @Test
        @DisplayName("Grade C Marks Lower Boundary Test")
        void gradeCMarksLowerBoundTest() {
            try{
                char actual= gradeCalculator3Credit.calculateGrade(MARKS_GRADE_C_EDGE_LB);
                char expected=GradeCalculator.GRADE_C;
                assertEquals(expected,actual);
            }catch(MarksException e){
                fail();
            }
        }

        @Test
        @DisplayName("Grade C Marks Safe Value Test")
        void gradeCMarksTest() {
            try{
                char actual= gradeCalculator3Credit.calculateGrade(MARKS_GRADE_C);
                char expected=GradeCalculator.GRADE_C;
                assertEquals(expected,actual);
            }catch(MarksException e){
                fail();
            }
        }

        @Test
        @DisplayName("Grade C Marks Upper Boundary Test")
        void gradeCMarksUpperBoundTest() {
            try{
                char actual= gradeCalculator3Credit.calculateGrade(MARKS_GRADE_C_EDGE_UB);
                char expected=GradeCalculator.GRADE_C;
                assertEquals(expected,actual);
            }catch(MarksException e){
                fail();
            }
        }

        @Test
        @DisplayName("Grade F Marks Lower Boundary Test")
        void gradeFMarksLowerBoundTest() {
            try{
                char actual= gradeCalculator3Credit.calculateGrade(MARKS_GRADE_F_EDGE_LB);
                char expected=GradeCalculator.GRADE_F;
                assertEquals(expected,actual);
            }catch(MarksException e){
                fail();
            }
        }

        @Test
        @DisplayName("Grade F Marks Safe Value Test")
        void gradeFMarksTest() {
            try{
                char actual= gradeCalculator3Credit.calculateGrade(MARKS_GRADE_F);
                char expected=GradeCalculator.GRADE_F;
                assertEquals(expected,actual);
            }catch(MarksException e){
                fail();
            }
        }

        @Test
        @DisplayName("Grade F Marks Upper Boundary Test")
        void gradeFMarksUpperBoundTest() {
            try{
                char actual= gradeCalculator3Credit.calculateGrade(MARKS_GRADE_F_EDGE_UB);
                char expected=GradeCalculator.GRADE_F;
                assertEquals(expected,actual);
            }catch(MarksException e){
                fail();
            }
        }

        @Test
        @DisplayName("Zero Marks Test (Extra Case)")
        void zeroMarksTest() {
            try{
                char actual= gradeCalculator3Credit.calculateGrade(MARKS_ZERO);
                char expected=GradeCalculator.GRADE_F;
                assertEquals(expected,actual);
            }catch(MarksException e){
                fail();
            }
        }

        @Test
        @DisplayName("Negative Marks Boundary Test (Extra Case)")
        void negativeMarksBoundTest() {
            MarksException marksException=assertThrows(MarksException.class,()->{
                gradeCalculator3Credit.calculateGrade(MARKS_NEGATIVE_EDGE);
            });
            if(marksException==null)
                fail();
            else{
                String expectedMessage=GradeCalculator.ERROR_MSG_NEGATIVE_MARKS;
                String actualMessage=marksException.getMessage();
                assertEquals(expectedMessage,actualMessage);
            }
        }

        @Test
        @DisplayName("Grade F Marks Upper Boundary Test (Extra Case)")
        void invalidMarksBoundTest() {
            MarksException marksException=assertThrows(MarksException.class,()->{
                gradeCalculator3Credit.calculateGrade(MARKS_INVALID_EDGE);
            });
            if(marksException==null)
                fail();
            else{
                String expectedMessage=GradeCalculator.ERROR_MSG_INVALID_MARKS;
                String actualMessage=marksException.getMessage();
                assertEquals(expectedMessage,actualMessage);
            }
        }
    }

    @org.junit.jupiter.api.Nested
    @DisplayName("4 Credit Tests")
    class GradeCalculator4CreditTest {

        @BeforeAll
        static void beforeAll() {
            System.out.println("4 Credit Marks Test Started");
        }

        @AfterAll
        static void afterAll() {
            System.out.println("4 Credit Marks Test Finished");
        }

        private static GradeCalculator4Credit gradeCalculator4Credit;
        private static final String MARKS_NAN="hello world";
        private static final String MARKS_NEGATIVE="-10";
        private static final String MARKS_INVALID="500";

        private static final String MARKS_GRADE_A_EDGE_LB="319.4";
        private static final String MARKS_GRADE_A="350";
        private static final String MARKS_GRADE_A_EDGE_UB="399.4";

        private static final String MARKS_GRADE_B_EDGE_LB="279.4";
        private static final String MARKS_GRADE_B="300";
        private static final String MARKS_GRADE_B_EDGE_UB="318.4";

        private static final String MARKS_GRADE_C_EDGE_LB="239.4";
        private static final String MARKS_GRADE_C="250";
        private static final String MARKS_GRADE_C_EDGE_UB="278.4";

        private static final String MARKS_GRADE_F_EDGE_LB="0.4";
        private static final String MARKS_GRADE_F="100";
        private static final String MARKS_GRADE_F_EDGE_UB="238.4";

        private static final String MARKS_ZERO="0";
        private static final String MARKS_NEGATIVE_EDGE="-0.1";
        private static final String MARKS_INVALID_EDGE="400.1";
        @BeforeAll
        static void initialize(){
            gradeCalculator4Credit=new GradeCalculator4Credit();
        }

        @Test
        @DisplayName("Non Number Input Test")
        void nonNumberMarksExceptionTest() {
            MarksException marksException=assertThrows(MarksException.class,()->{
                gradeCalculator4Credit.calculateGrade(MARKS_NAN);
            });
            if(marksException==null)
                fail();
            else{
                String expectedMessage=GradeCalculator.ERROR_MSG_NON_NUMBER_MARKS;
                String actualMessage=marksException.getMessage();
                assertEquals(expectedMessage,actualMessage);
            }
        }

        @Test
        @DisplayName("Negative Marks Test")
        void negativeMarksExceptionTest() {
            MarksException marksException=assertThrows(MarksException.class,()->{
                gradeCalculator4Credit.calculateGrade(MARKS_NEGATIVE);
            });
            if(marksException==null)
                fail();
            else{
                String expectedMessage=GradeCalculator.ERROR_MSG_NEGATIVE_MARKS;
                String actualMessage=marksException.getMessage();
                assertEquals(expectedMessage,actualMessage);
            }
        }

        @Test
        @DisplayName("Invalid Marks Test")
        void invalidMarksExceptionTest() {
            MarksException marksException=assertThrows(MarksException.class,()->{
                gradeCalculator4Credit.calculateGrade(MARKS_INVALID);
            });
            if(marksException==null)
                fail();
            else{
                String expectedMessage=GradeCalculator.ERROR_MSG_INVALID_MARKS;
                String actualMessage=marksException.getMessage();
                assertEquals(expectedMessage,actualMessage);
            }
        }

        @Test
        @DisplayName("Grade A Marks Lower Boundary Test")
        void gradeAMarksLowerBoundTest() {
            try{
                char actual= gradeCalculator4Credit.calculateGrade(MARKS_GRADE_A_EDGE_LB);
                char expected=GradeCalculator.GRADE_A;
                assertEquals(expected,actual);
            }catch(MarksException e){
                fail();
            }
        }

        @Test
        @DisplayName("Grade A Marks Safe Value Test")
        void gradeAMarksTest() {
            try{
                char actual= gradeCalculator4Credit.calculateGrade(MARKS_GRADE_A);
                char expected=GradeCalculator.GRADE_A;
                assertEquals(expected,actual);
            }catch(MarksException e){
                fail();
            }
        }

        @Test
        @DisplayName("Grade A Marks Upper Boundary Test")
        void gradeAMarksUpperBoundTest() {
            try{
                char actual= gradeCalculator4Credit.calculateGrade(MARKS_GRADE_A_EDGE_UB);
                char expected=GradeCalculator.GRADE_A;
                assertEquals(expected,actual);
            }catch(MarksException e){
                fail();
            }
        }

        @Test
        @DisplayName("Grade B Marks Lower Boundary Test")
        void gradeBMarksLowerBoundTest() {
            try{
                char actual= gradeCalculator4Credit.calculateGrade(MARKS_GRADE_B_EDGE_LB);
                char expected=GradeCalculator.GRADE_B;
                assertEquals(expected,actual);
            }catch(MarksException e){
                fail();
            }
        }

        @Test
        @DisplayName("Grade B Marks Safe Value Test")
        void gradeBMarksTest() {
            try{
                char actual= gradeCalculator4Credit.calculateGrade(MARKS_GRADE_B);
                char expected=GradeCalculator.GRADE_B;
                assertEquals(expected,actual);
            }catch(MarksException e){
                fail();
            }
        }

        @Test
        @DisplayName("Grade B Marks Upper Boundary Test")
        void gradeBMarksUpperBoundTest() {
            try{
                char actual= gradeCalculator4Credit.calculateGrade(MARKS_GRADE_B_EDGE_UB);
                char expected=GradeCalculator.GRADE_B;
                assertEquals(expected,actual);
            }catch(MarksException e){
                fail();
            }
        }

        @Test
        @DisplayName("Grade C Marks Lower Boundary Test")
        void gradeCMarksLowerBoundTest() {
            try{
                char actual= gradeCalculator4Credit.calculateGrade(MARKS_GRADE_C_EDGE_LB);
                char expected=GradeCalculator.GRADE_C;
                assertEquals(expected,actual);
            }catch(MarksException e){
                fail();
            }
        }

        @Test
        @DisplayName("Grade C Marks Safe Value Test")
        void gradeCMarksTest() {
            try{
                char actual= gradeCalculator4Credit.calculateGrade(MARKS_GRADE_C);
                char expected=GradeCalculator.GRADE_C;
                assertEquals(expected,actual);
            }catch(MarksException e){
                fail();
            }
        }

        @Test
        @DisplayName("Grade C Marks Upper Boundary Test")
        void gradeCMarksUpperBoundTest() {
            try{
                char actual= gradeCalculator4Credit.calculateGrade(MARKS_GRADE_C_EDGE_UB);
                char expected=GradeCalculator.GRADE_C;
                assertEquals(expected,actual);
            }catch(MarksException e){
                fail();
            }
        }

        @Test
        @DisplayName("Grade F Marks Lower Boundary Test")
        void gradeFMarksLowerBoundTest() {
            try{
                char actual= gradeCalculator4Credit.calculateGrade(MARKS_GRADE_F_EDGE_LB);
                char expected=GradeCalculator.GRADE_F;
                assertEquals(expected,actual);
            }catch(MarksException e){
                fail();
            }
        }

        @Test
        @DisplayName("Grade F Marks Safe Value Test")
        void gradeFMarksTest() {
            try{
                char actual= gradeCalculator4Credit.calculateGrade(MARKS_GRADE_F);
                char expected=GradeCalculator.GRADE_F;
                assertEquals(expected,actual);
            }catch(MarksException e){
                fail();
            }
        }

        @Test
        @DisplayName("Grade F Marks Upper Boundary Test")
        void gradeFMarksUpperBoundTest() {
            try{
                char actual= gradeCalculator4Credit.calculateGrade(MARKS_GRADE_F_EDGE_UB);
                char expected=GradeCalculator.GRADE_F;
                assertEquals(expected,actual);
            }catch(MarksException e){
                fail();
            }
        }

        @Test
        @DisplayName("Zero Marks Test (Extra Case)")
        void zeroMarksTest() {
            try{
                char actual= gradeCalculator4Credit.calculateGrade(MARKS_ZERO);
                char expected=GradeCalculator.GRADE_F;
                assertEquals(expected,actual);
            }catch(MarksException e){
                fail();
            }
        }

        @Test
        @DisplayName("Negative Marks Boundary Test (Extra Case)")
        void negativeMarksBoundTest() {
            MarksException marksException=assertThrows(MarksException.class,()->{
                gradeCalculator4Credit.calculateGrade(MARKS_NEGATIVE_EDGE);
            });
            if(marksException==null)
                fail();
            else{
                String expectedMessage=GradeCalculator.ERROR_MSG_NEGATIVE_MARKS;
                String actualMessage=marksException.getMessage();
                assertEquals(expectedMessage,actualMessage);
            }
        }

        @Test
        @DisplayName("Grade F Marks Upper Boundary Test (Extra Case)")
        void invalidMarksBoundTest() {
            MarksException marksException=assertThrows(MarksException.class,()->{
                gradeCalculator4Credit.calculateGrade(MARKS_INVALID_EDGE);
            });
            if(marksException==null)
                fail();
            else{
                String expectedMessage=GradeCalculator.ERROR_MSG_INVALID_MARKS;
                String actualMessage=marksException.getMessage();
                assertEquals(expectedMessage,actualMessage);
            }
        }
    }
}
