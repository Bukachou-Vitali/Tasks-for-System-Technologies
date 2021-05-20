package testApplication.testTask.task1;

public class Parent {
    private String fio;

    public Parent() {
        this.fio = "анна мария оглы";
    }

    public void print() {
        String formattedFio = format();
        System.out.println(formattedFio);
    }

    public String format(){
        String fioInput = this.fio + "!";
        return fioInput;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }
}
