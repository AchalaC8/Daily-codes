import java.util.*;

class Buses{
    String busName;
    String from;
    String to;
    int total_seat;
    
    Buses(String busName,String from,String to,int total_seat){
        this.busName=busName;
        this.from=from;
        this.to=to;
        this.total_seat=total_seat;
    }
}

class Passenger{
    int id;
    String name;
    int seats;
    String bus_name;
    
    Passenger(int id,String name,int seats,String bus_name){
        this.id=id;
        this.name=name;
        this.seats=seats;
        this.bus_name=bus_name;
    }
}

class GsssBus{
    ArrayList<String> searchBuses(Buses[] list, Scanner sc){
        System.out.print("Enter the Destination place: ");
        String to_place=sc.next();
        ArrayList<String> ab=new ArrayList<>();
        for(int i=0;i<list.length;i++){
            if(to_place.equalsIgnoreCase(list[i].to)){
                ab.add(list[i].busName);
            }
        }
        return ab;
    }
}

public class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    Buses[] list=new Buses[5];
	    list[0]=new Buses("Bus_no_1","Mysore","Bangalore",20);
	    list[1]=new Buses("Bus_no_2","Mysore","Udupi",12);
	    list[2]=new Buses("Bus_no_3","Mysore","Chennai",10);
	    list[3]=new Buses("Bus_no_4","Mysore","Andhra",30);
	    list[4]=new Buses("Bus_no_5","Mysore","Bangalore",25);
	    
	    GsssBus obj=new GsssBus();
		System.out.println("Welcome to GSSS Bus Services");
		System.out.println("------------------------------");
		System.out.println("Enter 1 to Search buses");
		System.out.println("Enter 2 to Check seat availability");
		System.out.println("Enter 3 to Book a ticket");
		System.out.println("Enter 4 to view Bookings");
		System.out.println("Enter 5 to exit");
		System.out.println("------------------------------");
		ArrayList<String> ab=new ArrayList<>();
		ArrayList<Passenger> details=new ArrayList<>();
		System.out.print("Enter the choice: ");
		int choice =sc.nextInt();
		int id=1000;
		while(choice!=5){
    		if(choice==1){
    		    ab=obj.searchBuses(list,sc);
    		    System.out.println("Available Buses are: ");
    		    System.out.println(ab);
    		}else if(choice==2){
    		    System.out.println("available seats are: ");
    		    for(int j=0;j<ab.size();j++){
        		    for(int i=0;i<list.length;i++){
        		        if((list[i].busName).equals(ab.get(j))){
        		            System.out.println(list[i].busName+" "+list[i].total_seat);
        		        }
        		    }
    		    }
    		}else if(choice==3){
    		    System.out.print("Enter the bus name: ");
    		    String bn=sc.next();
    		    System.out.print("Enter the number of tickets: ");
    		    int n=sc.nextInt();
    		    
    		    for(int i=0;i<list.length;i++){
    		        if((bn.equalsIgnoreCase(list[i].busName) && (list[i].total_seat)>=n) ){
    		            System.out.print("Enter the Passenger name: ");
    		            String pn=sc.next();
    		            details.add(new Passenger(id,pn,n,list[i].busName));
    		            id++;
    		            list[i].total_seat-=n;
    		            System.out.println("Tickets Successfully Booked");
    		        }
    		    }
    		    
    		}
    		else if(choice==4){
    		    
    		    for(int i=0;i<details.size();i++){
    		        System.out.println((details.get(i)).id+" "+(details.get(i)).name+" "+(details.get(i)).bus_name+" "+(details.get(i)).seats);
    		    }
    		}
    		System.out.println("------------------------------");
    		System.out.println("Enter 1 to Search buses");
    		System.out.println("Enter 2 to Check seat availability");
    		System.out.println("Enter 3 to Book a ticket");
    		System.out.println("Enter 4 to view Bookings");
    		System.out.println("Enter 5 to exit");
    		System.out.println("------------------------------");
    		System.out.print("Enter the choice: ");
    		choice =sc.nextInt();
		}
		System.out.println("Thankyou for bookings");
	}
}
