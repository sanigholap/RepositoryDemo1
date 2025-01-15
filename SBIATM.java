class Company{ 
int compnayID=11;
String companyName="IBM";
String companyAdress="PCMC";

public void displayComapany(){

Company c3=new Company();
System.out.println(c3.compnayID);
System.out.println(c3.companyName);
System.out.println(c3.companyAdress);
}



public void displayemployeeDetils(){

int employeeid=2;
String employeeName="sani";
String deprtmentName="developer";
System.out.println(employeeid);
System.out.println(employeeName);
System.out.println(deprtmentName);
}

public static void main(String[] args){

Company c3 = new Company();
c3.displayemployeeDetils();
c3.displayemployeeDetils();


}

}