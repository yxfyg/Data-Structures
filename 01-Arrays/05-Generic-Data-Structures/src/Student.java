public class Student {

    private String name;
    private Integer score;

    public Student(String name, Integer score){
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("Student(name: %s, score: %d)", name, score);
    }
}
