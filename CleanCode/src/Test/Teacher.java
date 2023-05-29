package Test;

public class Teacher extends People {
    String level;
    String experience;
    String subject;

    public Teacher() {
        super();
    }

    public Teacher(String name, int age, boolean sex, double height, double weight, String level, String experience, String subject) {
        super(name, age, sex , height, weight);
        this.level = level;
        this.experience = experience;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "level: "+ level
                +"experience: "+ experience
                +"subject: "+ subject;
    }
}
