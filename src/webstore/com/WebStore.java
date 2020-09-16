package webstore.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class WebStore {
	private User user;
	private Article article;
	private List<Article> articles = new ArrayList<>();
	private List<User> users = new ArrayList<>();
	private List<Cart> cart = new ArrayList<>();
	private double totalMoneyEarned;

	public WebStore(List<Article> articles, List<User> users, List<Cart> cart, User user, Article article) {
		super();
		this.user = user;
		this.article = article;
		this.articles = articles;
		this.users = users;
		this.cart = cart;
		this.totalMoneyEarned = 0;
	}

	public List<Cart> getCart() {
		return cart;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public void setCart(List<Cart> cart) {
		this.cart = cart;
	}

	public void addArticleToCart(Cart article) {
		cart.add(article);
	}

	public void removeArticleFromCart(Cart article) {
		cart.remove(article);
	}

	public double getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	public void articlesPerCategory() {
		Map<Article, Integer> categoryCount = new HashMap<Article, Integer>();

		for (Article article : articles) {
			if (categoryCount.containsKey(article.getArticleCategory().TECHNOLOGY)) {
				categoryCount.put(article, categoryCount.get(article.getArticleCategory().TECHNOLOGY) + 1);
			} else {
				categoryCount.put(article, 1);
			}

		}
		for (Entry<Article, Integer> entry : categoryCount.entrySet()) {
			System.out.println("key :" + entry.getKey() + " , value : " + entry.getValue());
		}

	}

	public void Buy() {
		if (user.getMoneyBalance() > article.getArticlePrice()) {
			System.out.println("successful payment");
			cart.clear();
		} else {
			System.out.println("You dont have enough funds");
		}
	}

	@Override
	public String toString() {
		return "WebStore " + " cart=" + cart;
	}

}
