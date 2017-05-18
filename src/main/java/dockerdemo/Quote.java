package dockerdemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;

@Entity
@NamedQuery(
        name="Quote.findRandom",
        query="select q from Quote q order by random()"
)
@SequenceGenerator(name="seq_quote", initialValue=1, allocationSize=1,sequenceName="SEQ_QUOTE")
public class Quote {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_quote")
    private Long id;
    private String author;
    private String quote;

    protected Quote() {}

    public Quote(String quote, String author) {
        this.quote = quote;
        this.author = author;
    }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

    @Override
    public String toString() {
        return String.format(
                "Quote[id=%d, quote='%s', author='%s']",
                id, quote, author);
    }
}