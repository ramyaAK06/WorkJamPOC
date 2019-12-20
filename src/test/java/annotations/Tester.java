package annotations;

public enum Tester {
    RAMYA("Ramya Kulkarni");

    private String authorName;

    Tester(String name) {
        this.authorName = name;
    }
    public String getAuthorName(){
        return authorName;
    }
}
