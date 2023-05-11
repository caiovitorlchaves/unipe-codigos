package classes;

import java.util.ArrayList;
import java.util.List;

public class Deque<T> {

	private List<T> itens = new ArrayList<>();

	@Override
	public String toString() {
		return "Deque [itens=" + itens + "]";
	}

	public void addPrimeiro(T token) {
		itens.add(0, token);
	}

	public void addUltimo(T token) {
		int idx = itens.size() == 0 ? 0 : itens.size();
		itens.add(idx, token);
	} 

	public T removePrimeiro() {
		return itens.remove(0);
	}

	public T removeUltimo() {
		int idx = itens.size() == 0 ? 0 : itens.size() -1;
		return itens.remove(idx);
	}
}
