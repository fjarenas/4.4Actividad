package bd.dao.daoPerson;

public class Person {
    private String email;
    private String name;
    private String code;

    public Person(String email, String name, String code) {
        this.email = email;
        this.name = name;
        this.code = code;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", email, name, code);
    }
}
