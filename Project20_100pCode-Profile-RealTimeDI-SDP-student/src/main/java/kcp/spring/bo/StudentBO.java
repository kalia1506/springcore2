package kcp.spring.bo;

import lombok.Data;

@Data
public class StudentBO {
    private String sName, sAddress;
    private int sRollno;
    private String result;
    private double totalMark, avgMark;
    
}
