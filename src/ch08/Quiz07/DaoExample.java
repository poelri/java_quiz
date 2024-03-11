package ch08.Quiz07;

public class DaoExample {
    public static void dbWork(DataAccessObject dao) {
        System.out.println(dao.select());
        System.out.println(dao.insert());
        System.out.println(dao.update());
        System.out.println(dao.delete());


    }

    public static void main(String[] args) {
        dbWork(new MySqlDao());
        dbWork(new OracleDao());

    }
}


