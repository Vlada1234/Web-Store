package webstore.com;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		User user = new User("Vlada", "Zivkovic", 600);
		
        Article article = new Article(ArticleCategory.TECHNOLOGY, "TV", 250, 100, "HD TV 4K Resolution, LED TV, COLOR: Black");
        Article article2 = new Article(ArticleCategory.JEWELRY, "Necklace", 150, 232, "Golden Necklace");
        Article article3 = new Article(ArticleCategory.TECHNOLOGY, "TV", 300, 100, "HD TV 4K Resoultion, Smart TV, COLOR: Grey ");
        Cart art = new Cart(article);
        Cart art2 = new Cart(article2);
        
        List<User> usersList = new ArrayList<>();
        usersList.add(user);
 		
		List<Cart> listOfItemsInCart = new ArrayList<>();
		
		
		List<Article> listOfArticles = new ArrayList<>();
		listOfArticles.add(article);
		listOfArticles.add(article2);
		listOfArticles.add(article3);
		
		
		WebStore store = new WebStore(listOfArticles, usersList, listOfItemsInCart, user, article );
		store.setCart(listOfItemsInCart);
		store.setArticles(listOfArticles);
		store.addArticleToCart(art);
		store.addArticleToCart(art2);
		store.setUsers(usersList);
		//System.out.println(listOfItemsInCart);
		store.articlesPerCategory();
		

	}

}
