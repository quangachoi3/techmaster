package Bai6;

public class CBNV {
    long luongCung;
    long thuong;
    long tienPhat;
    long luongThucLinh;
    Nguoi thongTinNV;

    public CBNV() {
    }

    public CBNV(long luongCung, long thuong, long tienPhat, long luongThucLinh, Nguoi thongTinNV) {
        this.luongCung = luongCung;
        this.thuong = thuong;
        this.tienPhat = tienPhat;
        this.luongThucLinh = luongThucLinh;
        this.thongTinNV = thongTinNV;
    }

    public long getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(long luongCung) {
        this.luongCung = luongCung;
    }

    public long getThuong() {
        return thuong;
    }

    public void setThuong(long thuong) {
        this.thuong = thuong;
    }

    public long getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(long tienPhat) {
        this.tienPhat = tienPhat;
    }

    public long getLuongThucLinh() {
        return luongThucLinh;
    }

    public void setLuongThucLinh(long luongThucLinh) {
        this.luongThucLinh = luongThucLinh;
    }

    public Nguoi getThongTinNV() {
        return thongTinNV;
    }

    public void setThongTinNV(Nguoi thongTinNV) {
        this.thongTinNV = thongTinNV;
    }

    @Override
    public String toString() {
        return "CBNV{" +
                "luongCung=" + luongCung +
                ", thuong=" + thuong +
                ", tienPhat=" + tienPhat +
                ", luongThucLinh=" + luongThucLinh +
                ", thongTinNV=" + thongTinNV.toString() +
                '}';
    }
}
