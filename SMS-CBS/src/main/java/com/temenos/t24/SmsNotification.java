package com.temenos.t24;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class SmsNotification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}
	
    public static String sendSMS(final String msg) {
        final StringBuffer strBfr = new StringBuffer();
        final String[] smsDetail = msg.split("-");
        final String debitSMS = smsDetail[0];
        final String debitMsgData = smsDetail[1];
        //final String debitSMS = smsDetail[2];
        //final String debitMsgData = smsDetail[3];
        final String returnMsg = null;
        final String smsRequest = "http://172.31.2.30:5001/API/sms/sendMessage";
        try {
            final URL url = new URL(smsRequest);
            final HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            final OutputStream os = connection.getOutputStream();
            final JSONObject jsDebit = new JSONObject();
            jsDebit.put("phoneNumber", (Object)debitSMS);
            jsDebit.put("message", (Object)debitMsgData);
            os.write(jsDebit.toString().getBytes());
            os.close();
   
            final InputStreamReader isr = new InputStreamReader(connection.getInputStream());
            final BufferedReader bfr = new BufferedReader(isr);
            String repliedMsg;
            while ((repliedMsg = bfr.readLine()) != null) {
                strBfr.append(repliedMsg);
            }
            //sendCreditSMS(creditSMS + "-" + creditMsgData);
         
        }
        catch (Exception ex) {}
        return returnMsg;
    }
    
    public static String sendCreditSMS(final String msg) {
        final StringBuffer strBfr = new StringBuffer();
        final String[] smsDetail = msg.split("-");
        final String creditSMS = smsDetail[0];
        final String creditMsgData = smsDetail[1];
        final String returnMsg = null;
        final String smsRequest = "http://172.31.2.30:5001/API/sms/sendMessage";
        try {
            final URL url = new URL(smsRequest);
            final HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            final OutputStream os = connection.getOutputStream();
            final JSONObject jsCredit = new JSONObject();
            jsCredit.put("phoneNumber", (Object)creditSMS);
            jsCredit.put("message", (Object)creditMsgData);
            os.write(jsCredit.toString().getBytes());
            final InputStreamReader isr = new InputStreamReader(connection.getInputStream());
            final BufferedReader bfr = new BufferedReader(isr);
            String repliedMsg;
            while ((repliedMsg = bfr.readLine()) != null) {
                strBfr.append(repliedMsg);
            }
        }
        catch (Exception ex) {}
        return returnMsg;
    }
    public static String sendSMSTeller(final String msg) {
        final StringBuffer strBfr = new StringBuffer();
        final String[] smsDetail = msg.split("-");
        final String debitSMS = smsDetail[0];
        final String debitMsgData = smsDetail[1];
        final String returnMsg = null;
        final String smsRequest = "http://172.31.2.30:5001/API/sms/sendMessage";
        try {
            final URL url = new URL(smsRequest);
            final HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            final OutputStream os = connection.getOutputStream();
            final JSONObject jsDebit = new JSONObject();
            jsDebit.put("phoneNumber", (Object)debitSMS);
            jsDebit.put("message", (Object)debitMsgData);
            os.write(jsDebit.toString().getBytes());
            final InputStreamReader isr = new InputStreamReader(connection.getInputStream());
            final BufferedReader bfr = new BufferedReader(isr);
            String repliedMsg;
            while ((repliedMsg = bfr.readLine()) != null) {
                strBfr.append(repliedMsg);
            }
        }
        catch (Exception ex) {}
        return strBfr.toString();
    }
    public static String sendAASMS(final String msg) {
        final StringBuffer strBfr = new StringBuffer();
        final String[] smsDetail = msg.split("-");
        final String phoneNo = smsDetail[0];
        final String msgData = smsDetail[1];
        final String returnMsg = null;
        final String smsRequest = "http://172.31.2.30:5001/API/sms/sendMessage";
        try {
            final URL url = new URL(smsRequest);
            final HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            final OutputStream os = connection.getOutputStream();
            final JSONObject jsCredit = new JSONObject();
            jsCredit.put("phoneNumber", (Object)phoneNo);
            jsCredit.put("message", (Object)msgData);
            os.write(jsCredit.toString().getBytes());
            final InputStreamReader isr = new InputStreamReader(connection.getInputStream());
            final BufferedReader bfr = new BufferedReader(isr);
            String repliedMsg;
            while ((repliedMsg = bfr.readLine()) != null) {
                strBfr.append(repliedMsg);
            }
        }
        catch (Exception ex) {}
        return returnMsg;
    }
    

}
