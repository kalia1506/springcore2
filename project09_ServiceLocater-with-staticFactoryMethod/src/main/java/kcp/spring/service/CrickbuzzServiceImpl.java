package kcp.spring.service;

import kcp.spring.external.External_ICC_Service;

public class CrickbuzzServiceImpl implements CrickbuzzService {
	private External_ICC_Service e;

	public CrickbuzzServiceImpl(External_ICC_Service e) {
		this.e = e;
	}

	@Override
	public String getScroe(int matchID) throws Exception {
		return e.ICCgetScore(matchID);
	}

}
