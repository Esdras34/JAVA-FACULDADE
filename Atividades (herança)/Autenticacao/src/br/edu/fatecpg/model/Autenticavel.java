package br.edu.fatecpg.model;

public interface Autenticavel {
	boolean login(String usuario, String senha);
	void logout();

}
