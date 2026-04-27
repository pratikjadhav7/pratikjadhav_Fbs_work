
class Person {

    String name, gender;
    int age, mobNum;

    public Person() {
        this.name = "Not Given";
        this.gender = "Not Given";
        this.age = 0;
        this.mobNum = 0;
    }

    public Person(String name, String gender, int age, int mobNum) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.mobNum = mobNum;
    }

    void setName(String name) {
        this.name = name;
    }

    void setGender(String gender) {
        this.gender = gender;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setMobNum(int mobNum) {
        this.mobNum = mobNum;
    }

    String getName() {
        return this.name;
    }

    String getGender() {
        return this.gender;
    }

    int getAge() {
        return this.age;
    }

    int getMobNum() {
        return this.mobNum;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Gender: " + this.gender);
        System.out.println("Age: " + this.age);
        System.out.println("Mob No: " + this.mobNum);
    }

}

class Student extends Person {

    int rollNUM;
    double cgpa, feesPaid;

    public Student() {
        super();
        this.rollNUM = 0;
        this.cgpa = 0;
        this.feesPaid = 00;
    }

    public Student(int rollNUM, double cgpa, double feesPaid, String name, String gender, int age, int mobNum) {
        super(name, gender, age, mobNum);
        this.rollNUM = rollNUM;
        this.cgpa = cgpa;
        this.feesPaid = feesPaid;
    }

    void setRollNum(int rollNum) {
        this.rollNUM = rollNum;
    }

    void setFeesPaid(double feesPaid) {
        this.feesPaid = feesPaid;
    }

    void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    int getRollNum() {
        return this.rollNUM;
    }

    double getFeesPaid() {
        return this.feesPaid;
    }

    double getCgpa() {
        return this.cgpa;
    }

    void display() {
        super.display();
        System.out.println("Roll Num: " + rollNUM);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Fees Paid: " + feesPaid);
    }

}

class Teacher extends Person {

    int teacherId;
    String subject;

    public Teacher() {
        super();
        this.teacherId = 0;
        this.subject = "Not Given";
    }

    public Teacher(int teacherId, String subject, String name, String gender, int age, int mobNum) {
        super(name, gender, age, mobNum);
        this.teacherId = teacherId;
        this.subject = subject;
    }

    void setTeacherId(int id) {
        this.teacherId = id;
    }

    void setSubject(String subject) {
        this.subject = subject;
    }

    int getTeacherId() {
        return this.teacherId;
    }

    String getSubject() {
        return this.subject;
    }

    void display() {
        super.display();
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Subject: " + subject);
    }
}

class Employee extends Person {

    int empId;
    String dept;
    double salary;

    public Employee() {
        super();
        this.empId = 0;
        this.dept = "Not Given";
        this.salary = 0;
    }

    public Employee(int empId, String dept, double salary, String name, String gender, int age, int mobNum) {
        super(name, gender, age, mobNum);
        this.empId = empId;
        this.dept = dept;
        this.salary = salary;
    }

    void setEmpId(int id) {
        this.empId = id;
    }

    void setDept(String dept) {
        this.dept = dept;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    int getEmpId() {
        return this.empId;
    }

    String getDept() {
        return this.dept;
    }

    double getSalary() {
        return this.salary;
    }

    void display() {
        super.display();
        System.out.println("Employee ID: " + empId);
        System.out.println("Department: " + dept);
        System.out.println("Salary: " + salary);
    }
}

public class PersonHierarchy {

    public static void main(String[] args) {

        Student s = new Student(12, 8.15, 53000, "Pratik", "M", 21, 860072);
        s.display();

        System.out.println("");

        Employee e = new Employee(1, "HR", 45000, "Snehal", "F", 25, 3465776);
        e.display();

         System.out.println("");
         
        Teacher t = new Teacher(2, "Core Java", "Vinayak Sir", "M", 35, 56987867);
        t.display();

    }
}
