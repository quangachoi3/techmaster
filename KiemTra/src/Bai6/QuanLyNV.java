package Bai6;



import Bai5.Student;

import java.util.ArrayList;
import java.util.ListIterator;

public class QuanLyNV {
    ArrayList<CBNV> CBNV_lists;
    private static QuanLyNV manager;

    public QuanLyNV() {
        this.CBNV_lists = new ArrayList<CBNV>();
    }

    public static QuanLyNV getManager() {
        return new QuanLyNV();
    }

    public void addNV(CBNV nv){
        this.CBNV_lists.add(nv);
    }
    public void removeNV(String maGV){
        ListIterator<CBNV> iterator = this.CBNV_lists.listIterator();
        CBNV index;
        while (iterator.hasNext()) {
            index = iterator.next();
            if(index.thongTinNV.getId().equals(maGV))
            {
                CBNV_lists.remove(index);
            }
        }
    }

    public void showAll(){
        ListIterator<CBNV> iterator = this.CBNV_lists.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }

    public long tinhLuong(String maGV){
        ListIterator<CBNV> iterator = this.CBNV_lists.listIterator();
        CBNV index;
        long result = 0;
        while (iterator.hasNext()) {
            index = iterator.next();
            if(index.thongTinNV.getId().equals(maGV))
            {
                result = index.luongCung + index.thuong - index.tienPhat;
                index.setLuongThucLinh(result);
            }
        }
        return result;
    }


}
