package dockerdemo;

public interface QuoteService {

	Quote getQuoteById(Long id);
	
	Quote getRandomQuote();

	void addQuote(Quote quote);

}
