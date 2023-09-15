class Student {
    int studentId;
    String firstName;
    String lastName;
    int yearOfStudy;

    double calculateAverageGrade(double mathGrade, double economicsGrade, double foreignLanguageGrade) {
        return (mathGrade + economicsGrade + foreignLanguageGrade) / 3;
    }
}

public class StudentTest {public static void main(String[] args) {
    Student student1 = new Student();
    student1.studentId = 1;
    student1.firstName = "Олег";
    student1.lastName = "Орлов";
    student1.yearOfStudy = 3;

    System.out.println("Студент: " + student1.firstName + " " + student1.lastName + "\n"
            + "Средняя оценка: " + student1.calculateAverageGrade(3.4,3.4,5.0));

    System.out.println();

    Student student2 = new Student();
    student2.studentId = 2;
    student2.firstName = "Татьяна";
    student2.lastName = "Иванова";
    student2.yearOfStudy = 4;

    System.out.println("Студент: " + student2.firstName + " " + student2.lastName + "\n"
            + "Средняя оценка: " + student2.calculateAverageGrade(2.3,4.3,4.6));

    System.out.println();

    Student student3 = new Student();
    student3.studentId = 3;
    student3.firstName = "Мария";
    student3.lastName = "Крылова";
    student3.yearOfStudy = 2;


    System.out.println("Студент: " + student3.firstName + " " + student3.lastName + "\n"
            + "Средняя оценка: " + student3.calculateAverageGrade(3.8,5.0,4.5));


}
}
