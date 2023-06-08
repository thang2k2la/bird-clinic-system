/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.controller;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import sample.dao.ServiceDAO;
import sample.dto.ServiceDTO;

/**
 *
 * @author TPTNam
 */
@MultipartConfig()
public class UpdateServiceController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try {
            ServiceDAO dao = new ServiceDAO();
            ServiceDTO ser;
            String ser_id = request.getParameter("service_id");
            String ser_name = request.getParameter("serviceName");
            float ser_fee = Float.parseFloat(request.getParameter("serviceFee"));
            String ser_des = request.getParameter("serviceDescription");
            String ser_detail = request.getParameter("serviceDetail");
            int ser_status = Integer.parseInt(request.getParameter("status"));
            Part icon = request.getPart("icon");
            Part img = request.getPart("image");
            URL resourceUrl = request.getServletContext().getResource("/web/admin/assets/img/specialities");
            String realPath = resourceUrl.getPath();
            if (icon != null && img != null) {
                String iconFileName = icon.getSubmittedFileName();
                String imageFileName = img.getSubmittedFileName();
                icon.write(realPath + "/" + iconFileName);
                icon.write(realPath + "/" + imageFileName);
                ser = new ServiceDTO(ser_id, ser_name, ser_detail, ser_des, ser_fee, realPath + "/" + iconFileName, realPath + "/" + imageFileName, ser_status);
                dao.update(ser);
            } else if (icon != null && img == null) {
                String iconFileName = icon.getSubmittedFileName();
                icon.write(realPath + "/" + iconFileName);
                ser = new ServiceDTO(ser_id, ser_name, ser_detail, ser_des, ser_fee, realPath + "/" + iconFileName,null, ser_status);
                dao.updateWithOutImage(ser);
            } else if(icon == null && img != null){
                String imageFileName = img.getSubmittedFileName();
                icon.write(realPath + "/" + imageFileName);
                ser = new ServiceDTO(ser_id, ser_name, ser_detail, ser_des, ser_fee,null, realPath + "/" + imageFileName, ser_status);
                dao.updateWithOutIcon(ser);
            } else if(icon == null && img == null){
                String imageFileName = img.getSubmittedFileName();
                ser = new ServiceDTO(ser_id, ser_name, ser_detail, ser_des, ser_fee,null, null, ser_status);
                dao.updateWithOutIcon(ser);}

        } catch (IOException | NumberFormatException | SQLException | ServletException e) {
        } finally {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }

    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
