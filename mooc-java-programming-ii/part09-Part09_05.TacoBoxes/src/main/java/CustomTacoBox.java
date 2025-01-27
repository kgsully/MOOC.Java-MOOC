
public class CustomTacoBox implements TacoBox{

    private int tacos;

    public CustomTacoBox(int tacos) {
        this.tacos = tacos;
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
