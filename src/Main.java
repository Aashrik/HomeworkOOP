import Models.students;

public class Main {
    public static void main(String[] args) {
        // Creating three student objects
        students s1 = new students("Aashrik Pathak", 18, new int[]{85, 90, 92, 88, 95});
        students s2= new students("Bishal rawat", 19, new int[]{78, 85, 80, 75, 82});
        students s3 = new students("Bibash raj dahal", 20, new int[]{92, 88, 95, 90, 87});

        // Displaying results for each student
        s1.displayResults();
        s2.displayResults();
        s3.displayResults();
    }
}

