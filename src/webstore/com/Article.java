package webstore.com;

public class Article {
	
    private ArticleCategory articleCategory;
	private double articlePrice;
	private int articleCode;
	private String articleName;
	private String articleDescription;

	public Article(ArticleCategory articleCategory, String articleName, double articlePrice, int articleCode,  String articleDescription) {
		super();
		this.articlePrice = articlePrice;
		this.articleCode = articleCode;
		this.articleName = articleName;
		this.articleDescription = articleDescription;
		this.articleCategory = articleCategory;
	}

	public double getArticlePrice() {
		return articlePrice;
	}

	public void setArticlePrice(int articlePrice) {
		this.articlePrice = articlePrice;
	}

	public double getArticleCode() {
		return articleCode;
	}

	public void setArticleCode(int articleCode) {
		this.articleCode = articleCode;
	}

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public String getArticleDescription() {
		return articleDescription;
	}

	public void setArticleDescription(String articleDescription) {
		this.articleDescription = articleDescription;
	}

	public ArticleCategory getArticleCategory() {
		return articleCategory;
	}

	public void setArticleCategory(ArticleCategory articleCategory) {
		this.articleCategory = articleCategory;
	}

	@Override
	public String toString() {
		return "Article [articleCategory=" + articleCategory + ", articlePrice=$" + articlePrice + ", articleCode="
				+ articleCode + ", articleName=" + articleName + ", articleDescription=" + articleDescription + "]";
	}
	
	
	
	
	
	

}
