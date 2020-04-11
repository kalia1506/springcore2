package kcp.spring.external;

public class External_ICC_ServiceImpl implements External_ICC_Service {

	@Override
	public String ICCgetScore(int matchID) throws Exception {
		if(matchID==1506) {
			return"IndVsAus  600/3";
		}else if(matchID==1110) {
			return"EngVsBan  400/3";
		}else if(matchID==1012) {
			return"IndVsWI  296/8";
		}else {
			throw new IllegalAccessException("Invalid match id");
		}

	}

}
