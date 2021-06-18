package kr.ac.kopo.ui;

public class BoardUI extends BaseUI{

	@Override
	public void execute() throws Exception {
		while(true) {
			// 메뉴에서 에러나도 계속실행되게 하고싶다면 try catch를 써서 실행해주면 된다.
			try {
				IBoardUI ui = null; // ** execute중복 해결
				int type = menu();
				switch(type) {
				case 1:
					ui = new SearchAllUI();
					break;
				case 2:
					ui = new SearchOneUI();
					break;
				case 3:
					//AddUI add = new AddUI();
					//add.execute(); // execute가 중복되기 때문에
					ui = new AddUI(); // **묵시적 형변환으로 ui에 메뉴객체 받고
					break;
				case 4:
					ui = new UpdateUI();
					break;
				case 5:
					ui = new DeleteUI();
					break;
				case 0:
					ui = new ExitUI();
					break;
				}
				if(ui != null) ui.execute(); // **break로 탈출하면 메뉴클래스의 execute실행
				else System.out.println("잘못 선택하셨습니다.");
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	private int menu() {
		
		System.out.println("----------------------------------------");
		System.out.println("\t게시판 관리 프로그램");
		System.out.println("----------------------------------------");
		System.out.println("\t1.  전체게시글 조회");
		System.out.println("\t2.  글번호 조회");
		System.out.println("\t3.  새글등록");
		System.out.println("\t4.  게시글 수정");
		System.out.println("\t5.  게시글 삭제");
		System.out.println("\t0.  종료");
		System.out.println("----------------------------------------");
		
		int type = scanInt("메뉴 중 원하는 항목을 선택하세요. : ");
		return type;
		
	}
	
}
