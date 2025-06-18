import java.util.Scanner;



public class Main{
	public static void main(String[] args) {
	 
	 String cliente;
	 String menu;
	 int avaliaçao;  
	 int opcao;
	 String digiti;
	 
	Scanner sc = new Scanner (System.in);
	System.out.println("ola,bom dia ");
	
	System.out.println("qual é o seu nome ?");
	cliente=sc.nextLine();
	
	System.out.println(" prazer " + cliente);
	
	System.out.println("o que deseja ? menu , pedir ");
	
	menu=sc.nextLine();
	
	
	switch(menu){
	
	case "menu" :
	    System.out.println("digiti 1 coca-cola, ");
	    System.out.println("digiti 2 hamburgue ");
	    System.out.println("digiti 3 pizza");
	    System.out.println("digiti 4 batata ");
	    opcao=sc.nextInt();
	    
	    switch(opcao){
	        case 1:
	             System.out.println( " voce escolheu coca-cola ");
	             break;
	         case 2:
	             System.out.println( " voce escolheu hamburgue ");
	             break;
	              case 3:
	             System.out.println( " voce escolheu pizza");
	             break;
	              case 4:
	             System.out.println( " voce escolheu batata ");
	             break;
	    }
	    break;
	    
    case "pedir":
        
	    System.out.print("digiti seu pedido");
	    digiti=sc.nextLine();
	    break;
	   
	    
	}
	    
	    System.out.println(" qual a sua avaliaçao? de 0 a 10 ");
	avaliaçao= sc.nextInt();
	
	}

}