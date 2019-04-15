package br.com.github.jcestaro.testes.Builder;

public class Lanche {

	private String pao;
	private int quantidadeHamburguer;
	private boolean queijo;
	private boolean bacon;
	private boolean alface;
	private boolean tomate;

	private Lanche (Builder builder){
		pao = builder.pao;
		queijo = builder.queijo;
		bacon = builder.bacon;
		alface = builder.alface;
		tomate = builder.tomate;
		quantidadeHamburguer = builder.hamburguer;
	}

	public static class Builder {
		private final String pao;

		private int hamburguer;
		private boolean queijo;
		private boolean bacon;
		private boolean alface;
		private boolean tomate;

		public Builder(String pao){
			this.pao = pao;
		}

		public Builder hamburguer (int quantidade){
			this.hamburguer = quantidade;
			return this;
		}

		public Builder queijo (boolean queijo){
			this.queijo = queijo;
			return this;
		}
		public Builder bacon (boolean bacon){
			this.bacon = bacon;
			return this;
		}
		public Builder alface (boolean alface){
			this.alface = alface;
			return this;
		}
		public Builder tomate (boolean tomate){
			this.tomate = tomate;
			return this;
		}

		public Lanche build() {
			return new Lanche(this);
		}
	}

	@Override
	public String toString() {
		return "Lanche - " +
				"Pão: " + pao +
				", Hamburguer: " + quantidadeHamburguer +
				", Queijo: " + queijo +
				", Bacon: " + bacon +
				", Alface: " + alface +
				", Tomate: " + tomate;
	}
}
