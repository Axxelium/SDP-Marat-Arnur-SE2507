public class ResumeDirector {
    private final IResumeBuilder builder;

    public ResumeDirector(IResumeBuilder builder) {
        this.builder = builder;
    }
    // Резюме для студента-стажер
    public Resume constructStudentResume(String name, String email) {
        return builder.reset()
                .setFullName(name)
                .setEmail(email)
                .setTargetPosition("Junior / Intern Software Engineer")
                .setEducation("BSc Software Engineering, Astana IT University")
                .addSkill("Java Core")
                .addSkill("OOP & Clean Code")
                .addSkill("Git")
                .build();
    }

    // Презюме сеньера
    public Resume constructSeniorResume(String name, String email, String phone) {
        return builder.reset()
                .setFullName(name)
                .setEmail(email)
                .setPhone(phone)
                .setTargetPosition("Senior Java Developer")
                .setEducation("Higher Technical Degree")
                .addSkill("Java & Spring Boot")
                .addSkill("Microservices")
                .addSkill("Docker / K8s")
                .build();
    }
}