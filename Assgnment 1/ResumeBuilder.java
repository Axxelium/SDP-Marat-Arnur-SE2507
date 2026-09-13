import java.util.ArrayList;
import java.util.List;

public class ResumeBuilder implements IResumeBuilder {
    private String fullName;
    private String email;
    private String phone;
    private String targetPosition;
    private String education;
    private final List<String> skills = new ArrayList<>();

    @Override
    public IResumeBuilder reset() {
        this.fullName = null;
        this.email = null;
        this.phone = null;
        this.targetPosition = null;
        this.education = null;
        this.skills.clear();
        return this;
    }

    @Override
    public IResumeBuilder setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    @Override
    public IResumeBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public IResumeBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public IResumeBuilder setTargetPosition(String targetPosition) {
        this.targetPosition = targetPosition;
        return this;
    }

    @Override
    public IResumeBuilder setEducation(String education) {
        this.education = education;
        return this;
    }

    @Override
    public IResumeBuilder addSkill(String skill) {
        if (skill != null && !skill.isBlank()) {
            this.skills.add(skill.trim());
        }
        return this;
    }

    @Override
    public Resume build() {
        validate();
        applyDefaults();

        return new Resume(
                fullName,
                email,
                phone,
                targetPosition,
                education,
                new ArrayList<>(skills)
        );
    }

    private void validate() {
        if (fullName == null || fullName.isBlank()) {
            throw new IllegalStateException("Validation error: Full name is mandatory.");
        }
        if (email == null || !email.contains("@")) {
            throw new IllegalStateException("Validation error: A valid email address is mandatory.");
        }
        if (targetPosition == null || targetPosition.isBlank()) {
            throw new IllegalStateException("Validation error: Target position must be specified.");
        }
    }

    private void applyDefaults() {
        if (this.phone == null || this.phone.isBlank()) {
            this.phone = "Phone not provided";
        }
    }
}