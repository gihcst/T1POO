import java.util.*;
public class Patio {
    private ArrayList<Trem> trens;
    GaragemLocomotivas gl;
    GaragemVagoes gv;

    public Patio() {
        trens = new ArrayList<Trem>();
        gl = new GaragemLocomotivas();
        gv = new GaragemVagoes();
    }
}