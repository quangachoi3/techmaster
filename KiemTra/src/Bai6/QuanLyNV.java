package Bai6;



import java.util.ArrayList;

public class QuanLyNV {
    ArrayList<CBNV> CBNV_list = new ArrayList<>();
    private static QuanLyNV manager;

    public QuanLyNV() {

    }

    public static QuanLyNV getManager() {
        return new QuanLyNV();
    }

    public static boolean addNV(CBNV nv){
        return manager.CBNV_list.add(nv);
    }
    public static boolean remove(){
        int index = manager.CBNV_list.lastIndexOf()
        return manager.CBNV_list.add(nv);
    }
}
