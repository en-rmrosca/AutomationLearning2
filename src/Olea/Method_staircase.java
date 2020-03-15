package Olea;

public class Method_staircase {

    public void staircase(int i) {
        System.out.println("TASKUL STAIRCASE");
        String sc = "#";
        String disp_st = "";
        for (int j = 0; j < i; j++) {
            disp_st += sc;
            System.out.println(disp_st);
        }
    }
}
