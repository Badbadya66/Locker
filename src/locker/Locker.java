/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locker;

import java.util.Date;

/**
 * @author Student
 */
public class Locker {

    private String username;
    private String password;
    private long date;

    public Locker(String username, String password) {
        this.username = username;
        this.password = password;
        this.date = new Date().getTime();
    }

    /**
     * @param username = รับค่า String username
     * @param password = รับค่า String password
     * @return ถ้า username ที่รับมาถูกต้อง และ password ถููกต้อง คืนค่าเป็น true แล้วถ้าตรงกันข้าม false
     */
    public boolean isUserCorrect(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public void checkExpired() {
        long now = new Date().getTime();

        //ถ้าเวลาเกิน 15 วินาที โดนปรับ
    }
}
