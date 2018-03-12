package com.Qrcode;



import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

import java.util.Random;
import java.util.Scanner;
public class QRCode_Generator {

	
	/*
	public static void main(String[] args)throws Exception {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the Details you want to generate the Quick Pesponse Code");
		String Details = sc.nextLine();
		  ByteArrayOutputStream out = QRCode.from(Details).to(ImageType.JPG).stream();
		   File f= new  File("B:\\Msg.jpg");
		   FileOutputStream fos= new FileOutputStream(f);
		   fos.write(out.toByteArray());
		   fos.flush();
		   fos.close();
	}


*/				
	 Random rand = new Random();
	 
     // Generate random integers in range 0 to 999
     int num = rand.nextInt(1000);
     //int rand_int2 = rand.nextInt(1000);
	
	
	public  int generateCode(String msg) {
	int	fileNumber=1;
	fileNumber = fileNumber++;
			
	// "B:\\QR_Code\\QR_Images
	
		String Details=msg;
			try{
				ByteArrayOutputStream out = QRCode.from(Details).to(ImageType.JPG).stream();
				File f = new File("B:\\QR_Code\\QR_Images\\img"+num+".jpg");
				//File f = new File("B:\\Image"+fileNumber+".jpg");
				FileOutputStream fos = new FileOutputStream(f);
				fos.write(out.toByteArray());
				fos.flush();
				fos.close();
				return num;
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		
			return num;
	}
	
	
	
	}
	
	
