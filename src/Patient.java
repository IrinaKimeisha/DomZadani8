public class Patient {
    private String name;
    private int age;
    private Doctor doctor;
    private int lechenie;

    public Patient(String name, int age, int lechenie) {
        this.name = name;
        this.age = age;
        this.lechenie = lechenie;
    }


    public int getLechenie() {
        return lechenie;
    }

    public void setLechenie(int lechenie) {
        this.lechenie = lechenie;
    }

    void plan(int lechenie) {
        if (lechenie == 1) {
            doctor = new Hirurg("Айболит");
            doctor.lechenie();

        } else if (lechenie == 2) {
            doctor = new Dantist("Сверлозуб");
            doctor.lechenie();

        } else {
            doctor = new Terapevt("Всезнайка");
            doctor.lechenie();
        }
    }
}

