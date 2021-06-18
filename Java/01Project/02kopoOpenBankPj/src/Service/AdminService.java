package Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DAO.AdminDAODB;
import UI.BaseUI;
import UI.LogOutUI;
import VO.LogVO;

public class AdminService {
	public Scanner sc = new Scanner(System.in);
	private AdminDAODB dao;
	
	public AdminService() {
		dao = new AdminDAODB();
	}
	
	
	protected String scanStr(String msg) {
		System.out.print(msg);
		String str = sc.nextLine();
		return str;
	}
	
	protected int scanInt(String msg) {
		int num = Integer.parseInt(scanStr(msg));
		return num;
	}
	
	
	/**
	 * 메뉴입력받기
	 * @return
	 * @throws Exception
	 */
	public int menu() throws Exception {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("   [1]전체조회    [2]ID조회    [3]이름조회    [4]전화번호조회    [0]로그아웃");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		
		while(true) {
			System.out.print("메뉴를 입력하세요.");
			String m = sc.nextLine();
			System.out.println();
			boolean isNumeric = isValidNum(m);
			if(!isNumeric) {
				System.out.println("유효하지 않은 값입니다! 다시입력하세요.");
				continue;
			} else {
				int menu = Integer.parseInt(m);
				switch(menu) {
				case 1:	return menu;
				case 2:	return menu;
				case 3:	return menu;
				case 4:	return menu;
				case 0: return menu;
				default:
				System.out.println("유효하지 않은 값입니다! 다시입력하세요.");
				}
			}
		}
	
	}
	
	
	/**
	 * 메뉴입력후 유저정보 받아오기
	 * @throws Exception
	 */
	public void showUserService() throws Exception{
		
		List<LogVO> lst = new ArrayList<>();
		BaseUI ui = null;
		while(true) {
			int i = menu();
			if(i==0) {
				ui = new LogOutUI();
				ui.execute();
				
			}else if(i==1){
				
				lst = dao.showUser(i, "");
				PrintUser(lst);
				continue;
				
			}else if(i==2) {
				String id = scanStr("id를 입력하세요 : ");
				System.out.println();
				lst = dao.showUser(i, id);
				PrintUser(lst);
				continue;
			}else if(i==3) {
				String n = scanStr("이름을 입력하세요 : ");
				System.out.println();
				lst = dao.showUser(i, n);
				PrintUser(lst);
				continue;
			}else if(i==4) { // 전화번호 검색
				while(true) {
					String num = scanStr("전화번호검색(숫자만입력하세요) : ");
					System.out.println();
					
					boolean isNumeric = isValidNum(num);
					if(!isNumeric) {
						System.out.println("유효하지 않은 값입니다! 다시입력하세요.");
						continue;
					} else {
						lst = dao.showUser(i,num);
						PrintUser(lst);
						break;
						
					}
				}
			}
			
		}
		
		
	}
	
	
	public void PrintUser(List<LogVO> lst) throws Exception{
		
		if(lst.size()==0) {
			System.out.println("\t회원이 존재하지 않습니다.");
		}else {
			for(LogVO l : lst) {
				System.out.println("-------------------------------------------------------------------");
				System.out.println("[ID] "+ l.getId());
				System.out.println("[이름] "+ l.getName() + "\t[성별] "+l.getGender());
				System.out.println("[주민등록번호] "+ Getrescd(l));
				System.out.println("[휴대폰번호] "+ GetPhone(l));
				
				
			}
			System.out.println("-------------------------------------------------------------------");
			System.out.println("\t총 "+lst.size()+"명의 고객이 조회되었습니다.");
		}
	}

	
	/**
	 * 주민등록번호 비식별처리
	 * @param lg
	 * @return
	 * @throws Exception
	 */
	public String Getrescd(LogVO lg) throws Exception{
		String r = lg.getRes_code();
		String rc = "";
		for(int i = 0; i<r.length(); i++) {
			
			if(i==6) {
				rc += "-";
			}else if(i>=7) {
				rc+="*";
			}else {
				rc += r.charAt(i);
			}
			
		}
		return rc;
	}
	
	/**
	 * 전화번호 형식
	 * @param lg
	 * @return
	 * @throws Exception
	 */
	public String GetPhone(LogVO lg) throws Exception{
		String p = lg.getPhone();
		String phone = "";
		
		for(int i = 0; i<p.length();i++) {
			phone += p.charAt(i);
			if(i==2 || i==6) phone += "-";
		}
		
		return phone;
	}
	

	
	
	public boolean isValidNum(String i) throws Exception{
		boolean isNumeric = i.chars().allMatch(Character::isDigit);
		return isNumeric;
	}
	
}
