package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import interfaces.ValoresITF;

public class Valores implements ValoresITF {

	static List<Integer> valores = new ArrayList<>();

	@Override
	public boolean ins(int v) {
		valores.add(v);
		return true;
	}

	@Override
	public int del(int i) {
		int valorRetorno = valores.get(i);
		return valores.remove(valorRetorno);
	}

	@Override
	public int size() {
		return valores.size();
	}

	@Override
	public double mean() {
		double retorno = 0;
		for(Integer valor : valores) {
			retorno += valor;
		}
		return retorno / valores.size();
	}

	@Override
	public int lower() {
		Collections.sort(valores);
		return valores.get(0);
	}

	@Override
	public int greater() {
		Collections.sort(valores);
		return valores.get(valores.size() -1);
	}
}
