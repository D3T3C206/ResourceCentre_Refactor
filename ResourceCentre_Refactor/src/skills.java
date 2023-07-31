
public class skills {

    private String fullName;
    private int experienceYears;
    private String education;
    private String jobApply;

    public skills(String fullName, int experienceYears, String education, String jobApply) {
        this.fullName = fullName;
        this.experienceYears = experienceYears;
        this.education = education;
        this.jobApply = jobApply;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
		this.fullName = fullName;
	}

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getJobApply() {
		return jobApply;
	}

	public void setJobApply(String jobApply) {
		this.jobApply = jobApply;
	}
	
}
