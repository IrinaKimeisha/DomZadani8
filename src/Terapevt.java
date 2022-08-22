public class Terapevt extends Doctor {
    public Terapevt(String name) {
        this.setName(name);
    }

    @Override
    void lechenie() {
        System.out.println("Вас лечит терапевт");
    }
}

