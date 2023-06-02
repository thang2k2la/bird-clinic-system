/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import sample.dto.UserDTO;
import sample.utils.Utils;

/**
 *
 * @author MSI AD
 */
public class UserDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<UserDTO> get3PopularDoctor() {
        List<UserDTO> list = new ArrayList<>();
        int count = 0;
        try {
            conn = Utils.getConnection();
            ps = conn.prepareStatement("WITH doctor_counts AS (\n"
                    + "    SELECT b.username_doctor, COUNT(b.username_doctor) AS count\n"
                    + "    FROM tbl_Medical_Record md\n"
                    + "    INNER JOIN tbl_Booking b ON md.booking_id = b.booking_id\n"
                    + "    GROUP BY b.username_doctor\n"
                    + ")\n"
                    + "SELECT a.*,c.count\n"
                    + "FROM tbl_Account a\n"
                    + "INNER JOIN doctor_counts c ON a.user_name = c.username_doctor\n"
                    + "ORDER BY c.count DESC");
            rs = ps.executeQuery();
            while (rs.next()) {
                if (count > 2) {
                    break;
                }
                list.add(new UserDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), true, rs.getString(11)));
                count++;
            }
            return list;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public int getCount(String username) {
        int i = 0;
        try {
            conn = Utils.getConnection();
            ps = conn.prepareStatement("with doctor_count as  (SELECT b.username_doctor, COUNT(b.username_doctor) AS count\n"
                    + "    FROM tbl_Medical_Record md\n"
                    + "    INNER JOIN tbl_Booking b ON md.booking_id = b.booking_id\n"
                    + "    GROUP BY b.username_doctor)\n"
                    + "select c.count\n"
                    + "from doctor_count c\n"
                    + "where c.username_doctor = ?");
            ps.setString(1, username);
            rs = ps.executeQuery();
            if (rs.next()) {
                i = rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return i;
    }

    public List<UserDTO> get3RecentCustomer() {
        List<UserDTO> list = new ArrayList<>();
        List<UserDTO> list1 = new ArrayList<>();
        int count = 0;
        try {
            conn = Utils.getConnection();
            ps = conn.prepareStatement("with customer as(select pb.user_name,md.ID\n"
                    + "from tbl_Medical_Record md inner join tbl_Patient_Bird pb\n"
                    + "	 on md.patient_id = pb.patient_id\n"
                    + ")\n"
                    + "select a.*\n"
                    + "from tbl_Account a inner join customer c on a.user_name = c.user_name\n"
                    + "order by c.ID desc");
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new UserDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), true, rs.getString(11)));
            }
            for (UserDTO u : list) {
                boolean a = true;
                for (UserDTO u1 : list1) {
                    if (u1.getUsername().equals(u.getUsername())) {
                        a = false;
                        break;
                    }
                }
                if (a == true) {
                    list1.add(u);
                }
            }
            return list1;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public List<UserDTO> getListCustomer() {
        List<UserDTO> list = new ArrayList<>();
        try {
            String query = "SELECT * FROM tbl_Account WHERE role_id = 4";
            conn = new Utils().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                UserDTO user = new UserDTO(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDate(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getBoolean(10),
                        rs.getString(11));

                list.add(user);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public void signUpAccount(String username, String fullName, String email, String gender, Date dob, String phone, String password) {
        String query = "INSERT INTO tbl_Account VALUES(?,?,?,?,?,?,?,NULL,NULL,1,4)";

        try {
            conn = new Utils().getConnection();
            ps = conn.prepareCall(query);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, email);
            ps.setString(4, phone);
            ps.setDate(5, dob);
            ps.setString(6, new String(fullName.getBytes("UTF-8"), "UTF-8"));
            ps.setString(7, gender);
            ps.executeUpdate();

        } catch (Exception e) {
        }
    }

    public UserDTO checkExistAccount(String username) {
        String query = "SELECT * FROM tbl_Account WHERE user_name = ?";
        try {
            conn = new Utils().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new UserDTO(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDate(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getBoolean(10),
                        rs.getString(11));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public UserDTO checkExistEmail(String email) {
        String query = "SELECT * FROM tbl_Account WHERE email = ?";
        try {
            conn = new Utils().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, email);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new UserDTO(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDate(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getBoolean(10),
                        rs.getString(11));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public UserDTO checkExistPhone(String phone) {
        String query = "SELECT * FROM tbl_Account WHERE phone = ?";
        try {
            conn = new Utils().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, phone);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new UserDTO(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDate(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getBoolean(10),
                        rs.getString(11));
            }
        } catch (Exception e) {

        }
        return null;
    }

    public List<String> getDateAndPaidForCustomerList(String name) {
        List<String> list = new ArrayList<>();
        try {
            conn = Utils.getConnection();
            ps = conn.prepareStatement("with customer as(select md.booking_id,pb.user_name,md.ID,md.total_fee\n"
                    + "from tbl_Medical_Record md inner join tbl_Patient_Bird pb\n"
                    + "	 on md.patient_id = pb.patient_id\n"
                    + "where pb.user_name = ?)\n"
                    + "select b.date, c.total_fee\n"
                    + "from tbl_Booking b inner join customer c on b.booking_id = c.booking_id\n"
                    + "order by c.ID desc");
            ps.setString(1, name);
            rs = ps.executeQuery();
            if (rs.next()) {
                list.add(rs.getString(1));
                list.add(rs.getString(2));
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }

    public UserDTO Login(String username, String password) {
        String query = "SELECT * FROM tbl_Account WHERE user_name = ? AND password = ?";
        try {
            conn = new Utils().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new UserDTO(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDate(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getBoolean(10),
                        rs.getString(11));
            }

        } catch (Exception e) {
        }
        return null;
    }

    private static final String LOGIN_GOOGLE = "SELECT email FROM tbl_Account WHERE email = ?";

    public UserDTO checkLogin(String email) throws SQLException {
        UserDTO user = null;
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = Utils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(LOGIN_GOOGLE);
                ptm.setString(1, email);
                rs = ptm.executeQuery();
                if (rs.next()) {
                    String email_ = rs.getString("email");
                    user = new UserDTO("", "", email, "", null, "", "", "", "", true, "");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return user;

    }
}
