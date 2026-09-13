package edu.aitu.sdp.assignment1.model;

import java.util.Collections;
import java.util.List;

public class Resume {
    private final String fullName;
    private final String email;
    private final String phone;
    private final String targetPosition;
    private final String education;
    private final List<String> skills;

    public Resume(String fullName, String email, String phone,
                  String targetPosition, String education, List<String> skills) {
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.targetPosition = targetPosition;
        this.education = education;
        this.skills = skills;
    }

    public String getFullName() { return fullName; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getTargetPosition() { return targetPosition; }
    public String getEducation() { return education; }
    public List<String> getSkills() { return Collections.unmodifiableList(skills); }

    @Override
    public String toString() {
        return "----------------------------------------\n" +
                "RESUME: " + fullName.toUpperCase() + "\n" +
                "Position:  " + targetPosition + "\n" +
                "Contacts:  " + email + " | " + phone + "\n" +
                "Education: " + (education != null ? education : "Not specified") + "\n" +
                "Skills:    " + (skills.isEmpty() ? "None" : String.join(", ", skills)) + "\n" +
                "----------------------------------------";
    }
}