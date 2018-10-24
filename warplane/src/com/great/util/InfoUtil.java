package com.great.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class InfoUtil {

	public static InfoUtil infoUtil;

	private List<Map<String, Object>> userlist;

	public InfoUtil() {
		userlist = new ArrayList<>();
	}

	public void setlist(Map<String, Object> map) {
		this.userlist.add(map);
		// �ж���Ϸ��¼�Ƿ����5����������ڣ���ɾ����һ��
		if (userlist.size() == 6) {
			userlist.remove(0);
		}
	}

	// ����ʵ�ִ洢��Ϸ����
	public static InfoUtil getonlyInfoUtil() {
		if (infoUtil == null) {
			infoUtil = new InfoUtil();

		}
		return infoUtil;
	}

	public List<Map<String, Object>> getUserlist() {
		return userlist;
	}

	public void setUserlist(List<Map<String, Object>> userlist) {
		this.userlist = userlist;
	}

}
