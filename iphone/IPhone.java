package iphone;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	public static void main(String[] args) {
		IPhone meuIphone = new IPhone();

		System.out.println("######REPRODUTOR MUSICAL.#######");
		meuIphone.reproduzirMusica();
		meuIphone.pausarMusica();
		meuIphone.avancarMusica();
		meuIphone.retrocederMusica();

		System.out.println("#######APARELHO TELEFÔNICO######.");
		meuIphone.fazerChamada(null);
		meuIphone.receberChamada(null);
		meuIphone.encerrarChamada();

		System.out.println("#######NAVEGADOR INTERNET######");
		meuIphone.abrirURL(null);
		meuIphone.voltarPagina();
		meuIphone.avancarPagina();
		meuIphone.atualizarPagina();

	}

	@Override
	public void reproduzirMusica() {
		System.out.println("Reproduzindo música...");
	}
	@Override
	public void pausarMusica() {
		System.out.println("Pausando música...");
	}
	@Override
	public void avancarMusica() {
		System.out.println("Avanando música...");
	}
	@Override
	public void retrocederMusica() {
		System.out.println("Retroceder música...");
	}

	@Override
	public void fazerChamada(String numero) {
		System.out.println("Fazendo chamada...");
	}
	@Override
	public void receberChamada(String numero) {
		System.out.println("Recebendo chamada...");
	}
	@Override
	public void encerrarChamada() {
		System.out.println("Chamada encerrada.");
	}
	@Override
	public void abrirURL(String url) {
		System.out.println("Abrindo navegador...");
	}
	@Override
	public void voltarPagina() {
		System.out.println("Voltar página...");
	}
	@Override
	public void avancarPagina() {
		System.out.println("Avançar página...");

	}
	@Override
	public void atualizarPagina() {
		System.out.println("Atualizar página...");
	}
}
