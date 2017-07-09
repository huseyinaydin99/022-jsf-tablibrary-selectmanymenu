/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author husey
 */
@ManagedBean
@RequestScoped
public class YonetimliBean {

    /**
     * Creates a new instance of YonetimliBean
     */
    private String[] seciliDeger;
    private Map<String,Object> arabalar;
    static{
        
    }

    public String[] getSeciliDeger() {
        return seciliDeger;
    }

    public void setSeciliDeger(String[] seciliDeger) {
        this.seciliDeger = seciliDeger;
    }

    public Map<String, Object> getArabalar() {
        arabalar = new LinkedHashMap<>();
        arabalar.put("RENAULT", "BROADWAY");
        arabalar.put("OPEL", "ASTRA");
        arabalar.put("PEUGEOT", "206");
        return arabalar;
    }

    public void setArabalar(Map<String, Object> arabalar) {
        this.arabalar = arabalar;
    }
    
    
    
}
