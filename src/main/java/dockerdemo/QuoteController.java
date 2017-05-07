package dockerdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {

    @Autowired
    private QuoteService quoteService;

    @RequestMapping("/quote/{id}")
    public Quote quote(@PathVariable(value="id") Long id) {
        return quoteService.getQuoteById(id);
    }
    
    @RequestMapping("/quote")
    public Quote quote() {
        return quoteService.getRandomQuote();
    }
    
    @PostMapping("/quote")
    public void create(@RequestBody final Quote quote){
        quoteService.addQuote(quote);
    }
    
    
}