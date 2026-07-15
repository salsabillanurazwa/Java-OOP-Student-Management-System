class Student {
    private String studentId;
    private String name;
    private String programme;

    // Constructor
    public Student(String studentId, String name, String programme) {

        if (studentId == null || studentId.trim().isEmpty()) {
            this.studentId = "UNKNOWN";
        } else {
            this.studentId = studentId;
        }

        if (name == null || name.trim().isEmpty()) {
            this.name = "Unknown Student";
        } else {
            this.name = name;
        }

        if (programme == null || programme.trim().isEmpty()) {
            this.programme = "General";
        } else {
            this.programme = programme;
        }
    }

    // Compare programme
    public boolean isSameProgramme(Student otherStudent) {
        return this.programme.equalsIgnoreCase(otherStudent.programme);
    }

    // Getters
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getProgramme() {
        return programme;
    }

    // Setters
    public void setStudentId(String studentId) {
        if (studentId != null && !studentId.trim().isEmpty()) {
            this.studentId = studentId;
        }
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }

    public void setProgramme(String programme) {
        if (programme != null && !programme.trim().isEmpty()) {
            this.programme = programme;
        }
    }

    // Display method
    public void displayStudent() {
        System.out.println("Student ID : " + studentId);
        System.out.println("Name       : " + name);
        System.out.println("Programme  : " + programme);
        System.out.println("--------------------------------");
    }
}