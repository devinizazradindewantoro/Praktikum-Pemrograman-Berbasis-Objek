package JS9;
public abstract class Hewan {
    
    private int umur;

    protected Hewan() {
        this.umur = 0;
    }

    public void bertambahUmur() {
        this.umur += 1;
    }

    abstract void bergerak();
}
