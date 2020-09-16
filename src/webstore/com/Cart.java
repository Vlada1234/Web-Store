package webstore.com;

public class Cart {
	private Article article;

	public Cart(Article article) {
		super();
		this.article = article;
	}

	@Override
	public String toString() {
		return "Cart [article=" + article + "]";
	}
	
	

	
}


