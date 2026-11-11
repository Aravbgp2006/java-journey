package Variables;

public class Variablesquestion {

    public static void main(String[] args) {
        int age = 21;
        String name = "arav raj";

        System.out.println("name:" + name);
        System.out.println("age:" + age);
    }
}





public class Main {
    public static void main(String[] args) {
        
        // 1. Whole numbers (Integer)
        int age = 25;
        
        // 2. Decimal numbers (Double)
        double price = 19.99;
        
        // 3. Text (String) - Notice the capital 'S' and double quotes
        String name = "Alex";
        
        // 4. Single characters (Char) - Uses single quotes
        char grade = 'A';
        
        // 5. True or False (Boolean)
        boolean isJavaFun = true;
        
        // Printing the variables to the console
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Price: $" + price);
        System.out.println("Grade: " + grade);
        System.out.println("Is Java fun? " + isJavaFun);
    }
}






// Student data
String studentName = "John Doe";
int studentID = 15;
int studentAge = 23;
float studentFee = 75.25f;
char studentGrade = 'B';

// Print variables
System.out.println("Student name: " + studentName);
System.out.println("Student id: " + studentID);
System.out.println("Student age: " + studentAge);
System.out.println("Student fee: " + studentFee);
System.out.println("Student grade: " + studentGrade);





class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        a = a + b;
        b = a - b;
        a = a - b;

        a = a * 2;
        b = b + a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}







class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;

        double result1 = a / b;
        double result2 = (double) a / b;

        System.out.println(result1);
        System.out.println(result2);
    }
}




class Main {
    public static void main(String[] args) {
        int a = 5;

        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a);






        
class Main {
    public static void main(String[] args) {
        int a = 10;

        a += 5;
        a *= 2;
        a -= 4;
        a /= 2;
        a %= 6;

        System.out.println(a);
    }
}
        
    }
}




class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;

        a += b * 2;
        b = a - b;
        a++;

        int result = a + b * 2;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("result = " + result);
    }
}








class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 2;

        int result = a + b * c;
        a += 3;
        b--;
        result = result + a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("result = " + result);
    }
}




int myNum = 5;               // Integer (whole number)
float myFloatNum = 5.99f;    // Floating point number
char myLetter = 'D';         // Character
boolean myBool = true;       // Boolean
String myText = "Hello";     // String






class Main {
    public static void main(String[] args) {
        int a = 17;
        int b = 5;

        int temp = a;
        a = b;
        b = temp;

        a += 3;
        b %= a;
        b *= 2;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}



class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int c = a++ + ++b;

        int d = a + b++;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}





class Main {
    public static void main(String[] args) {

        int english = 80;
        int maths = 90;
        int physics = 75;
        int chemistry = 85;
        int computer = 95;

        int total = english + maths + physics
                    + chemistry + computer;

        double percentage = (total / 500.0) * 100;

        double average = total / 5.0;

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");
        System.out.println("Average = " + average);
    }
}




class Main {
    public static void main(String[] args) {

        int number = 47;

        int lastDigit = number % 10;
        int firstDigit = number / 10;

        int reverse = lastDigit * 10 + firstDigit;

        System.out.println("Reverse = " + reverse);
    }
}







class Main {
    public static void main(String[] args) {

        int number = 5839;

        int lastDigit = number % 10;
        int secondLastDigit = (number / 10) % 10;

        int sum = lastDigit + secondLastDigit;

        System.out.println("Sum = " + sum);
    }
}







class Main {
    public static void main(String[] args) {

        int a = 12;
        int b = 5;
        int c = 3;

        int result = a + b * c;

        a += 4;
        b *= 2;
        c++;

        result = result + a - b + c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("result = " + result);
    }
}



5public class Main {
    public static void main(String[] args) {

        int p1 = 250;
        int p2 = 150;
        int p3 = 100;

        int total = p1 + p2 + p3;
        int discount = 50;

        int finalBill = total - discount;

        System.out.println("Total Bill: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Final Bill: " + finalBill);





        public class Main {
    public static void main(String[] args) {

        int java = 85;
        int c = 75;
        int maths = 90;
        int english = 80;
        int computer = 70;

        int total = java + c + maths + english + computer;

        double percentage = (total / 500.0) * 100;
        double average = total / 5.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Average: " + average);
    }
        }
    }
}




public class Main {
    public static void main(String[] args) {

        int money = 1275;

        int notes = money / 100;
        int remaining = money % 100;

        System.out.println("100 Rupee Notes: " + notes);
        System.out.println("Remaining Money: " + remaining);
    }
}



public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        int x = ++a;
        int y = b++;

        a += y;
        b += x;

        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }
}


public class Main {
    public static void main(String[] args) {

        int a = 25;
        int b = 10;

        int temp = a;
        a = b;
        b = temp;

        a = a + 5;
        b = b - 3;

        int x = a / 4;
        int y = b % 6;

        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }
}



public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 5;

        a = a + b;
        b = a - c;
        c = a + b;

        a = c - a;
        b = b + a;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}






String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

for (int i = 0; i < cars.length; i++) {
  System.out.println(cars[i]);
}


