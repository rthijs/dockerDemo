package dockerdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuoteServiceImpl implements QuoteService {
	
	@Autowired
	private QuoteRepository quoteRepository;

	@Override
	public Quote getQuoteById(Long id) {
		return quoteRepository.findOne(id);
	}

	@Override
	public Quote getRandomQuote() {
		System.out.println("number of quotes in resultset: " + quoteRepository.findFirstRandom().size());
		return quoteRepository.findFirstRandom().get(0);
	}

	@Override
	public void addQuote(Quote quote) {
		quoteRepository.save(quote);
	}
	
	
}
