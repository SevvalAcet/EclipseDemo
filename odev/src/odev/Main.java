package odev;

public class Main {

	public static void main(String[] args) {
	  Courses course1 = new Courses(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp�(C# + ANGULAR)", "Engin demiro�" ,"2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.");
	
	  Courses course2 = new Courses();
	  course2.id = 2; 
	  course2.name = "Yaz�l�m Geli�tirici Yeti�tirme Kamp�(JAVA + REACT)";
	  course2.teacher = "Engin demiro�";

	  
	  Courses course3 = new Courses();
	  course3.id = 3; 
	  course3.name = "Programlamaya Giri� Temel Kurs";
	  course3.teacher = "Engin demiro�";
	  course3.detail ="PYTHON, JAVA, C# gibi t�m programlama dilleri i�in temel programlama mant���n� anla��l�r �rneklerle ��renin.";
	  
	  
	  Courses[] kurslar = {course1,course2,course3};
	       for(Courses ders : kurslar) {
	    	   System.out.println(ders.name);
	       }
	  
	  
	 System.out.println("-------------------------------------");     
	 Category category1 = new Category();
	 category1.id =1;
	 category1.name="Kurslar�m";
			 
	 Category category2 = new Category();
	 category2.id =2;
	 category2.name= "T�m Kurslar";
	 
	 Category category3 = new Category();
	 category3.id =3;
	 category3.name="Kampa Haz�rl�k";
	 
	 Category category4 = new Category();
	 category4.id =4;
	 category4.name= "S�k Sorulan Sorular";
	
	 
	 Category[] kategoriler = {category1,category2,category3,category4};
     for(Category kategori : kategoriler) {
  	   System.out.println(kategori.name);
     }	
     
     System.out.println("----------------------------------------");		      
     ProductManager productManager = new ProductManager();
     productManager.signUpForFree(course1);
     productManager.signUpForFree(course2);
     productManager.signUpForFree(course3);
     
     System.out.println("----------------------------------------");		      
     ProductManager2 productManager2 = new ProductManager2();
     productManager2.start(course1);
     productManager2.start(course2);
     productManager2.start(course3);
     
     
     
     
     
     
     
     
     
     
     
     
     
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	  
	  
	}

}
