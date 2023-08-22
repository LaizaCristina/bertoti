public class Teste {
	public static void main(String[] args) {

		public void addObserver(Observer ob){
			observers.add(ob)
		}

		public void notify(){
			for(Observer ob: observers){
			ob.update(leitosComuns, leitosVIPs, leitosTotal);
			}
		}
	}
}