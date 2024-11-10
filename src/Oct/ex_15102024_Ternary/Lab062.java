package Oct.ex_15102024_Ternary;

public class Lab062 {
    public static void main (String[] args){
    // Nested Ternary
    // result = condition1? expression1 : (condition2? expression2 :expression3);
        //If the Score is 90 or above, the grade will be "A".
        //If the Score is between 80 and 89, the grade will be "B".
        //If the Score is between 70 and 79, the grade will be "C".
        //If the Score is between 60 and 69, the grade will be "D".
        //If the Score is between 50 and 59, the grade will be "E".
        //If the Score is below 50, the grade will be "Fail".
        int marks = 46;
        String Grades = (marks >= 90)? "A" : (marks >=80)? "B" : (marks >=70)? "C" : (marks >=60)? "D" : (marks >=50)? "E" : "Fail" ;
        System.out.printf("Your Grade is %s",Grades);
    }

}
