public interface IResumeBuilder {
    IResumeBuilder reset();
    IResumeBuilder setFullName(String fullName);
    IResumeBuilder setEmail(String email);
    IResumeBuilder setPhone(String phone);
    IResumeBuilder setTargetPosition(String targetPosition);
    IResumeBuilder setEducation(String education);
    IResumeBuilder addSkill(String skill);
    Resume build();
}