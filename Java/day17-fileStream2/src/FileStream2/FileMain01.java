package FileStream2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMain01 {

	public static void main(String[] args) {
		
		File fileObj = new File("iodata/a.txt");
		String name = fileObj.getName();
		System.out.println("파일명 : " + name);
		
		String parent = fileObj.getParent();
		System.out.println("부모이름 : "+parent);
		
		String path = fileObj.getPath();
		System.out.println("경로 : "+ path);
		
		String abpath = fileObj.getAbsolutePath();
		System.out.println("절대경로 : "+abpath);
		
		boolean bool = fileObj.isFile();
		System.out.println(bool ? "파일입니다." : "파일이 아닙니다.");

		bool = fileObj.isDirectory();
		System.out.println(bool ? "디렉토리입니다." : "디렉토리가 아닙니다.");
		
		bool = fileObj.exists();
		System.out.println(bool ? "존재합니다." : "존재하지 않습니다.");
		
		long size = fileObj.length();
		System.out.println("파일크기 : "+size+"byte(s)");
		
		long time = fileObj.lastModified();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd hh시 mm분 ss초");
		System.out.println("마지막 수정 날짜 : " + sdf.format(new Date(time)));
		
		bool = fileObj.canWrite();
		System.out.println(bool ? "W 가능" : "W 불가능");
		
		bool = fileObj.canRead();
		System.out.println(bool ? "R 가능" : "R 불가능");
		
		bool = fileObj.canExecute();
		System.out.println(bool ? "X 가능" : "X 불가능");
		
		
		File dirObj = new File("iodata");
		System.out.println(dirObj.exists()? "유효한디렉토리입니다." : "유효하지않은 디렉토리입니다.");
		System.out.println(dirObj.isDirectory() ? "디렉토리입니다." : "디렉토리가 아닙니다.");
		
		
		String[] list = dirObj.list();
		System.out.println("--------------------------");
		System.out.println("\t"+dirObj.getName() + " 정보");
		System.out.println("--------------------------");
		for(String n : list) {
			System.out.println(n);
		}
		
		
		
		File newDirObj = new File("iodata/새폴더라능");
		if(!newDirObj.exists()) {
			boolean b = newDirObj.mkdir();
			System.out.println(b ? "생성성공" : "생성실패");
		}
		
		newDirObj = new File("iodata/새폴더라능/고닝");
		if(!newDirObj.exists()) {
			boolean b = newDirObj.mkdir();
			System.out.println(b ? "생성성공" : "생성실패");
		}
		
		newDirObj = new File("iodata/새새새ㅐ/고라니");
		if(!newDirObj.exists()) {
			boolean b = newDirObj.mkdirs();
			System.out.println(b ? "생성성공" : "생성실패");
		}
		
		//고라니 지우기
		boolean dbool = newDirObj.delete();
		System.out.println(dbool? "삭제성공" : "삭제실패");
		
		
		
		
		
	}

}
