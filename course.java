/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Course {
    private String courseId;
    private String courseName;
    private int capacity;
    private int enrolledStudents;

    // Constructor
    public Course(String courseId, String courseName, int capacity) {
        if (courseId == null || courseId.trim().isEmpty()) {
            this.courseId = "UNKNOWN";
        } else {
            this.courseId = courseId;
        }

        if (courseName == null || courseName.trim().isEmpty()) {
            this.courseName = "Unnamed Course";
        } else {
            this.courseName = courseName;
        }

        if (capacity > 0) {
            this.capacity = capacity;
        } else {
            this.capacity = 1;
            System.out.println("Invalid capacity. Default value 1 assigned.");
        }

        this.enrolledStudents = 0;
    }

    // Enroll student
    public boolean addStudent() {
        if (enrolledStudents < capacity) {
            enrolledStudents++;
            System.out.println("Student enrolled successfully in " + courseName);
            return true;
        } else {
            System.out.println("Enrollment failed. Course is full.");
            return false;
        }
    }

    // Drop student
    public boolean dropStudent() {
        if (enrolledStudents > 0) {
            enrolledStudents--;
            System.out.println("Student dropped successfully from " + courseName);
            return true;
        } else {
            System.out.println("No students available to drop.");
            return false;
        }
    }

    // Getters
    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    // Setters
    public void setCourseId(String courseId) {
        if (courseId != null && !courseId.trim().isEmpty()) {
            this.courseId = courseId;
        }
    }

    public void setCourseName(String courseName) {
        if (courseName != null && !courseName.trim().isEmpty()) {
            this.courseName = courseName;
        }
    }

    public void setCapacity(int capacity) {
        if (capacity > 0 && capacity >= enrolledStudents) {
            this.capacity = capacity;
        } else {
            System.out.println("Invalid capacity value.");
        }
    }

    // Display method
    public void displayCourse() {
        System.out.println("Course ID        : " + courseId);
        System.out.println("Course Name      : " + courseName);
        System.out.println("Capacity         : " + capacity);
        System.out.println("Enrolled Students: " + enrolledStudents);
        System.out.println("--------------------------------");
    }
}