package classes;

import java.util.ArrayList;
import java.util.List;

public class Pilha<T> {
	private List<T> itens = new ArrayList<>();

	@Override
	public String toString() {
		return "Pilha [itens=" + itens + "]";
	}

	public void add(T token) {
		int idx = itens.size() == 0 ? 0 : itens.size();
		itens.add(idx, token);
	}

	public T remove() {
		int idx = itens.size() == 0 ? 0 : itens.size() -1;
		return itens.remove(idx);
	}
}
