public class Dantist extends Doctor {
    public Dantist(String name) {
        this.setName(name);
    }

    @Override
    void lechenie() {
        System.out.println("Вас лечит дантист");
    }
}

