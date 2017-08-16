package com.nashipaechepkurui.java101;

/**
 * Created by Student on 2/18/2017.
 */
public class MathsClass {
    //Declaring variables.
    private int age;
    private double shoeSize;
    private String firstName;
    private int classHours;
    private String homeAddress;

    // Initializing variables.
    private int sum = 40;
    private int getAge = 30;
    private double getShoeSize = 40;
    private static String getHomeAddress = "magumoni, P.O.Box 89";
    private int getClassHours = 60;
    private static String getFirstName = "anitah";

    public static void main(String args []){
         String monthOfTheYear = "feb";
        System.out.println(monthOfTheYear);

        int multiply = 10*10;
        System.out.println(multiply);

        String homeAddress = "magumoni, P.O.Box 89";
        System.out.println(homeAddress);

        int a = 20;
        int b = 50;
        int c = 80;

        int sum;
        sum = a+b;
        System.out.println(sum);

        sum = a+c;
        System.out.println(sum);

        sum = b+c;
        System.out.println(sum);

        String firstName = "anitah";
        System.out.println(firstName);

        addition();

        System.out.println(message());

        System.out.println(addNumbers());

        System.out.println(computeAge(12));

        System.out.println(computeLesson("monday"));
        System.out.println(computeLesson("tuesday"));
        System.out.println(computeLesson("wednesday"));
        System.out.println(computeLesson("thursday"));
        System.out.println(computeLesson("friday"));
        System.out.println(computeLesson("saturday"));

        System.out.println(computeMonth(1));
        System.out.println(computeMonth(2));
        System.out.println(computeMonth(3));
        System.out.println(computeMonth(4));
        System.out.println(computeMonth(5));
        System.out.println(computeMonth(6));
        System.out.println(computeMonth(7));
        System.out.println(computeMonth(8));
        System.out.println(computeMonth(8));
        System.out.println(computeMonth(9));
        System.out.println(computeMonth(10));
        System.out.println(computeMonth(11));
        System.out.println(computeMonth(12));

        System.out.println(computePresidents(1));
        System.out.println(computePresidents(2));
        System.out.println(computePresidents(3));
        System.out.println(computePresidents(4));
        System.out.println(computePresidents(5));
        System.out.println(computePresidents(6));
        System.out.println(computePresidents(7));
        System.out.println(computePresidents(8));
        System.out.println(computePresidents(9));
        System.out.println(computePresidents(10));
        System.out.println(computePresidents(11));
        System.out.println(computePresidents(12));
        System.out.println(computePresidents(13));
        System.out.println(computePresidents(14));
        System.out.println(computePresidents(15));
        System.out.println(computePresidents(16));
        System.out.println(computePresidents(17));
        System.out.println(computePresidents(18));
        System.out.println(computePresidents(19));
        System.out.println(computePresidents(20));
        System.out.println(computePresidents(21));
        System.out.println(computePresidents(22));
        System.out.println(computePresidents(23));
        System.out.println(computePresidents(24));
        System.out.println(computePresidents(25));
        System.out.println(computePresidents(26));
        System.out.println(computePresidents(27));
        System.out.println(computePresidents(28));
        System.out.println(computePresidents(29));
        System.out.println(computePresidents(30));
        System.out.println(computePresidents(31));
        System.out.println(computePresidents(32));
        System.out.println(computePresidents(34));
        System.out.println(computePresidents(35));
        System.out.println(computePresidents(36));
        System.out.println(computePresidents(37));
        System.out.println(computePresidents(38));
        System.out.println(computePresidents(39));
        System.out.println(computePresidents(40));
        System.out.println(computePresidents(41));
        System.out.println(computePresidents(42));
        System.out.println(computePresidents(43));
        System.out.println(computePresidents(44));
        System.out.println(computePresidents(45));





    }
private  static void addition(){
    int a = 30;
    int b = 50;
    int c = a + b;
    System.out.println("Answer is: " + c);
}
private static String message(){
    String message = "welcome to AkiraChix";
    return message;
}
private static int addNumbers(){
    int a = 40;
    int b = 50;
    int c = a + b;
    return c;
}
    private static String computeAge(int age){
        if (age <= 13)
            return "primary";
        else if (age == 13)
            return "secondary";
        else if (age == 18 )
            return "secondary";
        else
            return "tertiary";
    }
    private static String computeLesson(String day){
        if(day == "monday")
            return "graphicDesign";
        else if (day == "tuesday")
            return "Python";
        else if (day == "wednesday")
            return "HTML";
        else if (day == "thursday")
            return "entrepreneurship";
        else if (day == "friday")
            return "hardware";
        else if (day == "saturday")
            return "mobileDevelopment";
        else
            return "nothing found";
    }
    private static String computeMonth(int month){
        if (month == 1)
            return "january";
        else if (month == 2)
            return "february";
        else if (month == 3)
            return "march";
        else if (month == 4)
            return "april";
        else if (month == 5)
            return "may";
        else if (month == 6)
            return "june";
        else if (month == 7)
            return "july";
        else if (month == 8)
            return "august";
        else if (month == 9)
            return "september";
        else if (month == 10)
            return "october";
        else if (month == 11)
            return "november";
        else if (month == 12)
            return "december";
        else
            return "nothing found";
    }
    private static String computePresidents(int number){
        if (number == 1)
            return "George Washington";
        else if (number == 2)
            return "John Adams";
        else if (number == 3)
            return "Thomas Jefferson";
        else if (number == 4)
            return "James Madison";
        else if (number == 5)
            return "James Monreo";
        else if (number == 6)
            return "John Quincy Adams";
        else if (number == 7)
            return "Andrew Jackson";
        else if (number == 8)
            return "Martin Van Buren";
        else if (number == 9)
            return "William Henry Harrison";
        else if (number == 10)
            return "John Tyler";
        else if (number == 11)
            return "James K.polk";
        else if (number == 12)
            return "Zachary Taylor";
        else if (number == 13)
            return "Millard Fillmore";
        else if (number == 14)
            return "Franklin Pierce";
        else if (number == 15)
            return "James Buchanan";
        else if (number == 16)
            return "Abraham Lincoln";
        else if (number == 17)
            return "Andrew Johnson";
        else if (number == 18)
            return "Ulysses S,Grant";
        else if (number == 19)
            return "RutherFord B.Hayes";
        else if (number == 20)
            return "James A.Garfield";
        else if (number == 21)
            return "Chester A.Arthur";
        else if (number == 22)
            return "Grover Cleveland";
        else if (number == 23)
            return "Benjamin Harrison";
        else if (number == 24)
            return "Grover Cleveland";
        else if (number == 25)
            return "William Mackinley";
        else if (number == 26)
            return "Theodore Roosevelt";
        else if (number == 27)
            return "William Howard Taft";
        else if (number == 28)
            return "Woodrow Wilson";
        else if (number == 29)
            return "Warlen G. Harding";
        else if (number == 30)
            return "Calvin Coolidge";
        else if (number == 31)
            return "Herbert Hoover";
        else if (number == 32)
            return "Franklin D.Roosevelt";
        else if (number == 33)
            return "Harry S.Truman";
        else if (number == 3)
            return "Dwight D.Eisenhower";
        else if (number == 35)
            return "John F.Kennedy";
        else if (number == 36)
            return "Lyndon B.Johnson";
        else if (number == 37)
            return "Richard Nixon";
        else if (number == 38)
            return "Gerald Ford";
        else if (number == 39)
            return "Jimmy Carter";
        else if (number == 40)
            return "Ronald Reagan";
        else if (number == 41)
            return "George B.W.Bush";
        else if (number == 42)
            return "Bill Clinton";
        else if (number == 43)
            return "George W.Bush";
        else if (number == 44)
            return "Barack Obama";
        else if (number == 45)
            return "Donald Trump";
        else
            return "nothing found";
    }

}
