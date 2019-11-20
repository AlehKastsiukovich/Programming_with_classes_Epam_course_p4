package by.etc.smplclassobj.student;


/**
 * Создать класс с именем Student, содержащий поля Фамилия и инициалы, номер группы, успеваемость
 * (массив из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность
 * вывода фамилий и номеров групп студентов, имеющих оценки, равные  9 или 10.
 */

public class Main {

    public static void main(String[] args) {
        StudentLogic logic = new StudentLogic();
        StudentView view = new StudentView();

        Student student0 = new Student("Example1", 100);
        Student student1 = new Student("Example2", 100);
        Student student2 = new Student("Example3", 100);
        Student student3 = new Student("Example4", 100);
        Student student4 = new Student("Example5", 100);
        Student student5 = new Student("Example6", 100);
        Student student6 = new Student("Example7", 100);
        Student student7 = new Student("Example8", 100);
        Student student8 = new Student("Example9", 100);
        Student student9 = new Student("Example10", 100);

        int[] check = {9, 10, 9, 10, 10};

        student0.setPerformance(logic.initPerformance());
        student1.setPerformance(logic.initPerformance());
        student2.setPerformance(logic.initPerformance());
        student3.setPerformance(logic.initPerformance());
        student4.setPerformance(logic.initPerformance());
        student5.setPerformance(logic.initPerformance());
        student6.setPerformance(check);
        student7.setPerformance(logic.initPerformance());
        student8.setPerformance(logic.initPerformance());
        student9.setPerformance(logic.initPerformance());

        Student[] allStudent = new Student[10];

        allStudent[0] = student0;
        allStudent[1] = student1;
        allStudent[2] = student2;
        allStudent[3] = student3;
        allStudent[4] = student4;
        allStudent[5] = student5;
        allStudent[6] = student6;
        allStudent[7] = student7;
        allStudent[8] = student8;
        allStudent[9] = student9;

        view.printExcellentStudent(allStudent);
    }
}
