/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basics;

/**
 *
 * @author bhanuka
 */
public class ReplaceTest {

    public static void main(String[] args) {

        String red_url = "https://{hostname}/highlander/auth/return/" + 150 + "?OTP = {value}";
        red_url = red_url.replace("{value}", "Bhanuka");
        
        
        String gbvUrl = "https://gbv-api.prd-prsn.com/courses/{courseId}/items/{itemId}".replace("{courseId}", "123");
        final String gbvUrlEndpoint = gbvUrl.replace("{itemId}", "456");
        
        System.out.println(gbvUrlEndpoint);

    }
}
