package com.cachoeira.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {

	void valorAlterado(String novoValor);
}
