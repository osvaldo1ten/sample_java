public class Ferrari implements Vehicle{

	@Override
	public void virarEsquerda() {
		System.out.println("Ferrari virou � esquerda");
	}

	@Override
	public void virarDireita() {
		System.out.println("Ferrari virou � direita");
	}

	@Override
	public void acelerar() {
		System.out.println("Ferrari acelerou. Uhuuuuuu");
	}

	@Override
	public void frear() {
		System.out.println("Ferrari freou");		
	}

	@Override
	public void seguirEmFrente() {
		System.out.println("Ferrari est� seguindo em frente");
	}

}
