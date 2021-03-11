package domain;

public class Crew {

    private final Name name;
    private final Name nickName;

    public Crew(final String name, final String nickName) {
        this.name = new Name(name);
        this.nickName = new Name(nickName);
    }

    public String getNickName() {
        return nickName.getName();
    }
}
