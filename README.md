# dockerDemo
Quick Docker Demo for Continuum

launch with: mvn spring-boot:run

To add a new quote make a POST request to http://localhost:8080/quote with a JSON body like:

{
  "author": "Homer Simpson",
  "quote": "Trying is the first step towards failure."
}