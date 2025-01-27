

public class TripleTacoBox implements TacoBox{

    private int tacos;

    public TripleTacoBox() {
        this.tacos = 3;
    }

    @Override
    public void eat() {
        if (this.tacos - 1 >= 0) {
            this.tacos -= 1;
        }

    }

    @Override
    public int tacosRemaining() {
        return tacos;
    }


}
