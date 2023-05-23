package hopital;

import java.util.ArrayList;
//import java.util.EmptyStackException;
import java.util.List;


public class FilaLeve {
	private List<Paciente> pilha = new ArrayList<Paciente>();
		
		public void push(Paciente t) {
			pilha.add(t);
		}
		public int size() {
			return pilha.size();
		}
		public boolean isEmpty() {
			return pilha.isEmpty();
		}
		
		public Paciente pop() {
			if(isEmpty()) {
				//throw new EmptyStackException();
				return null;
			}
			return pilha.remove(size()-1);
		}
		public Paciente top() {
			if(isEmpty()) {
				System.out.print("Nenhum Paciente");
				//throw new EmptyStackException();
				return null;
			}
			return pilha.get(size()-1);
		}
}