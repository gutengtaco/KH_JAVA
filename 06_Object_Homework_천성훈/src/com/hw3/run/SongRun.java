package com.hw3.run;

import java.util.Scanner;

import com.hw3.model.vo.Song;

public class SongRun {

	public static void main(String[] args) {
		Song s = new Song("Dancing Queen","ABBA","Arrival",1976,8);
		s.composerSet();
		s.show();
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		try {
			String singleNum = sc.nextLine();
			int i = Integer.parseInt(singleNum);
			System.out.println("해당 숫자 : "+singleNum);
		}catch(NumberFormatException e){
			System.out.println("숫자만 입력해야 합니다.");
		}
	}

}
