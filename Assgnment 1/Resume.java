import java.util.Collections;
import java.util.List;

public class Resume {
    private final int id;
    private final String fullName;
    private final String phone;
    private final String email;
    private final String targetPosition;
    private final String education
    private final List<String> skills;

    // сеттеры
    public Resume(int id, String fullName, String email, String phone, String targetPosition,
                  String summary, String education, List<String> skills) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.targetPosition = targetPosition;
        this.skills = skills;
        this.education = education;
    }

    // геттеры
    public String getFullName() { return fullName; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getTargetPosition() { return targetPosition; }
    public String getEducation() { return education; }
    public List<String> getSkills() { return Collections.unmodifiableList(skills); }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RESUME: ").append(fullName.toUpperCase()).append("\n");
        sb.append("Position: ").append(targetPosition).append("\n");
        sb.append("Contacts: ").append(email).append(" | ").append(phone).append("\n");
        sb.append("Education: ").append(education != null ? education : "Not specified").append("\n");

        sb.append("Skills:\n");
        if (skills.isEmpty()) {
            sb.append("  - None specified\n");
        } else {
            for (String skill : skills) {
                sb.append("  * ").append(skill).append("\n");
            }
        }
    }

}