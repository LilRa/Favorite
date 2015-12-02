package com.favorite.common;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class FavoriteHttp {
	
	/*HttpURLConnection con;
	URL url;
	
	
	public String httpExecute(String strUrl){
		StringBuffer result = new StringBuffer();
		String str = "http://www.hrd.go.kr/jsp/HRDP/HRDPO00/HRDPOA43/HRDPOA43_1.jsp?authKey=PpGzgynVQfPo0XrfPJRcFGrmbmDKgekE&returnType=XML&outType=1&pageNum=1&pageSize=20&srchTraStDt=20151101&srchTraEndDt=20151225"
				+"&sort=ASC&sortCol=TR_NM_i";
			try {
				url = new URL(str);
				con  = (HttpURLConnection)url.openConnection();
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				con.setDoOutput(true);
				con.setDoInput(true);
	            con.setRequestProperty("Cache-Control", "no-cache");
	            con.setRequestProperty("Content-Type", "application/xml");
	            con.setRequestProperty("Accept", "application/xml");
	            // post로 요청시에는 length를 추가해줘야함
				con.setRequestMethod("GET");
			} catch (ProtocolException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				System.out.println("2");
				int code =con.getResponseCode();
				System.out.println(code);
				if(code == 200){
					InputStreamReader in = new InputStreamReader(con.getInputStream(),"euc-kr");
					BufferedReader buf = new BufferedReader(in);
					System.out.println("3");
					
					String readStr = "";
					while((readStr = buf.readLine()) != null){
						result.append(readStr);
						//System.out.println(read);
					}	
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return result.toString();		
	}*/

}
