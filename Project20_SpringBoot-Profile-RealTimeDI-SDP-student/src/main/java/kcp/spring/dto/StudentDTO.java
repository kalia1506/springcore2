package kcp.spring.dto;

import java.io.Serializable;

import lombok.Data;

@SuppressWarnings("serial")
@Data
public class StudentDTO implements Serializable {
    private String sName, sAddress;
    private int sRollno;
    private int mark1, mark2, mark3, mark4;
    private double totalMark, avgMark;

   
}
