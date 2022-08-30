package academy.learnprogramming.config;

import academy.learnprogramming.GuessCount;
import academy.learnprogramming.MaxNumber;
import academy.learnprogramming.MinNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "academy.learnprogramming")
@PropertySource("classpath:config/game.properties")
public class GameConfig {

    // == fields ==
    @Value("${game.maxNumber}")
    private int maxNumber;

    @Value("${game.guessCount}")
    private int guessCount;

    @Value("${game.minNumber}")
    private int minNumber;

    // == bean methods ==
    @Bean
    @MaxNumber
    public int getMaxNumber(){
        return maxNumber;
    }

    @Bean
    @GuessCount
    public int getGuessCount(){
        return guessCount;
    }

    @Bean
    @MinNumber
    public int getMinNumber(){
        return minNumber;
    }

}
