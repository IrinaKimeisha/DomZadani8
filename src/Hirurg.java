public class Hirurg extends Doctor {
    public Hirurg(String name) {
        this.setName(name);
    }

    @Override
    void lechenie() {
        System.out.println("Вас лечит хирург");
    }
}
