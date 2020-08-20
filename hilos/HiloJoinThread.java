
class HiloJoinThread extends Thread{
	
	public HiloJoinThread(String nombre){
		super(nombre);
		//start(); 
	}
	
	@Override
	public void run(){
		try {
    		for (int i = 0; i<6; i++){
    			System.out.println(this.getName());
    			Thread.sleep(1000);
    		}
		}catch (InterruptedException ex) {
			System.out.println("Error: " + ex);
		}
	}
}