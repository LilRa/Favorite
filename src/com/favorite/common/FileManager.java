package com.favorite.common;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
@Component("fileManager")
public class FileManager {
	
	
		 public boolean saveFile(MultipartFile myFile, String path){
		  //사진 업로드
		  boolean flag=false;  
		  
		  try {
			  File oriFile;
			  System.out.println(path+File.separator+myFile.getOriginalFilename());
		   myFile.transferTo(oriFile = new File(path+File.separator+myFile.getOriginalFilename()));
		   // 썸네일
		   BufferedImage oriBuffer;
		   BufferedImage thumbBuffer;
		   oriBuffer = ImageIO.read(oriFile);
		   thumbBuffer = new BufferedImage(50, 50, BufferedImage.TYPE_3BYTE_BGR);
		   
		   Graphics2D g = thumbBuffer.createGraphics();
		   g.drawImage(oriBuffer, 0, 0, 50, 50, null);
		   
		  ImageIO.write(thumbBuffer, "jpg", new File(path+File.separator+"thumb"+myFile.getOriginalFilename()));
		   
		   flag=true;
		  } catch (IllegalStateException e) {
		   e.printStackTrace();
		   flag=false;
		  } catch (IOException e) {
		   e.printStackTrace();
		   flag=false;
		  }
		  return flag;
		 }


}
