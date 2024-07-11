package DA1.service;

import DA1.model.KhachHang;
import org.junit.Test;

import static org.junit.Test.*;

class KhachHangServiceTest {

    KhachHangService khs = new KhachHangService();

    KhachHang khachHang = new KhachHang(1,"Ta xuan an", "HN","taxuanan@gmail.com", true,"0388221732","1");
    @Test
    public void testXoa(){
        Integer s = khs.DELETEKH(khachHang);
        Integer v = null;
    }
}