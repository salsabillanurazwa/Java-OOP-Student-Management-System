class EnrollmentTest {

    public static void main(String[] args) {

        // Create Course objects
        Course c1 = new Course("CS101", "Object Oriented Programming", 2);
        Course c2 = new Course("CS102", "Database Systems", 3);
        Course c3 = new Course("CS103", "Computer Networks", 2);

        // Create Student objects
        Student s1 = new Student("S001", "Ali", "Diploma IT");
        Student s2 = new Student("S002", "Siti", "Diploma IT");
        Student s3 = new Student("S003", "John", "Diploma Business");

        System.out.println("===== COURSE ENROLLMENT =====");

        // Simulate enrollment
        System.out.println("\nAli enrolls in OOP:");
        c1.addStudent();

        System.out.println("\nSiti enrolls in OOP:");
        c1.addStudent();

        System.out.println("\nJohn attempts to enroll in OOP:");
        c1.addStudent(); // Course already full

        // Simulate drop
        System.out.println("\nAli drops OOP:");
        c1.dropStudent();

        System.out.println("\nJohn enrolls again:");
        c1.addStudent();

        // Compare programmes
        System.out.println("\n===== PROGRAMME COMPARISON =====");

        if (s1.isSameProgramme(s2)) {
            System.out.println(s1.getName() + " and " +
                               s2.getName() +
                               " are from the same programme.");
        } else {
            System.out.println(s1.getName() + " and " +
                               s2.getName() +
                               " are NOT from the same programme.");
        }

        if (s1.isSameProgramme(s3)) {
            System.out.println(s1.getName() + " and " +
                               s3.getName() +
                               " are from the same programme.");
        } else {
            System.out.println(s1.getName() + " and " +
                               s3.getName() +
                               " are NOT from the same programme.");
        }

        // Display student details
        System.out.println("\n===== STUDENT DETAILS =====");
        s1.displayStudent();
        s2.displayStudent();
        s3.displayStudent();

        // Display course details
        System.out.println("\n===== COURSE DETAILS =====");
        c1.displayCourse();
        c2.displayCourse();
        c3.displayCourse();
    }
}