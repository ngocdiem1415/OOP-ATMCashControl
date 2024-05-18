package model;

public abstract class AccountBank {
    protected String id;
    protected String userName;
    protected String passWord;
    protected String firstName;
    protected String lastName;

    public AccountBank(String id, String userName, String passWord, String firstName, String lastName) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        String asw = "";
        asw += "Account: " + userName;
        asw += "\n First name: " + firstName + "\tLast name: " + lastName;
        return asw;
    }

    public abstract double getBalance();


}