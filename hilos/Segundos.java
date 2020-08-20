
package classes;

public class Segundos implements Runnable{

    private Thread segundos;

	public Segundos(){
		segundos = new Thread(this, "segundos");
		segundos.start();
	}
	
	@Override
	public void run(){
		try {
    		while (true){
    			for (int s=1; s<10; s++){
					System.out.println(s);
					Thread.sleep(1000);
				}
    		}
		}catch (InterruptedException ex) {
			System.out.println("Error: " + ex);
		}
	}
    
    
}