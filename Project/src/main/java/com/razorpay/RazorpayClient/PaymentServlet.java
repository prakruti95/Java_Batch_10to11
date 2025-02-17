package com.razorpay.RazorpayClient;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.Dao;
import com.model.PaymentModel2;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

@WebServlet("/payment")
public class PaymentServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	 String paymentId="";
    	
    	response.setContentType("text/html");
    	PrintWriter out = response.getWriter();
    	
    	try 
        {
             paymentId = request.getParameter("razorpay_payment_id");
            String orderId = request.getParameter("razorpay_order_id");
            String signature = request.getParameter("razorpay_signature");

            // Generate the expected signature
            String generatedSignature = generateSignature(orderId, paymentId);
            	
            // Verify the payment signature
            if (generatedSignature.equals(signature)) {
                // Payment is verified
                response.getWriter().write("Payment successful234");
                
              
                
                
                
                // Handle successful payment (e.g., update database)
            } else {
                response.getWriter().write("Payment verification failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().write("Payment failed: " + e.getMessage());
            
          
        }
    }

    private String generateSignature(String orderId, String paymentId) throws NoSuchAlgorithmException {
        String key = "";
        String data = orderId + "|" + paymentId;

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update((key + "|" + data).getBytes());
        byte[] digest = md.digest();
        return Base64.getEncoder().encodeToString(digest);
    }
}
