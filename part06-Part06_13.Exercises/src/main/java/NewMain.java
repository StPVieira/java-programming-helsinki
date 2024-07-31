
public class NewMain {

    public static void main(String[] args) {
        ExerciseManagement management = new ExerciseManagement();
        
        management.add("Test");
        System.out.println(management.exerciseList());
        System.out.println(management.exerciseList().contains("Test"));
        management.removeExercise("Test");
        System.out.println(management.exerciseList());
        
    }
}
