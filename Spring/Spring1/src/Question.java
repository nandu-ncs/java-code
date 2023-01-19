import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
    private int id;
    private String name;
    private List<String> answers;
    private Set<String> answers1;
    private Map<String, String> answers2;

    public Set<String> getAnswers1() {
        return answers1;
    }

    public void setAnswers1(Set<String> answers1) {
        this.answers1 = answers1;
    }

    public Question() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

}
