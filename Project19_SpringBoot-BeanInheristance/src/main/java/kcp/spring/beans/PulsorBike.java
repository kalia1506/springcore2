package kcp.spring.beans;

public class PulsorBike {
    private String ownerName;
    private String bikeColor;
    private long engineNo;
    private String bikeNo;
    private String company;
    private int engineCC;

    @Override
    public String toString() {
	return "PulsorBike [ownerName=" + ownerName + ", bikeColor=" + bikeColor + ", engineNo=" + engineNo
		+ ", bikeNo=" + bikeNo + ", company=" + company + ", engineCC=" + engineCC + "]";
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setBikeColor(String bikeColor) {
        this.bikeColor = bikeColor;
    }

    public void setEngineNo(long engineNo) {
        this.engineNo = engineNo;
    }

    public void setBikeNo(String bikeNo) {
        this.bikeNo = bikeNo;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
    }
    
}
