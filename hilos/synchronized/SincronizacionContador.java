
class SincronizacionContador{
	void contar(){
		try{
			for(int i=1; i<4; i++){
				System.out.println(Thread.currentThread().getName() + i);
				Thread.sleep(1200);
			}
		}catch(InterruptedException ex){
			System.out.println(ex);
		}
	}	
}