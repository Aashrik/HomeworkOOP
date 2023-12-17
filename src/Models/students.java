package Models;

import java.util.Arrays;

public class students {
    String name;
    int age;
    int[] marks;

    char grade;

    public students(String name, int age, int[] marks ){
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.grade = '\0';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
    public void calculateGrade() {
        double averageMarks = Arrays.stream(marks).average().orElse(0);
        if (averageMarks >= 90) {
            grade = 'A';
        } else if (averageMarks >= 80) {
            grade = 'B';
        } else if (averageMarks >= 70) {
            grade = 'C';
        } else if (averageMarks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    public void displayResults() {
        calculateGrade();
        double percentage = Arrays.stream(marks).average().orElse(0);

        System.out.println("\nReport Card for " + name + ":");
        System.out.println("Age: " + age);
        System.out.println("Marks: " + Arrays.toString(marks));
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        String result = (grade != 'F') ? "Pass" : "Fail";
        System.out.println("Result: " + result);
    }
}




