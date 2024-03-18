package school.sptech;

public class Ong {
    private String name;
    private String email;
    private String password;
    private String cnpj;


    public Ong(String name, String email, String password, String cnpj) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.cnpj = cnpj;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public String toString() {
        return "Ong{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }
}
