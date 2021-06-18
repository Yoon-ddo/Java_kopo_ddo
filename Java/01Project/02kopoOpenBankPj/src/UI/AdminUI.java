package UI;

public class AdminUI extends BaseUI{

	@Override
	public void execute() throws Exception {
		/*
		while(true) {
			BaseUI ui = null;
			int m = menu();
			switch(m) {
			case 1:
				//System.out.println("1.회원조회");
				ui = new AdminSelectUserUI();
				ui.execute();
				break;
			case 2:
				System.out.println("2.회원삭제");
				break;
			case 3:
				System.out.println("3.거래관리");
				break;
			case 0:
				//System.out.println("0.로그아웃");
				ui = new LogOutUI();
				ui.execute();
				break;
			default:
				System.out.println("유효하지않은 메뉴입니다. 다시입력하세요.");
			}
		}*/
		adminservice.showUserService();
		
	}
	
	/*
	public int menu() {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("          [1]회원조회   [2]회원삭제   [2]거래관리   [0]. 로그아웃");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		int type = scanInt("원하는 메뉴를 선택하세요. : ");
		System.out.println();
		return type;
	}
	*/

}
