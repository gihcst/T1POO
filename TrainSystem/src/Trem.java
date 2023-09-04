import java.util.*;
public class Trem {
    private int id;
    private ArrayList<Locomotiva> locomotivas;
    private ArrayList<Vagao> vagoes;

    //criar trem (construtor)
    public Trem(int id, Locomotiva locomotiva){
        this.id = id;
        this.locomotivas = new ArrayList<Locomotiva>();
        this.vagoes = new ArrayList<Vagao>();
        this.locomotivas.add(locomotiva);
    }

    public int getId() {
        return id;
    }

}