public class Main {
    public static void main(String[] args) {
        IResumeBuilder builder = new ResumeBuilder();
        ResumeDirector director = new ResumeDirector(builder);

        // Сборка шаблона через Director
        Resume studentResume = director.constructStudentResume("Aliya Nurpeis", "aliya@aitu.kz");
        System.out.println(studentResume);

        Resume seniorResume = director.constructSeniorResume("Daulet Serikov", "daulet@tech.kz", "+7 777 000 11 22");
        System.out.println(seniorResume);

        // Сборка кастомного резюме через Builder
        Resume customResume = builder.reset()
                .setFullName("Arman Kassymov")
                .setEmail("arman@qa.kz")
                .setPhone("+7 701 555 44 33")
                .setTargetPosition("QA Automation Engineer")
                .setEducation("Astana IT University")
                .addSkill("Java")
                .addSkill("Selenium")
                .addSkill("JUnit 5")
                .build();
        System.out.println(customResume);

        // Проверка валидации
        try {
            System.out.println("Testing validation failure:");
            builder.reset()
                    .setEmail("no-name@test.com")
                    .setTargetPosition("Backend Dev")
                    .build();
        } catch (IllegalStateException e) {
            System.out.println("Caught expected error: " + e.getMessage());
        }
    }
}