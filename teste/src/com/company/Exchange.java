package com.company;

import java.util.ArrayList;
import java.util.List;

public class Exchange {
    List <List> exchange = new ArrayList<>();
    List <Integer> bestExchange = new ArrayList<>();
    List <Integer> oneCentsExchange = new ArrayList<>();
    List <Integer> fiveCentsExchange = new ArrayList<>();
    List <Integer> onlyFiveCentsExchange = new ArrayList<>();


    private List<List> calcExchange(Integer number){
        Integer resto = 0;
        Integer twentyFiveCents = (int) Math.floor(number/25);
        resto = number%25;

        Integer tenCents = (int) Math.floor(resto/10);
        resto = resto%10;

        Integer fiveCents = (int) Math.floor(resto/5);
        resto = resto%5;

        Integer oneCents = resto;

        bestExchange.add(twentyFiveCents);
        bestExchange.add(tenCents);
        bestExchange.add(fiveCents);
        bestExchange.add(oneCents);
        exchange.add(bestExchange);

        return exchange;
    }

    private List<List> oneCentsExchange(Integer number){

        oneCentsExchange.add(0);
        oneCentsExchange.add(0);
        oneCentsExchange.add(0);
        oneCentsExchange.add(number);
        exchange.add(oneCentsExchange);

        return exchange;
    }

    private List<List> fiveCentsExchange(Integer number){
        fiveCentsExchange.add(0);
        fiveCentsExchange.add(0);
        fiveCentsExchange.add(1);
        fiveCentsExchange.add(number - 5);
        exchange.add(fiveCentsExchange);

        return exchange;
    }

    private List<List> onlyFiveCentsExchange(Integer number){
        Integer fiveCents = (int) Math.floor(number/5);
        Integer oneCents = number%5;

        onlyFiveCentsExchange.add(0);
        onlyFiveCentsExchange.add(0);
        onlyFiveCentsExchange.add(fiveCents);
        onlyFiveCentsExchange.add(oneCents);
        exchange.add(onlyFiveCentsExchange);

        return exchange;

    }

    public void makeChange(Integer number){
        oneCentsExchange(number);
        fiveCentsExchange(number);
        onlyFiveCentsExchange(number);
        calcExchange(number);

        System.out.println(exchange);
    }
}
