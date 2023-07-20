package confirm.ch08;

class OracleDao implements DataAccessObject {
	private final static String ORACLE_DB = "Oracle DB";
	@Override
	public void select() {
		System.out.println(ORACLE_DB + "에서 검색");
	}
	@Override
	public void insert() {
		System.out.println(ORACLE_DB + "에 삽입");
	}
	@Override
	public void update() {
		System.out.println(ORACLE_DB + "를 수정");
	}
	@Override
	public void delete() {
		System.out.println(ORACLE_DB + "에서 삭제");
	}
}

class MySqlDao implements DataAccessObject {
	private final static String MYSQL_DB = "MySql DB";
	@Override
	public void select() {
		System.out.println(MYSQL_DB + "에서 검색");
	}
	@Override
	public void insert() {
		System.out.println(MYSQL_DB + "에 삽입");
	}
	@Override
	public void update() {
		System.out.println(MYSQL_DB + "를 수정");
	}
	@Override
	public void delete() {
		System.out.println(MYSQL_DB + "에서 삭제");
	}
}

public class DaoExample {
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}
}