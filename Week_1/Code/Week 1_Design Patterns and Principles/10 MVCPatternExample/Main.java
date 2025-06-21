public class Main {
    public static void main(String[] args) {
        Student model = new Student();
        model.setName("Alice");
        model.setId("S123");
        model.setGrade("A");

        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("Bob");
        controller.setStudentGrade("B+");

        controller.updateView();
    }
}
