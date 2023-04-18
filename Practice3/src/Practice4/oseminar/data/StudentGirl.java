package Practice4.oseminar.data;

public class StudentGirl extends Student implements Comparable<Student>{

    private String maidenName;

    public String getMaidenName() {
        return maidenName;
    }

    public void setMaidenName(String maidenName) {
        this.maidenName = maidenName;
    }

    public StudentGirl(String firstName, String secondName, String patronymic, String dateOfBirth, String maidenName) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.maidenName = maidenName;
    }

    public StudentGirl(String firstName, String secondName, String patronymic, String dateOfBirth, Long studentId, String maidenName) {
        super(firstName, secondName, patronymic, dateOfBirth, studentId);
        this.maidenName = maidenName;
    }

    @Override
    public Long getStudentId() {
        return super.getStudentId();
    }

    @Override
    public void setStudentId(Long studentId) {
        super.setStudentId(studentId);
    }

    @Override
    public int compareTo(Student o) {
        return super.compareTo(o);
    }

    @Override
    public String toString() {
        return "StudentGirl{" +
                "maidenName='" + maidenName +'\'' +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", patronymic='" + super.getPatronymic() + '\'' +
                ", dateOfBirth=" + super.getDateOfBirth() +
                '}';
    }
}
