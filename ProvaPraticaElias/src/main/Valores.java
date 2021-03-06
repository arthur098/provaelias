package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import interfaces.ValoresITF;

public class Valores implements ValoresITF {

	private List<Integer> valores = new ArrayList<>();

	@Override
	public boolean ins(int v) {
		if (v > 0 && valores.size() < 10) {
			valores.add(v);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int del(int i) {
		if (valores.size() > i) {
			return valores.remove(i);
		} else {
			return -1;
		}
	}

	@Override
	public int size() {
		return valores.size();
	}

	@Override
	public double mean() {
		if (valores.size() > 0) {
			double retorno = 0;
			for (Integer valor : valores) {
				retorno += valor;
			}
			return retorno / valores.size();
		} else {
			return 0;
		}

	}

	@Override
	public int lower() {
		if (valores.size() > 0) {
			Collections.sort(valores);
			return valores.get(0);
		} else {
			return -1;
		}
	}

	@Override
	public int greater() {
		if (valores.size() > 0) {
			Collections.sort(valores);
			return valores.get(valores.size() - 1);
		} else {
			return -1;
		}
	}
}
