/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.ecx.jira.servlet;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/**
 *
 * @author Perndorfer
 */
public class InvalidCertificateTrustManager implements X509TrustManager {

 

    public void checkClientTrusted(X509Certificate[] xcs, String string) throws CertificateException {
        
    }

    public void checkServerTrusted(X509Certificate[] xcs, String string) throws CertificateException {
        
    }

    public X509Certificate[] getAcceptedIssuers() {
        return null;
    }
    
}
