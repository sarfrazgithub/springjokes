package spring.learnings.SpringJokesApp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesInterfaceImpl implements JokesInterface {

   private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesInterfaceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }


    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
