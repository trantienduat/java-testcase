package duattran.example.testcase.entity;

public class SampleResponse {
    private final long id;
    private final String content;

    public SampleResponse(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
