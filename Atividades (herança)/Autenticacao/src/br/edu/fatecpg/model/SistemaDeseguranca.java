package br.edu.fatecpg.model;

public class SistemaDeseguranca implements Autenticavel{
	public	static final String usuario = "admin";
	public  static final String senha = "1234";
	private boolean autenticado = false;
	
	
	public boolean login(String usuario, String senha) {
		if(usuario .equals(usuario) && senha.equals(senha)) {
			autenticado = true;
			System.out.println("autenticado!");
			return true;
		}
		else {
			System.err.println("autenticação negada!");
			return false;
		}
	
	}
	public void logout() {
		autenticado = false;
		System.out.println("logout raalizado com sucesso!");
		
	}
	 public boolean isAutenticado() {
	        return autenticado;
	
	 }

}
