package Principle;
 
public class SingleResponsibility1 {

	public static void main(String[] args) {
       
		Database  db=new Database();
		db.connect_do("sql");
		db.connect_do("mysql");
		db.connect_do("oracle");
		 
	}

}

  class   Database{
	public   void connect_do(String  dbtype){
	     System.out.println(dbtype+"...do something");
	}
}