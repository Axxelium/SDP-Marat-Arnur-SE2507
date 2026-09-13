public class ResumeDirector {
    private final IResumeBuilder builder;

    public ResumeDirector(IResumeBuilder builder) {
        this.builder = builder;
    }

    // ПРезюме для студента-стажер
    public Resume constructStudentInternResume(String candidateName, String candidateEmail) {
        return builder.reset()
                .setFullName(candidateName)
                .setEmail(candidateEmail)
                .setTargetPosition("Junior / Intern Software Engineer")
                .setEducation("BSc Software Engeneering, Astana IT University (Expected 2026)")
                .addSkill("Java Core")
                .addSkill("OOP & SOLID")
                .addSkill("Git / GitHub")
                .addSkill("Data Structures")
                .build();
    }

    // Senior разработчик
    public Resume constructSeniorArchitectResume(String candidateName, String candidateEmail, String candidatePhone) {
        return builder.reset()
                .setFullName(candidateName)
                .setEmail(candidateEmail)
                .setPhone(candidatePhone)
                .setTargetPosition("Senior Software Engineer / Tech Lead")
                .setEducation("MSc Software Engineering")
                .setSummary("Seasoned software architect with 7+ years of experience designing scalable distributed systems.")
                .addSkill("Microservices Architecture")
                .addSkill("Java / Spring Boot")
                .addSkill("Kubernetes & Docker")
                .addSkill("System Design & GoF Patterns")
                .addExperience(new WorkExperience("FinTech Corp", "Lead Developer", 36))
                .addExperience(new WorkExperience("Cloud Solutions Ltd", "Senior Java Engineer", 48))
                .build();
    }
}