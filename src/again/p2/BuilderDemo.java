package again.p2;

public class BuilderDemo {
    public static void main(String[] args) {
        Student s = new StudentBuilder<>()
                .setName("Anna Schmidt")
                .setAge(22)
                .setMatriculationNumber("12345")
                .setFieldOfStudy("B.Sc. Informatik")
                .build();
        Scholar sC = new ScholarBuilder()
                .setName("Anna Schmidt")
                .setAge(22)
                .setMatriculationNumber("12345")
                .setFieldOfStudy("B.Sc. Informatik")
                .setMonthlyAmount(100)
                .setScholarship("Steuerhinterziehung")
                .build();
        Teacher t = new TeacherBuilder().setName("Teacher").setSubject("Math").setAge(69).build();
        System.out.println(t);
        System.out.println(s);

    }
}
